package com.example.SitioWebTestBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items")
    public List<Item> getItems() {
        return itemService.getAllItems();
    }

    /* @GetMapping("/items")
    public List<Item> getItems() {
        List<Item> items = itemService.getAllItems();
        System.out.println("Items: " + items); // Verifica si se obtienen correctamente
        return items;
    } */

}