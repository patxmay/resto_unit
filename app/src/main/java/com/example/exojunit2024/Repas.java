package com.example.exojunit2024;

import java.util.ArrayList;

public class Repas {
    private ArrayList<Plat> lesPlats;
    private Categorie uneCategorie;

    public Repas() {

        lesPlats = new ArrayList<Plat>();
       }

    public ArrayList<Plat> getLesPlats() {
        return lesPlats;
    }

    public void setLesPlats(ArrayList<Plat> lesPlats) {
        this.lesPlats = lesPlats;
    }

    public Categorie getUneCategorie() {
        return uneCategorie;
    }

    public double calculCoutTotal(){
        double reduc = 1;
        double total=0;
            for(Plat unPlat : this.getLesPlats()){
                total=total+unPlat.getPrix()/this.getUneCategorie().getReduc();
            }

            if(this.getLesPlats().size()>4 && this.getLesPlats().size()<10){
                reduc=0.95;
            }
            if(this.getLesPlats().size()>=10){
                reduc=0.9;
            }

        return total*reduc;
    }

    public void setUneCategorie(Categorie uneCategorie) {
        this.uneCategorie = uneCategorie;
    }
}
