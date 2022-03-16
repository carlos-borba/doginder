package com.colab.doginder.repository;

import com.colab.doginder.model.entity.Pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{
    
}
