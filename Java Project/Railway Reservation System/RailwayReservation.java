import java.util.Scanner;

class RailwayReservation {
    Train[] trains = new Train[5];
    Ticket[] tickets = new Ticket[264]; //   {S1,S2,B1 --> 72 Sea-->72*3 = 216 , A1,H1 --> 24 Seat-->24*2 = 48} TOTAL = 264;

    long pnrId = 1000;  // this is pnrID  store Identity  of particular ticket as like  TicketId or TicketNumber as.
    int trainBookingCounter = 0;  // count total booked ticket;


    RailwayReservation() {

        trains[0] = new Train(101, "EXPRESS-1", "Botad", "Rajkot", "7:30 AM", "11:20 PM", new int[]{1, 2, 3, 4, 5}, new String[]{"one", "two", "three", "four", "five"});

        trains[1] = new Train(102, "EXPRESS-2", "Ahemdabad", "Bhavnagar", "5:00 PM", "11:30 PM", new int[]{2, 20, 23, 21, 23}, new String[]{"one", "two", "three", "four", "five"});

        trains[2] = new Train(103, "EXPRESS-3", "Baroda", "Surat", "3:30 PM", "11:45 PM", new int[]{12, 32, 67, 87, 54}, new String[]{"one", "two", "three", "four", "five"});

        trains[3] = new Train(104, "EXPRESS-4", "Navsari", "Anand", "1:00 AM", "9:30 AM", new int[]{23, 45, 33, 44, 55}, new String[]{"one", "two", "three", "four", "five"});

        trains[4] = new Train(105, "EXPRESS-5", "Surendnagar", "Amreli", "2:15 PM", "9:40 PM", new int[]{34, 56, 34, 23, 56}, new String[]{"one", "two", "three", "four", "five"});

    }

    public void viewAvailableTrains() {

        for (int i = 0; i < trains.length; i++) {

            System.out.print("Train - " + (i + 1));
            trains[i].displayTimeTableDetails();
            System.out.println("\n");
            System.out.println("__________________________________________________________________________________________________________\n");

        }

    }

    public void bookTicket() {

        System.out.print("Please Enter Your Train Number : ");
        Scanner sc = new Scanner(System.in);
        int askTrainNo = sc.nextInt();

        int passengerTrainNo = -1;  // when passenger asked view ticket so store trainNo ;
        boolean isTrainNo = false;   // when is true so become process is still continue .... like select coach,enter name ...;

        Train selectedTrain = null;  // selectedTrain variable type is Train class so this variable point to particular trains[i] object;

        for (int i = 0; i < trains.length; i++) {

            if (trains[i].trainNo == askTrainNo) {
                passengerTrainNo = askTrainNo;     // jyare passenger asked view ticket so store trainNo then before using Ticket(passengerTrainno); given a Ticket coustuctor);
                isTrainNo = true;
                selectedTrain = trains[i];
                break;
            }
        }

        if (passengerTrainNo == -1) {
            System.out.println("Invalid Train Number!,Please Enter Valid Train Number:");
        }
        if (isTrainNo) {

//            System.out.println();
            System.out.println("Select Coach :1.(2 Tier AC) -> A1\n 2.(1st Class AC) -> H1\n 3.(3 Tier AC) -> B1\n 4.(Sleeper SL) -> S1\n 5.(Sleeper SL) -> S2");
            String askCoach = sc.next();

            int coachIndex = -1;
            String passengerCoach = null;

            for (int i = 0; i < Train.coach.length; i++) {
                if (Train.coach[i].equalsIgnoreCase(askCoach)) {
                    passengerCoach = askCoach;      // store passengerCoach  when passenger selected because when passenger asked view ticket then store which coach  is selected by passenger the used.
                    coachIndex = i;
                    break;
                }
            }

            if (selectedTrain.availableSeatInCoaches[coachIndex] <= 0) {
                System.out.println(" Sorry! No Seat Available in Coach or Invalid Coach Selected :");
            }

            System.out.print("Enter Passenger Name : ");
            String passengerName = sc.next();

            selectedTrain.availableSeatInCoaches[coachIndex]--;   // 1 seat is removed of available seats in particular coach;

            tickets[trainBookingCounter] = new Ticket(pnrId,passengerName, passengerTrainNo, passengerCoach);  // given data of passenger to Ticket class;
            System.out.println("Booking Successful ! Your PNR NO is = " + pnrId);
            trainBookingCounter++;
            pnrId++;
        }
    }

    public void viewBookedTicket() {
        Scanner sc = new Scanner(System.in);


        if (trainBookingCounter == 0) {
            System.out.println("No tickets booked");
        }

        System.out.print("Enter Your PNR No: ");

        try {
            long pnr = sc.nextLong();
            boolean isFound = false;

            for (int i = 0; i <= trainBookingCounter; i++) {  // Fix: i < trainBookingCounter
                if (tickets[i] != null && tickets[i].pnrNo == pnr) {
                    tickets[i].displayTicketDetails();
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println("Invalid PNR No, Please Enter a Valid Ticket ID or PNR No!");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input! Please enter a valid PNR number.");
            e.printStackTrace();
        }
    }


}



