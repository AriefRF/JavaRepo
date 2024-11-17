package com.example.demo_api.controller;

import com.example.demo_api.models.entities.ItemMaster;
import com.example.demo_api.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/item")
public class ItemControl {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ItemMaster create(@RequestBody ItemMaster itemMaster){
        return itemService.itemSave(itemMaster);
    }

    @GetMapping
    public Iterable<ItemMaster> findAll(){
        return itemService.findAll();
    }

    @GetMapping("/{id}")
    public ItemMaster findOne(@PathVariable("id") Long id){
        return itemService.findOne(id);
    }

    @PutMapping
    public ItemMaster ubah(@RequestBody ItemMaster itemMaster){
        return itemService.itemSave(itemMaster);
    }

    @DeleteMapping("/{id}")
    public void hapus(@PathVariable("id") Long id){
        itemService.deleteOne(id);
    }
}