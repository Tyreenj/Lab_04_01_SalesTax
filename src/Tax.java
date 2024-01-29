//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Tax {
    public static void main(String[] args) {
        double purchasePrice = 14.4;
        double purchaseTax = 0;

        purchaseTax = purchasePrice * 0.05;
        System.out.println("You entered the price " +purchasePrice +" which has a tax of " +purchaseTax);

    }
}