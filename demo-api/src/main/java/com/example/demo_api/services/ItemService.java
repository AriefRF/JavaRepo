package com.example.demo_api.services;

import com.example.demo_api.models.entities.ItemMaster;
import com.example.demo_api.models.repo.ItemMasterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ItemService {

    @Autowired
    private ItemMasterRepo itemMasterRepo;

    public ItemMaster itemSave(ItemMaster itemMaster){
        return itemMasterRepo.save(itemMaster);
    }

    public ItemMaster findOne(Long id){
        Optional<ItemMaster> item=itemMasterRepo.findById(id);
        if(item.isEmpty()){
            return null;
        }
        return item.get();
    }

    public Iterable<ItemMaster> findAll(){
        return itemMasterRepo.findAll();
    }

    public void deleteOne(Long id){
        itemMasterRepo.deleteById(id);
    }

    public List<ItemMaster> findByDesc(String desc){
        return itemMasterRepo.findByitemdescContains(desc);
    }
}
