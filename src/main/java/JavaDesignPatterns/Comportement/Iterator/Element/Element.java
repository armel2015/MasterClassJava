package JavaDesignPatterns.Comportement.Iterator.Element;

public abstract class Element {

    protected  String description;

    public Element(String description) {
        this.description = description;
    }

    public boolean motCleValide(String motCle){
        return description.indexOf(motCle) != -1;
    }
}
