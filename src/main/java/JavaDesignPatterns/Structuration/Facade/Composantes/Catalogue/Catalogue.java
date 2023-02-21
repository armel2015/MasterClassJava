package JavaDesignPatterns.Structuration.Facade.Composantes.Catalogue;

import java.util.List;

public interface Catalogue {

    List<String> retrouveVehicules(int prixMin, int prixMax);
}
