package JavaDesignPatterns.PatternComposee.MultiCastPattern.RecepteurAbstrait;

import JavaDesignPatterns.PatternComposee.MultiCastPattern.MessageAbstrait.MessageAbstrait;

public interface RecepteurAbstrait<TMessage extends MessageAbstrait> {
    public void recoit(TMessage message);
}
