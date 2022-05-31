package com;

public class DocumentPdf extends Composantpdf implements Document{

    //protected Composantpdf Cpdf= new Composantpdf();


    @Override
    public void setContenu(String contenu) {
        //Cpdf.pdfFixeContenu(contenu);
        pdfFixeContenu(contenu);
    }

    @Override
    public void imprimer() {
        //Cpdf.pdfEnvoiImprimante();
        pdfEnvoiImprimante();
    }

    @Override
    public void dessine() {
        //Cpdf.pdfPrepareAffichage();
        pdfPrepareAffichage();
        //Cpdf.pdfRafraichit();
        pdfRafraichit();
        //Cpdf.pdfTermineAffichage();
        pdfTermineAffichage();

    }


}
