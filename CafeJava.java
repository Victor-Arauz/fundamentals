public class CafeJava {

    public static void main(String[] args) {

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly! ";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double dripCoffee = 6.9;
        double latte = 4.2;
        double cappucino = 5.45;

        String customer1 = "Cindhuri ";
        String customer2 = "Sam ";
        String customer3 = " Jimmy ";
        String customer4 = "Noah ";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
        
        System.out.println(generalGreeting + customer1);

        System.out.println(customer1 + pendingMessage);
        
        System.out.println(customer4 + pendingMessage + displayTotalMessage + cappucino);

        System.out.println(displayTotalMessage + (latte + latte) + customer3 + readyMessage);

        System.out.println(displayTotalMessage + (dripCoffee - latte));

    }
}
