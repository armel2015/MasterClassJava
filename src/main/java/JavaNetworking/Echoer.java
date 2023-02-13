package JavaNetworking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread{

    private Socket socket;

    public Echoer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try(BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true)){
            while (true){
                String echoString =  input.readLine();
                System.out.println("Received client input:" +echoString);
                if(echoString.equals("exit")){
                    break;
                }

                //on met en pause le serveur avant d'afficher le message saisi par le client
                try {
                    Thread.sleep(15000);
                }catch (InterruptedException e){
                    e.getMessage();
                }
                output.println(echoString);
            }
        }catch (IOException e){
            System.out.println("Ooops: "+ e.getMessage());
        }finally {
            try{
                //on ferme les socket des clients au niveau du serveur pour éviter un bloçage au niveau du client
                socket.close();
            }catch (IOException e){

            }
        }
    }
}
