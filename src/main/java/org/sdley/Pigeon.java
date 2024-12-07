package org.sdley;

public class Pigeon extends Animal {
    public Pigeon() {}
    public Pigeon(Long id, String nom, String categorie, Personne proprietaire) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.proprietaire = proprietaire;
    }

    public String sePresenter(){
        return "Pigeon, je suis un Oiseau !";
    }

    public String seDeplacer(){
        return "Pigeon, je vole !";
    }

    public String crier(){
        return "Pigeon, je roucoule/grogne !";
    }
}
