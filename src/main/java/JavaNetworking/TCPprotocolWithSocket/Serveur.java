package JavaNetworking.TCPprotocolWithSocket;

import java.io.IOException;
import java.net.ServerSocket;


public class Serveur {

    public static void main(String[] args) {

        //connection des clients sur le port 5000
        try(ServerSocket serverSocket = new ServerSocket(5000)){
            //rester actif tout le temps et sortir uniquement via l'exit
            while (true){
                new Echoer(serverSocket.accept()).start();
            }
        }catch (IOException e){
            System.out.println("Serveur Exception " + e.getMessage());
        }
    }
}
