package com.example.SitioWebTestBackend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Items")
public class Item {

    @Id
    private int id_Items;

    private String name_Items;
    private boolean status_Items;

    // Getters y setters
    public int getId_Items() {
        return id_Items;
    }

    public void setId_Items(int id_Items) {
        this.id_Items = id_Items;
    }

    public String getName_Items() {
        return name_Items;
    }

    public void setName_Items(String name_Items) {
        this.name_Items = name_Items;
    }

    public boolean getStatus_Items() {
        return status_Items;
    }

    public void setStatus_Items(boolean status_Items) {
        this.status_Items = status_Items;
    }
}

