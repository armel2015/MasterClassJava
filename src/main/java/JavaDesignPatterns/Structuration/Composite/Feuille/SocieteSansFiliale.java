package JavaDesignPatterns.Structuration.Composite.Feuille;

import JavaDesignPatterns.Structuration.Composite.Composant.Societe;

public class SocieteSansFiliale extends Societe {


    @Override
    public double calculeCoutEntretien() {
        return nbrVehicules * coutUnitVehicule;
    }

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return false;
    }
}
