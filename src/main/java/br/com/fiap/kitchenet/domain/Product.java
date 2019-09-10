package br.com.fiap.kitchenet.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int idProduct;
    private String name;     
    private String description; 
    private double price;
    private LocalDateTime validity;
}