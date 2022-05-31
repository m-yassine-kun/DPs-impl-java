package com;

public class ScooterEssence extends Scooter {

    public ScooterEssence(String modele, String
            couleur, int puissance)
    {
        super(modele, couleur, puissance);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println(
                "Scooter Essence de modele : " + modele +
                        " de couleur : " + couleur + " de puissance : " +
                        puissance );
    }

}
