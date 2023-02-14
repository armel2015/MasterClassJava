package JavaNetworking.HTTPprotocoleAndAPI;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class HighLevelAPI {

    public static void main(String[] args) {
        try {

            URI uri3 = new URI("/catalogue/phones?os=android#samsung");
            //impossible d'avoir une URL absolue à partir d'une URI relative => IllegalArgumentException
           /* URL url3 = uri3.toURL();
            System.out.println("URl3 = " +url3);*/

            URI uri3Base = new URI("http://username:password@myserver.com:5000");
            //mais on peut contourner en spécifiant une URI de base qui ne varie pas!
            URI uri4 = uri3Base.resolve(uri3);
            URL resolvedUrl = uri4.toURL();
            System.out.println("resolvedUrl = " +resolvedUrl);


            URI uri2 = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
            URL url2 = uri2.toURL();

            System.out.println("URl2 = " +url2);


            URI uri = new URI("db://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
            System.out.println("1-Scheme = " + uri.getScheme());
            System.out.println("2-Scheme-specific part = " + uri.getSchemeSpecificPart());
            System.out.println("3-Autority = " + uri.getAuthority());
            System.out.println("4-User info = " + uri.getUserInfo());
            System.out.println("5-Host = " + uri.getHost());
            System.out.println("6-Port = " + uri.getPort());
            System.out.println("7-Path = " + uri.getPath());
            System.out.println("8-Query = " + uri.getQuery());
            System.out.println("9-Fragment = " + uri.getFragment());
            URL url = uri.toURL();



        } catch (URISyntaxException e) {
            System.out.println("URI bad Syntax: " +e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("URL Malformed " +e.getMessage());
        }
    }
}
