package CollectionsStudy.Map;

import java.util.*;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        private Seat s1;
        private Seat s2;

        //compare uniquement les prix, mais on peux avoir 2 chaises de numéro différent qui ont le même prix
        @Override
        public int compare(Seat s1, Seat s2) {
            this.s1 = s1;
            this.s2 = s2;
            if (s1.getPrice() < s2.getPrice()) {
                return -1;
            } else if (s1.getPrice() > s2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };


    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows -1);
        extracted(seatsPerRow, lastRow);
    }

    public void extracted(int seatsPerRow, int lastRow) {
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;
                if((row <= 'D') && (seatNum >= 4 && seatNum <= 9)){
                    price = 14.00;
                }else if((row <='F') || (seatNum < 4 ||seatNum >9 )){
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reservedSeat (String seatNumber){
        Seat requestedSeat = new Seat(seatNumber, 0);
        // retourne plus rapidement la position dans la liste et gère le cas null
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);

        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        }else {
            System.out.println("there is no seat " + seatNumber);
            return false;
        }
    }

    public  Collection<Seat> getSeats(){
        return this.seats;
    }


    public class Seat implements Comparable<Seat>{

        private final String seatNumber;
        private boolean reserved = false;
        private double price;

        public Seat(String seatNumber, double price){
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }else {
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat " + this.seatNumber + "cancelled");
                return true;
            }else {
                return false;
            }
        }


        //compare uniquement les numéros, on ne peux pas voir 2 chaises qui ont le même numéro mais un prix différent
        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public double getPrice() {
            return price;
        }

        public String getSeatNumber(){
            return this.seatNumber;
        }

    }
}

