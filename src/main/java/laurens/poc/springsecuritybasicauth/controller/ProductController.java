package laurens.poc.springsecuritybasicauth.controller;

import laurens.poc.springsecuritybasicauth.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity getProducts(){
        log.info("Looking for products");
        return ResponseEntity.status(HttpStatus.OK).body(productService.getProducts());
    }



}
