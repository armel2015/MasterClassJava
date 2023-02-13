package JavaDesignPatterns.Structuration.Adapter.Client;

import JavaDesignPatterns.Structuration.Adapter.Adapteur.DocumentHtml;
import JavaDesignPatterns.Structuration.Adapter.Adapteur.DocumentPdf;
import JavaDesignPatterns.Structuration.Adapter.Interface.Document;

public class ServeurWeb {

    public static void main(String[] args) {
        Document document1, document2;
        document1 = new DocumentHtml();
        document1.setContenu("Rapport de réunion");
        document1.dessine();

        System.out.println();

        document2 = new DocumentPdf();
        document2.setContenu("Cahier de charge");
        document2.dessine();
    }
}
