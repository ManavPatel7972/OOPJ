class Train {
    int trainNo;
    String trainName;
    String source;
    String destination;
    String departureTime;
    String arrivalTime;
  static String[] coach = {"A1","H1","B1","S1","S2"};
    int[] availableSeatInCoaches = new int[5]; //5 coaches {S1,S2,B1 --> 72 Seat , A1,H1 --> 24 Seat};
    // availableSeatInCoaches[0] = A1,availableSeatInCoaches[1] = H1,availableSeatInCoaches[2] = B1,availableSeatInCoaches[3] = S1.,availableSeatInCoches[4] = S2;

    //    int distance;
    String[] stations = new String[5];


    Train(int trainNo, String trainName, String source, String destination, String departureTime, String arrivalTime, int[] availableSeatInCoaches, String[] stations) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;

        for (int i = 0; i < availableSeatInCoaches.length; i++) {
            this.availableSeatInCoaches[i] = availableSeatInCoaches[i];
        }
//        this.distance = distance;

        for (int i = 0; i < stations.length; i++) {
            this.stations[i] = stations[i];
        }
    }

    public void displayTimeTableDetails() {

        System.out.println("\n---------Train Details---------");
        System.out.println("\nTrain No : " + trainNo + " | " + "Train Name : " + trainName + " | " + "Route : " + source + " to " + destination + " | " + "Arrival Time : " + arrivalTime + " | " + "Departure Time : " + departureTime);
        System.out.println("________");
        System.out.println("\n Satations in between " + source + " to " + destination);
        System.out.println(stations[0] + " , " + stations[1] + " , " + stations[2] + " , " + stations[3] + " , " + stations[4] + " , ");

        System.out.println("\n---------Available Seats in Coaches----------");
        System.out.print("\n (2 Tier AC) A1 = " + availableSeatInCoaches[0] + "\n (1st Class AC) H1 = " + availableSeatInCoaches[1] + "\n (3 Tier AC) B1 = " + availableSeatInCoaches[2] + "\n (Sleeper SL) S1 = " + availableSeatInCoaches[3] + "\n (Sleeper SL) S2 = " + availableSeatInCoaches[4]);

    }
}