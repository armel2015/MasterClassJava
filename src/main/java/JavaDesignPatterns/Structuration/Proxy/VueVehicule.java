package JavaDesignPatterns.Structuration.Proxy;

import JavaDesignPatterns.Structuration.Proxy.Proxy.AnimationProxy;
import JavaDesignPatterns.Structuration.Proxy.Sujet.Animation;

public class VueVehicule {

    public static void main(String[] args) {
        Animation animation = new AnimationProxy();

        animation.dessine();
        animation.clic();
        System.out.println("********");
        animation.dessine();
    }
}
