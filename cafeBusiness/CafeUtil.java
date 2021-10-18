import java.util.ArrayList;

public class CafeUtil {

    public void militaryHoursTest() {

        for(int hour = 0; hour < 24; hour++) {
            System.out.println(hour);
        }
    }
    
    public void coffeeNotification() {

        for(int hour = 0; hour < 24; hour++) {
            System.out.printf("It's %s:00 hours, do you need a coffee break?", hour);
        }
    }

    public void specialsAlert() {

        for(int hour = 6; hour <= 15; hour++) {
            if( hour % 3 == 0) {
                System.out.println("Buy one get one free for the next 15 minutes!");
            }
            else {
                System.out.println("Stay tuned for deals announced throughout the day.");
            }
        }
    }

    public int leadsAtDay10() {
        int sum = 0;
        for(int day = 1; day <= 10; day++) {
            sum+= day;
        }
        return sum;
    }

    public void displayMenu(String[] menuItems) {
        for (String item: menuItems) {
            System.out.println(item);
        }
    }

    // 
    public double getOrderTotal(double[] orderPrices) {
        double sum = 0;
        
        for (double price: orderPrices) {
            sum+= price;
        }
        return sum;

    }

    public double getHighestPrice(double[] priceInventory) {
        double highest = priceInventory[0];
        
        for (double currentPrice: priceInventory) {
            if (currentPrice > highest) {
                highest = currentPrice;
            }
        }
        return highest;
    }
    
    public ArrayList<String> raffleWinners(String[] customers) {
        ArrayList<String> winners = new ArrayList<String>();
        for(int i = -1; i < customers.length; i+= 4) {
            if (i > 0) {
                winners.add(customers[i]);
            }
        }
        return winners;
    }

}
