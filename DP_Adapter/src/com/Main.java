package com;

public class Main {

    public static void main(String[] args) {
	Document document1,document2;
	document1 = new DocumentHTML();
	document2 = new DocumentPdf();
	document1.setContenu("le contenu du doc 1");
	document2.setContenu("le contenu du doc 2");
	document1.dessine();
	document2.dessine();
	document1.imprimer();
	document2.imprimer();
    }
}
