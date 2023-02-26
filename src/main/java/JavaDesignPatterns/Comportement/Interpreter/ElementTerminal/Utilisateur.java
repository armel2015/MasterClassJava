package JavaDesignPatterns.Comportement.Interpreter.ElementTerminal;

import JavaDesignPatterns.Comportement.Interpreter.Expression.Expression;

import java.util.Scanner;

public class Utilisateur {

    public static void main(String[] args) {
        Expression expressionRequet = null;
        Scanner reader = new Scanner(System.in);
        System.out.println("Entrez votre requête: ");
        String requête = reader.nextLine();


        try {
            expressionRequet = Expression.analyse(requête);
        }catch (Exception e){
            System.out.println(e.getMessage());
            expressionRequet = null;
        }

        if(expressionRequet != null){
            System.out.println("Entrez le texte de descrption du véhicule :");
            String description = reader.nextLine();
            if(expressionRequet.evalue(description)){
                System.out.println("La description répond à la requête");
            }else {
                System.out.println("La description ne répond pas à la requête");
            }
        }
    }
}
