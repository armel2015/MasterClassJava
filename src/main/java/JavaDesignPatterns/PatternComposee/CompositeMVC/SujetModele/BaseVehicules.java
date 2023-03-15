package JavaDesignPatterns.PatternComposee.CompositeMVC.SujetModele;

import java.util.ArrayList;
import java.util.List;

public class BaseVehicules extends Sujet{

    protected Vehicule[] vehicules = new Vehicule[]{
            new Vehicule("Auto", "KV12", 10000, new String[]{"Bon véhicule", "Tas de féraille, je déconseille"}),
            new Vehicule("Auto", "KV14", 12500, new String[]{"Trop cher", "Acceptable"}),
            new Vehicule("Auto++", "KDY1250", 2500, new String[]{"Excellent véhicule"}),
            new Vehicule("Inconnu", "XYZ", 15005, new String[]{"Ras"})
    };

    protected int indiceVehiculeCourant = 0;

    public List<VehiculeDescription> getListVehicules(){
        int indice = 0;

        List<VehiculeDescription> result = new ArrayList<VehiculeDescription>();
        for (Vehicule vehicule : vehicules){
            result.add(new VehiculeDescription(indice, vehicule.getMarque()+ " : "+ vehicule.getModele()));
            indice++;
        }
        return result;
    }

    public void setIndiceVehiculeCourant(int indice){
        if((indice >=0) && (indice < vehicules.length) && (indiceVehiculeCourant != indice)){
            indiceVehiculeCourant = indice;
            notifie();
        }
    }

    public int getIndiceVehiculeCourant(){
        return indiceVehiculeCourant;
    }

    String getMarqueCourante(){
        return vehicules[indiceVehiculeCourant].getMarque();
    }

    String getModeleCourant(){
        return vehicules[indiceVehiculeCourant].getModele();
    }

    int getPrixCourant(){
        return vehicules[indiceVehiculeCourant].getPrix();
    }

    int getNbrAvis(){
        return vehicules[indiceVehiculeCourant].getAvis().length;
    }

    String getAvis(int indiceAvis){
        if(indiceAvis >= vehicules[indiceVehiculeCourant].getAvis().length)
            return "";
        else
            return vehicules[indiceVehiculeCourant].getAvis()[indiceAvis];
    }

    public class VehiculeDescription{
        private int indice;
        private String description;

        public VehiculeDescription(int indice, String description) {
            this.indice = indice;
            this.description = description;
        }

        public int getIndice() {
            return indice;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return getDescription();
        }
    }

    private class Vehicule{
        private String marque, modele;
        private int prix;
        private String[] avis;

        public Vehicule(String marque, String modele, int prix, String[] avis) {
            super();
            this.marque = marque;
            this.modele = modele;
            this.prix = prix;
            this.avis = avis;
        }

        public String getMarque() {
            return marque;
        }

        public String getModele() {
            return modele;
        }

        public int  getPrix() {
            return prix;
        }

        public String[] getAvis() {
            return avis;
        }
    }
}
