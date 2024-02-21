import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");
        System.out.print("Enter the base currency: ");
        String baseCurrency = scanner.nextLine();

        System.out.print("Enter the target currency: ");
        String targetCurrency = scanner.nextLine();


        double exchangeRate = 1.2;

        System.out.print("Enter the amount in " + baseCurrency + ": ");
        double amount = scanner.nextDouble();

        double convertedAmount = amount * exchangeRate;

        System.out.println("Converted amount in " + targetCurrency + ": " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }
}
