public class test {
    public static void main(String[] args) {
        System.out.println("Started copying to backend server");
        try {
            Thread.sleep(5000); // Pause for 5 seconds (5000 milliseconds)
        } catch (InterruptedException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println("Backing up completed");
    }
}
