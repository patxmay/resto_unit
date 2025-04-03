package com.example.exojunit2024;

public class TypePlat {
    private String libelleType;

    public TypePlat(String libelleType) {
        this.libelleType = libelleType;
    }

    public String getLibelleType() {
        return libelleType;
    }

    public void setLibelleType(String libelleType) {
        this.libelleType = libelleType;
    }

    public String toString() {
        return "TypePlat{" +
                "libelleType='" + libelleType + '\'' +
                '}';
    }
}

