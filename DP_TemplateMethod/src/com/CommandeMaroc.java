package com;

public class CommandeMaroc extends Commande {
    @Override
    protected void calculeTva() {
        montantTva = montantHt * 0.2;
    }
}
