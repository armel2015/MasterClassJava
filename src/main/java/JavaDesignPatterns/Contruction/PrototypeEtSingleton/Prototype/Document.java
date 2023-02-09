package JavaDesignPatterns.Contruction.PrototypeEtSingleton.Prototype;

public abstract class Document implements Cloneable{

    protected String contenu  = new String();

    public Document duplique(){
        Document resultat;
        try {
            resultat = (Document)this.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
        return resultat;
    }

    public void remplit(String information){
        contenu  = information;
    }

    public abstract void imprime();
    public abstract void affiche();
}
