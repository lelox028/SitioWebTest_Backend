package com.example.SitioWebTestBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item updateItem(int id, Item updatedItem) {
        Optional<Item> optionalItem = itemRepository.findById(id);
        if (optionalItem.isPresent()) {
            Item existingItem = optionalItem.get();
            existingItem.setName_Items(updatedItem.getName_Items());
            existingItem.setStatus_Items(updatedItem.getStatus_Items());
            return itemRepository.save(existingItem);
        } else {
            throw new RuntimeException("Item not found with ID: " + id);
        }
    }
}
