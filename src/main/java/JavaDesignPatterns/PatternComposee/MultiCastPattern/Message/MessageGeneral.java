package JavaDesignPatterns.PatternComposee.MultiCastPattern.Message;

import JavaDesignPatterns.PatternComposee.MultiCastPattern.MessageAbstrait.MessageAbstrait;

import java.util.List;

public class MessageGeneral extends MessageAbstrait {

    protected List<String> contenu;

    public List<String> getContenu(){
        return contenu;
    }

    public MessageGeneral(List<String> contenu) {
        super();
        this.contenu = contenu;
    }
}
