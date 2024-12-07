package org.sdley;

public class Chat extends Animal {
//    private int id;
//    public Chat() {
//         super();
//        this
//    }
    // constructeur par defaut
    public Chat() {};
    // constructeur avec parametres
    public Chat(Long id, String nom, String categorie, Personne proprietaire) {
        // super();
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.proprietaire = proprietaire;
    }
    public String sePresenter(){
        return super.sePresenter() + "Chat, je suis un Felin !";
    }

    public String seDeplacer(){
        return super.seDeplacer() + "Chat, je marche !";
    }

    public String crier(){
        return "Chat, je miaule !";
    }


}
