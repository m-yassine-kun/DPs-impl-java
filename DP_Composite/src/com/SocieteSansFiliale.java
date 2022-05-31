package com;

public class SocieteSansFiliale extends Societe {
    @Override
    public double calculeCoutEntretien() {
        return nbrVehicules * coutUnitVehicule;
    }

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return false;
    }
}
