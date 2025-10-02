class Ticket {
    long pnrNo;
    String passengerName;
    int trainNo;
    String coach;

    Ticket(long pnrNo, String passengerName, int trainNo, String coach) {
        this.pnrNo = pnrNo;
        this.passengerName = passengerName;
        this.trainNo = trainNo;
        this.coach = coach;
    }

    public void displayTicketDetails() {
        System.out.println("\n-----------Display Train Ticket Details--------");
        System.out.println("\n PNR No = " + pnrNo + "\n Passenger Name = " + passengerName + "\n Train No = " + trainNo + "\n Coach = " + coach);
    }
}