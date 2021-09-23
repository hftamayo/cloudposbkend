package com.devskodigo.cloudposbkend;

import static org.apache.commons.lang3.RandomStringUtils.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.devskodigo.cloudposbkend.models.Product;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ProductTest {
    private static final String PRODUCT_API_ROOT = "http://localhost:8081/api/products";

    private Product createRandomProduct(){
        Product product = new Product();
        product.setName(randomAlphabetic(200));
        product.setPrice(Double.parseDouble(randomNumeric(20)));
        return product;
    }

    private String createProductasUri(Product product){
        Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(product)
                .post(PRODUCT_API_ROOT);
        return PRODUCT_API_ROOT + "/"+response.jsonPath().get("id");
    }

    @Test
    public void whenGetAllProducts_thenOK(){
        Response response = RestAssured.get(PRODUCT_API_ROOT);

        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
    }

    @Test
    public void whenGetProductsByName_thenOK(){
        Product product = createRandomProduct();
        createProductasUri(product);
        Response response = RestAssured.get(PRODUCT_API_ROOT + "/product/" + product.getName());

        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
        assertTrue(response.as(List.class).size() > 0);
    }

    @Test
    public void whenGetCreateProductById_thenOK(){
        Product product = createRandomProduct();
        String location = createProductasUri(product);
        Response response = RestAssured.get(location);

        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
        assertEquals(product.getName(), response.jsonPath().get("name"));
    }

    @Test
    public void whenGetNotExistProductById_thenNotFound(){
        Response response = RestAssured.get(PRODUCT_API_ROOT + "/" + randomNumeric(4));
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatusCode());
    }

    @Test
    public void whenCreateProduct_thenCreated(){
        Product product = createRandomProduct();
        Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(product)
                .post(PRODUCT_API_ROOT);
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatusCode());
    }

    @Test
    public void whenUpdateCreatedProduct_thenUpdated(){
        Product product = createRandomProduct();
        String location = createProductasUri(product);
        product.setId( Integer.parseInt(location.split("api/products")[1]));
        product.setName("newName");
        Response response = RestAssured.given()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(product)
                .put(location);

        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
        assertEquals("newName", response.jsonPath().get("name"));
    }

    @Test
    public void whenDeleteCreatedProduct_thenOk(){
        Product product = createRandomProduct();
        String location = createProductasUri(product);
        Response response = RestAssured.delete(location);

        assertEquals(HttpStatus.OK.value(), response.getStatusCode());
        response = RestAssured.get(location);
        assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatusCode());
    }
}
