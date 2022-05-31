package com;

public class Main {

    public static void main(String[] args) {
        Commande commandeMaroc = new CommandeMaroc();
                commandeMaroc.setMontant(10000);
        commandeMaroc.calculeMontantTtc();
        System.out.println("---Maroc---");
        commandeMaroc.affiche();

                Commande commandeFrance = new CommandeFrance();
                commandeFrance.setMontant(10000);
        commandeFrance.calculeMontantTtc();
        System.out.println("---France---");
        commandeFrance.affiche();
    }
}
