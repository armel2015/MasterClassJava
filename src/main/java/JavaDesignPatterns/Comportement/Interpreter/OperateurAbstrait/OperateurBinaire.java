package JavaDesignPatterns.Comportement.Interpreter.OperateurAbstrait;

import JavaDesignPatterns.Comportement.Interpreter.Expression.Expression;

public abstract class OperateurBinaire extends Expression {

    protected Expression operandeGauche, operandeDroite;

    public OperateurBinaire(Expression operandeGauche, Expression operandeDroite) {
        this.operandeGauche = operandeGauche;
        this.operandeDroite = operandeDroite;
    }

}
