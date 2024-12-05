package com.example.SitioWebTestBackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    // Este repositorio ya tiene métodos como findAll() por defecto
}

