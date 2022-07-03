package com;

public class Main {

    public static void main(String[] args) {
	FabriqueVehicule Fv;
	Fv=new FabriqueVehiculeElecticité();
	Automobile M1 = Fv.creeAutomobile("BMW","Bleu",120,5);
	M1.afficheCaracteristiques();
    }
}
