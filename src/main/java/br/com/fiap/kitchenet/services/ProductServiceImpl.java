package br.com.fiap.kitchenet.services;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.kitchenet.domain.Product;
import br.com.fiap.kitchenet.interfaces.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> list() {
        return  Arrays.asList(
            new Product(1,"Hamburgão","",5,LocalDateTime.now()),
            new Product(2,"Esfirra","",5,LocalDateTime.now()));
    }}