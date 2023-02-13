package JavaDesignPatterns.Structuration.Adapter.Adapteur;

import JavaDesignPatterns.Structuration.Adapter.Adapte.ComposantPdf;
import JavaDesignPatterns.Structuration.Adapter.Interface.Document;

public class DocumentPdf implements Document {

    protected ComposantPdf outilPdf = new ComposantPdf();

    @Override
    public void setContenu(String contenu) {
        outilPdf.pdfFixeContenu(contenu);
    }

    @Override
    public void dessine() {
        outilPdf.prepareAffichage();
        outilPdf.pdfRafraichit();
        outilPdf.pdfTermineAffichage();
    }

    @Override
    public void imprime() {
        outilPdf.pdfEnvoieImprimante();
    }
}
