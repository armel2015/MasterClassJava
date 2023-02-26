package JavaDesignPatterns.Comportement.Interpreter.OperateurConcret;

import JavaDesignPatterns.Comportement.Interpreter.Expression.Expression;
import JavaDesignPatterns.Comportement.Interpreter.OperateurAbstrait.OperateurBinaire;

public class OperateurOu  extends OperateurBinaire {

    public OperateurOu(Expression operandeGauche, Expression operandeDroite) {
        super(operandeGauche, operandeDroite);
    }

    @Override
    public boolean evalue(String description) {
        return operandeGauche.evalue(description) || operandeDroite.evalue(description);
    }

    //partie analyse syntaxique
    public static Expression parse() throws Exception{
        Expression resultatGauche, resultatDroite;
        resultatGauche = OperateurEt.parse();
        while((jeton != null) && (jeton.equals("ou"))){
            prochainJeton();
            resultatDroite = OperateurEt.parse();
            resultatGauche = new OperateurOu(resultatGauche, resultatDroite);
        }
        return resultatGauche;
    }
}
