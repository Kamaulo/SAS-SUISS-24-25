package com.saslab.model;

public class Recipe {
    private int id;
    private String name;
    private String description;
    private int preparationTime;

    public Recipe(int id, String name, String description, int preparationTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.preparationTime = preparationTime;
    }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setPreparationTime(int preparationTime) { this.preparationTime = preparationTime; }
    
    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public String getDescription() { return this.description; }
    public int getPreparationTime() { return this.preparationTime; }
}