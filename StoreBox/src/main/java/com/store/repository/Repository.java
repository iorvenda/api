package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entity.ReceivedItem;

public interface Repository extends JpaRepository<ReceivedItem, Integer> 
{
    
}
