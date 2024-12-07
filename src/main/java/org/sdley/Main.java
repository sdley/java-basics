package org.sdley;

public class Main {
    public static void main(String[] args) {
        // Instanciation de la classe Personne
        Personne sdley = new Personne(1, "Souleymane", "DIALLO");
        Personne ok = new Personne(2, "Ousmane", "KA");

        Personne samou = new Personne();
        samou.setId(3);
        samou.setPrenom("Pape Moussa");
        samou.setNom("DIOP");

        // Creation d'objets Animaux : Chats, Pigeons, Serpents et Poissons
        Animal animal = new Animal();
        Animal minou = new Chat(1L, "Minou", "Felin", sdley);
        Animal merlin = new Pigeon(2L, "Merlin", "Oiseau", ok);
        Animal bobby = new Pigeon(3L, "Bobby", "Oiseau", samou);
        Animal neptune = new Poisson(4L, "Neptune", "", sdley);
        Animal mamba = new Serpent(5L, "Mamba Vert", "Reptile", samou);
        Animal cobra = new Serpent(6L, "Cobra", "Reptile", samou);


        // Affichage des objets Personne
        System.out.println("Affichage des objets Personnes : ");
        System.out.println("\tPersonne sdley: " + sdley);
        System.out.print("\t\tPrenom: " + sdley.getPrenom());
        System.out.println("\t\tNom: " + sdley.getNom());
        System.out.println();

        System.out.println("\tPersonne samou: " + samou);
        System.out.print("\t\tPrenom: " + samou.getPrenom());
        System.out.println("\t\tNom: " + samou.getNom());
        System.out.println();

        System.out.println("Affichage des objets Animaux : ");
        // chats
        System.out.println("\tAnimal chat : " + minou);
        System.out.println("\t\t" + minou.sePresenter());
        System.out.println("\t\t" + minou.seDeplacer());
        System.out.println("\t\t" + animal.crier() + minou.crier());
        System.out.println("\t\tMon proprietaire est " + minou.proprietaire.getPrenom() + " "
                + minou.proprietaire.getNom());
        System.out.println();

        // Pigeons
        // On en fait de meme pour afficher les pigeons, poissons et serpents
        

    }
}
