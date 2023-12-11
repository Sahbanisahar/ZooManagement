package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Animal;

public class Zoo {
    private Animal[] animals;
    private Animal[] aquaticAnimals ;
    private String name;
    private String city;
    private static final int nbrCages = 25;
    private int nbAnimals = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages]; // Crée un tableau de la taille spécifiée pour les animaux du zoo
    }
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    public boolean isZooFull() {
        return (this.nbrCages == animals.length);
    }


    public Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.animals.length>z2.animals.length){
            return z1;
        }else{
            return z2;
        }
    }

    public boolean addAnimal(Animal animal){
        if(!this.isZooFull()){
        animals[nbAnimals] = animal;
        nbAnimals++;
        return true;
        }else{
            return false;
        }
    }
    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbAnimals] = null;
        this.nbAnimals--;
        return true;
    }
    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }



}
