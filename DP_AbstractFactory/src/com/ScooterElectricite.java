package com;

public class ScooterElectricite extends Scooter {

    public ScooterElectricite(String modele, String
            couleur, int puissance)
    {
        super(modele, couleur, puissance);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println(
                "Scooter Electricité de modele : " + modele +
                        " de couleur : " + couleur + " de puissance : " +
                        puissance );
    }

}
