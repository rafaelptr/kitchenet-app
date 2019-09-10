package br.com.fiap.kitchenet.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.kitchenet.domain.Product;
import br.com.fiap.kitchenet.interfaces.ProductService;

@RestController
public class ProductsController {      

    private final ProductService service;
    
    @Autowired
    private ProductsController(final ProductService service){
        this.service = service;
    }

    @RequestMapping("/api/v1/products")
    public List<Product> listProducts() {
        return service.list();
    }  
}