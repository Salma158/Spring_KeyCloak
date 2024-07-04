package com.example.auth2.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class DemoController {


    @GetMapping("/items")
    public ResponseEntity<String> getItems(){
        return ResponseEntity.ok("here are the fetched items ...");
    }

    @PostMapping("/items")
    public ResponseEntity<String> addItem(){
        return ResponseEntity.ok("Item persisted successfully ...");
    }

    @GetMapping("/products")
    public ResponseEntity<String> getProducts(){
        return ResponseEntity.ok("here are the fetched products ...");
    }

}
