package org.sdley;

public class Poisson extends Animal {

    // constructeur
    public Poisson(Long id, String nom, String categorie, Personne proprietaire) {
        // super(id, nom, categorie, proprietaire);
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.proprietaire = proprietaire;
    }


    public String sePresenter(){
        return "Poisson, je suis un Actinoptérygiens  !";
    }

    public String seDeplacer(){
        return "Poisson, je nage !";
    }

    public String crier(){
        return "Poisson, je crie !";
    }

}
