package JavaDesignPatterns.Structuration.Composite.Compose;

import JavaDesignPatterns.Structuration.Composite.Composant.Societe;

import java.util.ArrayList;
import java.util.List;

public class SocieteMere extends Societe {

    protected List<Societe> filiales = new ArrayList<Societe>();

    @Override
    public double calculeCoutEntretien() {
        double cout = 0.0;
        for(Societe filiale: filiales)
            cout = cout + filiale.calculeCoutEntretien();

        return cout + (nbrVehicules * coutUnitVehicule);
    }

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return filiales.add(filiale);
    }
}
