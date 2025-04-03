package com.example.exojunit2024;

public class Categorie {
    private String nomCateg;
    private double reduc;

    public Categorie(String nomCateg, double reduc) {
        this.nomCateg = nomCateg;
        this.reduc = reduc;
    }

    public String getNomCateg() {
        return nomCateg;
    }

    public void setNomCateg(String nomCateg) {
        this.nomCateg = nomCateg;
    }

    public double getReduc() {
        return reduc;
    }

    public void setReduc(double reduc) {
        this.reduc = reduc;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "nomCateg='" + nomCateg + '\'' +
                ", reduc=" + reduc +
                '}';
    }
}
