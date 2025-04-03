package com.example.exojunit2024;

import java.util.ArrayList;

public class Modele {

    public static ArrayList<Plat> lesPlats = new ArrayList<Plat>();
    public static ArrayList<TypePlat> lesTypesPlats = new ArrayList<TypePlat>();
    public static ArrayList<Categorie> lesCategories = new ArrayList<Categorie>();
    public static ArrayList<Repas> lesRepas = new ArrayList<Repas>();


    public static void init(){
        lesCategories.add(new Categorie("Adulte",1)); // categorie 0
        lesCategories.add(new Categorie("Enfant",0.333333)); // categorie 1
        lesCategories.add(new Categorie("Chomeur",0.5)); // categorie 2


        lesTypesPlats.add(new TypePlat("Viande"));// TypePlat numero 0
        lesTypesPlats.add(new TypePlat("Poisson"));// TypePlat numero 1
        lesTypesPlats.add(new TypePlat("Vegetarien"));// TypePlat numero 2

        Plat unPlat = new Plat("Tournedos de boeuf rossini",600); // plat numéro 0
        unPlat.setLeType(lesTypesPlats.get(0));
        unPlat.setPrix(15.5);
        lesPlats.add(unPlat);

        unPlat = new Plat("Filet de daurade",400); // plat numéro 1
        unPlat.setLeType(lesTypesPlats.get(1));
        unPlat.setPrix(13);
        lesPlats.add(unPlat);

        unPlat = new Plat("Magret de canard",700); // plat numéro 2
        unPlat.setLeType(lesTypesPlats.get(0));
        unPlat.setPrix(17);
        lesPlats.add(unPlat);

        unPlat = new Plat("Faux filet",500); // plat numéro 3
        unPlat.setLeType(lesTypesPlats.get(0));
        unPlat.setPrix(16.5);
        lesPlats.add(unPlat);

        unPlat = new Plat("Risottos aux légumes et parmesan",300); // plat numéro 4
        unPlat.setLeType(lesTypesPlats.get(2));
        unPlat.setPrix(12.5);
        lesPlats.add(unPlat);

        unPlat = new Plat("Lasagnes à la ratatouille",400); // plat numéro 5
        unPlat.setLeType(lesTypesPlats.get(2));
        unPlat.setPrix(9.5);
        lesPlats.add(unPlat);

        Repas unRepas = new Repas(); // préparation du repas numéro 0
        unRepas.setUneCategorie(lesCategories.get(0));
        unRepas.getLesPlats().add(lesPlats.get(0));
        unRepas.getLesPlats().add(lesPlats.get(0));
        unRepas.getLesPlats().add(lesPlats.get(0));
        unRepas.getLesPlats().add(lesPlats.get(0));
        unRepas.getLesPlats().add(lesPlats.get(0));
        lesRepas.add(unRepas);

        unRepas = new Repas(); // préparation du repas numéro 1
        unRepas.setUneCategorie(lesCategories.get(2));
        unRepas.getLesPlats().add(lesPlats.get(0));
        unRepas.getLesPlats().add(lesPlats.get(1));
        unRepas.getLesPlats().add(lesPlats.get(2));
        lesRepas.add(unRepas);

    }
}
