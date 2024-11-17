package com.example.demo_api.models.repo;

import com.example.demo_api.models.entities.ItemMaster;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemMasterRepo extends CrudRepository<ItemMaster, Long> {

    List<ItemMaster> findByitemdescContains(String desc);
    }
