package com;

public class DocumentHTML implements Document {

    protected String contenu;

    @Override
    public void setContenu(String contenu) {
        this.contenu=contenu;
    }

    @Override
    public void imprimer() {
        System.out.println("imprimer document en html: " + contenu);
    }

    @Override
    public void dessine() {
        System.out.println("dessiner document en html: " + contenu);
    }
}
