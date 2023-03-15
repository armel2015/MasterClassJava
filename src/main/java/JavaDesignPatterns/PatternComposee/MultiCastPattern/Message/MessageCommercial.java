package JavaDesignPatterns.PatternComposee.MultiCastPattern.Message;

import JavaDesignPatterns.PatternComposee.MultiCastPattern.MessageAbstrait.MessageAbstrait;

public class MessageCommercial extends MessageAbstrait {

    protected String contenu;

    public String getContenu(){
        return contenu;
    }

    public MessageCommercial(String contenu){
        super();
        this.contenu = contenu;
    }

}
