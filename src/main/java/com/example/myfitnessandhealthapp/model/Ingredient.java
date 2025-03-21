package com.example.myfitnessandhealthapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ingredientid;
    private String name;
    private double protein;
    private double carbs;
    private double fat;
    private double kcal;

    public Ingredient(String name, double protein,double carbs,double fat,double kcal) {
        this.name = name;
        this.protein = protein;
        this.carbs = carbs;
        this.fat = fat;
        this.kcal = kcal;
    }

    public double getCarbsPr() {
        return carbs;
    }

    public void setCarbsPr(double carbsPr) {
        this.carbs = carbsPr;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public int getIngredientid() {
        return ingredientid;
    }

    public void setIngredientid(int ingredientid) {
        this.ingredientid = ingredientid;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
}
