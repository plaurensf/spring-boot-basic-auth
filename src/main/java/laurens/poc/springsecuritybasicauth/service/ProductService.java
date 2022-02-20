package laurens.poc.springsecuritybasicauth.service;

import laurens.poc.springsecuritybasicauth.entities.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ProductService {

    public List<Product> getProducts(){
        List<Product> productList = new ArrayList<>();

        productList.add(Product.builder()
                .id(1L)
                .name("Jabón")
                .price(1200f)
                .build());

        return productList;
    }

}
