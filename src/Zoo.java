public class Zoo {
    Animal [] animals;
    String name;
    String city;
    static final int nbrCages = 25;

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
}
