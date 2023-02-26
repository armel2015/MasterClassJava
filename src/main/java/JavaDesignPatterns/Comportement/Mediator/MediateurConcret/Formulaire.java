package JavaDesignPatterns.Comportement.Mediator.MediateurConcret;

import JavaDesignPatterns.Comportement.Mediator.Element.Controle;
import JavaDesignPatterns.Comportement.Mediator.ElementConcret.Bouton;
import JavaDesignPatterns.Comportement.Mediator.ElementConcret.PopupMenu;

import java.util.ArrayList;
import java.util.List;

public class Formulaire {

    protected List<Controle> controles = new ArrayList<Controle>();

    protected List<Controle> controlesCoemprunteur = new ArrayList<Controle>();

    protected PopupMenu menuCoemprunteur;
    protected Bouton  boutonOk;
    protected  boolean enCours = true;

    public void ajouteControle(Controle controle){
        controles.add(controle);
        controle.setDirecteur(this);
    }

    public void ajouteControleCoemprunteur(Controle controle){
        controlesCoemprunteur.add(controle);
        controle.setDirecteur(this);
    }

    public void setMenuCoemprunteur(PopupMenu menuCoemprunteur){
        this.menuCoemprunteur = menuCoemprunteur;
    }

    public void setBoutonOk(Bouton boutonOk){
        this.boutonOk = boutonOk;
    }

    public void controleModifie(Controle controle){
        if(controle == menuCoemprunteur)
            if(controle.getValeur().equals("avec coemprunteur")){
                for (Controle elementCoemprunteur : controlesCoemprunteur)
                    elementCoemprunteur.saisie();
            }

        if(controle == boutonOk){
            enCours = false;
        }
    }

    public void saisie(){
        while (true){
            for (Controle controle: controles){
                controle.saisie();
                if(!enCours)
                    return;
            }
        }
    }

}
