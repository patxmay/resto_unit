package com.example.exojunit2024;

public class Plat {
    private String nomP;
    private int caloriesP;
    private double prix;
    private TypePlat leType;

    public Plat(){
        this.nomP = "";
    }

    public Plat(String nomP, int caloriesP) {
        this.nomP = nomP;
        this.caloriesP = caloriesP;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public int getCaloriesP() {
        return caloriesP;
    }

    public void setCaloriesP(int caloriesP) {
        this.caloriesP = caloriesP;
    }

    public TypePlat getLeType() {
        return leType;
    }

    public void setLeType(TypePlat leType) {
        this.leType = leType;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Plat{" +
                "nomP='" + nomP + '\'' +
                ", caloriesP=" + caloriesP +
                '}';
    }
}
