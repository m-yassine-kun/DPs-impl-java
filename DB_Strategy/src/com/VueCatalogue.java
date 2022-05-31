package com;

import java.util.ArrayList;
import java.util.List;

public class VueCatalogue
{
    protected List<VueVehicule> contenu =
            new ArrayList<VueVehicule>();
    protected DessinCatalogue dessin;
    public VueCatalogue(DessinCatalogue dessin)
    {
        contenu.add(new VueVehicule("véhicule bon marché"));
        contenu.add(new VueVehicule("véhicule spacieux"));
        contenu.add(new VueVehicule("véhicule rapide"));
        contenu.add(new VueVehicule("véhicule confortable"));
        contenu.add(new VueVehicule("véhicule sportif"));
        this.dessin = dessin;
    }
    public void dessine()
    {
        dessin.dessine(contenu);
    }
}
