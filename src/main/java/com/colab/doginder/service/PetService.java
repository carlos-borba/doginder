package com.colab.doginder.service;

import com.colab.doginder.model.entity.Pet;
import com.colab.doginder.repository.PetRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class PetService {

    @Autowired
    private PetRepository petRepository;

    public PetService() {
        
    }

    public Pet insert(Pet pet) {
        petRepository.save(pet);
        return pet;
    }



    

}
