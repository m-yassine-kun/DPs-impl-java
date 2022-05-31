package com;

public class CommandeComptant extends Commande {
    public CommandeComptant(double montant)
    {
        super(montant);
    }
    public void paye()
    {
        System.out.println(
                "Le paiement de la commande au comptant de : " +
                        montant + " est effectué.");
    }
    public boolean valide()
    {
        return true;
    }

}
