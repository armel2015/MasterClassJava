package JavaDesignPatterns.PatternComposee.MultiCastPattern.RecepteurAbstrait;

import JavaDesignPatterns.PatternComposee.MultiCastPattern.Message.MessageGeneral;

public abstract class Employe implements RecepteurGeneral {

    protected String nom;

    public Employe(String nom) {
        super();
        this.nom = nom;
    }

    public void recoit(MessageGeneral message){
        System.out.println("Nom: " + nom);
        System.out.println("Message: ");
        for (String ligne: message.getContenu())
            System.out.println(ligne);
    }
}
