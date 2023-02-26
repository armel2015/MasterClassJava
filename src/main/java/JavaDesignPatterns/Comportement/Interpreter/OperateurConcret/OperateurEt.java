package JavaDesignPatterns.Comportement.Interpreter.OperateurConcret;

import JavaDesignPatterns.Comportement.Interpreter.Expression.Expression;
import JavaDesignPatterns.Comportement.Interpreter.OperateurAbstrait.OperateurBinaire;

public class OperateurEt extends OperateurBinaire {

    public OperateurEt(Expression operandeGauche, Expression operandeDroite) {
        super(operandeGauche, operandeDroite);
    }

    @Override
    public boolean evalue(String description) {
        return operandeGauche.evalue(description) && operandeDroite.evalue(description);
    }

    //partie analyse syntaxique
    public static Expression parse() throws Exception {
        Expression resultatGauche , resultatDroite;
        resultatGauche = Expression.parse();

        while ((jeton != null) && (jeton.equals("et"))){
            prochainJeton();
            resultatDroite = Expression.parse();
            resultatGauche = new OperateurEt(resultatGauche, resultatDroite);
        }
        return resultatGauche;
    }
}
