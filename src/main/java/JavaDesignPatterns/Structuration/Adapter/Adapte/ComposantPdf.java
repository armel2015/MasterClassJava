package JavaDesignPatterns.Structuration.Adapter.Adapte;

public class ComposantPdf {

    protected String contenu;

    public void pdfFixeContenu(String contenu){
        this.contenu = contenu;
    }

    public void prepareAffichage(){
        System.out.println("Affichage PDF : Début");
    }

    public void pdfRafraichit(){
        System.out.println("Affichage contenu : " + contenu);
    }

    public void pdfTermineAffichage(){
        System.out.println("Affichage PDF : Fin");
    }

    public void pdfEnvoieImprimante(){
        System.out.println("Impression PDF : " +contenu);
    }
}
