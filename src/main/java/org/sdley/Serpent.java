package org.sdley;

public class Serpent extends Animal{

    // constructeurs
    public Serpent(){}

    public Serpent(Long id, String nom, String categorie, Personne proprietaire){
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.proprietaire = proprietaire;
    }

    public String sePresenter(){
        return "Serpent, je suis un reptile !";
    }

    public String seDeplacer(){
        return "Serpent, je rampe !";
    }

    public String crier(){
        return "Serpent, je siffle !";
    }
}
