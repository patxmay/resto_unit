package com.example.exojunit2024;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestModele {

    @Before
    public void setUp() {
        Modele.init();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void initLst(){
        assertNotNull(Modele.lesCategories);
        // code à completer
    }

    @Test
    public void initLesCategoriesTest(){
        assertEquals("Adulte",Modele.lesCategories.get(0).getNomCateg());
        assertEquals("Enfant",Modele.lesCategories.get(1).getNomCateg());
        assertEquals("Chomeur",Modele.lesCategories.get(2).getNomCateg());
        assertEquals(1.0,Modele.lesCategories.get(0).getReduc(),0);
        assertEquals(1.5,Modele.lesCategories.get(1).getReduc(),0);
        assertEquals(2.0,Modele.lesCategories.get(2).getReduc(),0);
    }

    @Test
    public void initlesTypesPlatsTest(){
        // code à completer
    }

    @Test
    public void newPlatTest(){
        Plat unPlat =new Plat();
        assertEquals("",unPlat.getNomP());
        assertEquals(-1,unPlat.getCaloriesP());
    }

    @Test
    public void coutCategorieTest(){
        // code à completer
    }

    @Test
    public void coutNbRepasReducTest(){
        // code à completer
    }

}