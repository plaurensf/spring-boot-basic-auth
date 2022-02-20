package laurens.poc.springsecuritybasicauth.entities;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    private Long id;
    private String name;
    private Float price;

}
