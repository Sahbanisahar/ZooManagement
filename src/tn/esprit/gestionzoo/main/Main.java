package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        // Créer un animal (lion) avec des attributs
        Animal lion = new Animal("Félin", "Lion", 5, true);

        // Créer un zoo (myZoo) avec des attributs
        Zoo myZoo = new Zoo("Mon Zoo", "VilleZoo", 10);

        // Afficher les détails de base du zoo (name, city, nbrCages)
        myZoo.displayZoo();



        }
    }
