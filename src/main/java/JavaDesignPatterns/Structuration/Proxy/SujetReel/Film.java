package JavaDesignPatterns.Structuration.Proxy.SujetReel;

import JavaDesignPatterns.Structuration.Proxy.Sujet.Animation;

public class Film implements Animation {
    @Override
    public void dessine() {
        System.out.println("Affiche le film");
    }

    public void charge(){
        System.out.println("Chargement du film");
    }

    public void joue(){
        System.out.println("Lecture du film");
    }

    @Override
    public void clic() {

    }
}
