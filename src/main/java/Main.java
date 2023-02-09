import CollectionsStudy.Map.Theatre;
import JavaDesignPatterns.Contruction.Builder.RototExemple.Builder.OldRobotBuilder;
import JavaDesignPatterns.Contruction.Builder.RototExemple.Builder.Robot;
import JavaDesignPatterns.Contruction.Builder.RototExemple.Builder.RobotBuilder;
import JavaDesignPatterns.Contruction.Builder.RototExemple.Builder.RobotEngineer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        /*
        System.out.println("Begin Robot Display");
        System.out.println(firstRobot.getRobotTete());
        System.out.println(firstRobot.getRobotCorp());
        System.out.println(firstRobot.getRobotMains());
        System.out.println(firstRobot.getRobotPieds());
        System.out.println("End Robot Display");
        */

        Theatre theatre = new Theatre("Olympia", 8, 12);

        //seatCopy est une vue de la liste seats donc si on modifie seatcopy alors seat sera modifié



        if(theatre.reservedSeat("D12")){
            System.out.println("please pay for D12");
        }else {
            System.out.println("seat already reserved");
        }

        if(theatre.reservedSeat("B13")){
            System.out.println("please pay for B13");
        }else {
            System.out.println("seat already reserved");
        }

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));

        printList(priceSeats);
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }
    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat: list){
            System.out.println(" " + seat.getSeatNumber() + " : " + seat.getPrice());
        }
        System.out.println("=================================================================================");
    }
}
