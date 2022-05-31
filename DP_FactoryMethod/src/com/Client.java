package com;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {
    protected List<Commande> commandes =
            new ArrayList<Commande>();
    protected abstract Commande creeCommande(double montant)
            ;
    public void nouvelleCommande(double montant)
    {
        Commande commande = this.creeCommande(montant);
        if (commande.valide())
        {
            commande.paye();
            commandes.add(commande);
        }
    }

}
