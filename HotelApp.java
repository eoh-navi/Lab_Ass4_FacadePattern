public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("--- Guest Requesting Services via Front Desk ---");
        
        frontDesk.pickUpVehicle("RDJX-3456");

        frontDesk.cleanRoom(102);

        frontDesk.requestCart(3);
    }
}