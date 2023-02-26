package JavaDesignPatterns.Comportement.Interpreter.Expression;

import JavaDesignPatterns.Comportement.Interpreter.ElementTerminalConcrete.MotCle;
import JavaDesignPatterns.Comportement.Interpreter.OperateurConcret.OperateurOu;

public abstract class Expression {

    public abstract boolean evalue(String description);

    protected static String source;
    protected static int index;
    protected static String jeton;

    protected static void prochainJeton(){
        while ((index < source.length()) && (source.charAt(index) == ' '))
            index++;
        if(index == source.length())
            jeton = null;
        else if(source.charAt(index) == '(' || (source.charAt(index) == ')')){
            jeton = source.substring(index, index +1);
            index++;
        }else {
            int debut = index;
            while ((index < source.length()) && (source.charAt(index) != ' ') && (source.charAt(index) != ')'))
                index++;
            jeton = source.substring(debut, index);
        }
    }

    public static Expression analyse(String source) throws Exception{
        Expression.source = source;
        index = 0;
        prochainJeton();
        return OperateurOu.parse();
    }

    public static Expression parse() throws Exception{
        Expression resultat;
        if(jeton.equals("(")){
            prochainJeton();
            resultat  = OperateurOu.parse();
            if(jeton == null) throw new Exception("Erreur de syntaxe");
            if (jeton.equals(")")) throw new Exception("Erreur de syntaxe");
            prochainJeton();
        }else{
            resultat = MotCle.parse();
        }
        return resultat;
    }
}
