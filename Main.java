package FacadePatternLabTask;
public class Main {
    public static void main(String[] args) {
        FlightBookingFacade facade = new FlightBookingFacade();
        String testCard = "4532015112830366";
        System.out.println("=== TEST 1: Successful booking ===");
        System.out.println("Result 1: " + facade.bookFlight(
                "Amina Suleimenova", "KZ204", "14B", 320.00,
                2, 24.5, "EUR", testCard));

        System.out.println("\n=== TEST 2: Blocked crew seat ===");
        System.out.println("Result 2: " + facade.bookFlight(
                "Daniyar Kassymov", "KZ204", "13A", 320.00,
                1, 15.0, "USD", testCard));

        System.out.println("\n=== TEST 3: Invalid card and seat rollback ===");
        System.out.println("Result 3: " + facade.bookFlight(
                "Timur Bekov", "KZ204", "08C", 320.00,
                1, 18.0, "KZT", "1234"));

        System.out.println("\n=== TEST 4: Silver loyalty booking ===");
        System.out.println("Result 4: " + facade.bookFlight(
                "Dana Amanova", "KZ204", "10D", 320.00,
                3, 30.0, "USD", testCard, "SILVER"));
    }
}