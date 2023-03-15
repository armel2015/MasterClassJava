package JavaDesignPatterns.PatternComposee.MultiCastPattern.Recepteur;

import JavaDesignPatterns.PatternComposee.MultiCastPattern.Message.MessageCommercial;
import JavaDesignPatterns.PatternComposee.MultiCastPattern.RecepteurAbstrait.Employe;
import JavaDesignPatterns.PatternComposee.MultiCastPattern.RecepteurAbstrait.RecepteurCommercial;

public class Commercial extends Employe {

    protected RecepteurCommercial recepteurCommercial = new RecepteurCommercial() {
        @Override
        public void recoit(MessageCommercial messageCommercial) {
            System.out.println("Nom: " + nom);
            System.out.println("Message: "+ messageCommercial.getContenu());
        }
    };

    public Commercial(String nom) {
        super(nom);
    }

    public RecepteurCommercial getRecepteurCommercial(){
        return recepteurCommercial;
    }
}
