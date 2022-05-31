package com;

import java.util.ArrayList;
import java.util.List;

public class SocieteMere extends Societe {
    protected List<Societe> filiales =
            new ArrayList<Societe>();
    @Override
    public boolean ajouteFiliale(Societe filiale)
    { return filiales.add(filiale); }
    @Override
    public double calculeCoutEntretien() {
        double cout = 0.0;
        for (Societe filiale: filiales)
            cout = cout + filiale.calculeCoutEntretien();
        return cout + nbrVehicules * coutUnitVehicule; }
}
