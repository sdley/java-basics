package org.sdley;

//import org.example.Personne;

public class Animal {
    protected Long id;
    protected String nom;
    protected String categorie;
    protected Personne proprietaire;

    // Contructeur par defaut
    public Animal() {
        id = null;
        nom = null;
        categorie = null;
        proprietaire = null;
    }

    // Constructeur avec parametre
    public Animal(Long id, String nom, String categorie, Personne proprietaire){
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.proprietaire = proprietaire;
    }

    // Accesseurs
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Personne getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String sePresenter(){
        return "En tant que ";
    }

    public String seDeplacer(){
        return "En tant que ";
    }

    public String crier(){
        return "En tant que ";
    }
}
