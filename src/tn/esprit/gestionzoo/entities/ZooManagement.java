package tn.esprit.gestionzoo.entities;//Instruction 3

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "belvidair";

    public static void main(String[] args) {
        //Instruction 1
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages);
    }
    }
