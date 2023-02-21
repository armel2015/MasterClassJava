package JavaDesignPatterns.Structuration.Facade.La_facade;

import JavaDesignPatterns.Structuration.Facade.Composantes.Catalogue.Catalogue;
import JavaDesignPatterns.Structuration.Facade.Composantes.Catalogue.ComposantCatalogue;
import JavaDesignPatterns.Structuration.Facade.Composantes.GestionDocumentaire.ComposantGestionDocument;
import JavaDesignPatterns.Structuration.Facade.Composantes.GestionDocumentaire.GestionDocument;

import java.util.List;

public class WebServiceAutoImpl implements WebServiceAuto{
    protected Catalogue catalogue = new ComposantCatalogue();
    protected GestionDocument gestionDocument = new ComposantGestionDocument();


    @Override
    public String document(int index) {
        return gestionDocument.document(index);
    }

    @Override
    public List<String> chercheVehicules(int prixMoyen, int ecartMax) {
        return catalogue.retrouveVehicules(prixMoyen - ecartMax, prixMoyen + ecartMax);
    }
}
