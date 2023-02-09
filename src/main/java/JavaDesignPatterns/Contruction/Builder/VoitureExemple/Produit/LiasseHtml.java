package JavaDesignPatterns.Contruction.Builder.VoitureExemple.Produit;

public class LiasseHtml extends Liasse{
    @Override
    public void ajouteDocument(String document) {
        if(document.startsWith("<HTML>")){
            contenu.add(document);
        }
    }

    @Override
    public void imprime() {
        System.out.println("Liasse HTML");
        for (String s : contenu){
            System.out.println(s);
        }
    }
}
