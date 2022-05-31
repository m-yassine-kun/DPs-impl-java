package com;

public class Composantpdf {


    protected String contenu;

    public void pdfFixeContenu(String contenu) {
         this.contenu=contenu;
    }


    public void pdfPrepareAffichage() {
        System.out.println("**** *Afficher debut pdf");

    }


    public void pdfRafraichit() {
        System.out.println("*Afficher pdf :" + contenu);

    }


    public void pdfTermineAffichage() {
        System.out.println("*Afficher fin pdf *****");

    }


    public void pdfEnvoiImprimante() {
        System.out.println("imprimer pdf: "+ contenu);

    }
}
