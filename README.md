# Configure and secure REST Endpoint with Basic Auth Exceptions in Spring Boot

In this sample application, we are going to secure an endpoint with Basic authentication in Spring.

Project structure:

```
── pom.xml
── src
    ├── main    
    │   ├─── java
    │   │       └─── laurens
    │   │             └─── poc
    │   │                    └─── springsecuritybasicauth
    │   │                       └─── config
    │   │                              ├─── WebSecurityConfig.java
    │   │                       └─── controller
    │   │                              ├─── ProductController.java
    │   │                       └─── entities
    │   │                              └─── Product.java
    │   │                       ├─── service
    │   │                       │       ├─── ProductService.java
    │   │                       └─── SpringSecurityBasicAuthApplication.java
    │   │
    │   └─── resources
    │           ├─── application.yaml
    │           ├─── static
    │           └─── templates
    │           
```

In this project we learned that:

1. Spring Security provides @WebSecurityConfigurerAdapter class that we can extend in order to config the basic authentication.
2. We can define which resources should be secure.
3. We can configure JWT for manage the authentication.