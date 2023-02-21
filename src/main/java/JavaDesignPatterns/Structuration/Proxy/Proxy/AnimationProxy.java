package JavaDesignPatterns.Structuration.Proxy.Proxy;

import JavaDesignPatterns.Structuration.Proxy.Sujet.Animation;
import JavaDesignPatterns.Structuration.Proxy.SujetReel.Film;

public class AnimationProxy implements Animation {

    protected Film film = null;
    protected String photo = "affichage de la photo";

    @Override
    public void clic() {
        if(film == null){
            film = new Film();
            film.charge();
        }
        film.joue();
    }

    @Override
    public void dessine(){
        if(film != null)
            film.dessine();
        else
            dessine(photo);
    }

    public void dessine(String photo){
        System.out.println(photo);
    }
}
