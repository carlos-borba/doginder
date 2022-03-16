package com.colab.doginder.model.entity;

// @Entity
public class Pet {
    
    private long id;
    private String specie;
    private String breed;
    private String size;
    private String description;
    private String name;
    private int age;
    private String tutor;
    private String gender;

    public Pet() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getSpecie() {
        return specie;
    }
    
    public void setSpecie(String specie) {
        this.specie = specie;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getTutor() {
        return tutor;
    }
    
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
