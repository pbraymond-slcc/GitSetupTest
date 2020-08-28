/* Philip B. Raymond */
package pkg2.calculate.a.tip.philipbraymond;

import java.util.Scanner;

public class CalculateATipPhilipBRaymond
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double dblBill, dblGratuityRate, dblGratuityAmount, dblTotalBill;

        System.out.println("Please enter the bill amount: ");
        dblBill = input.nextDouble();
        System.out.println("Please enter the amount of gratuity: ");
        dblGratuityRate = input.nextDouble();
        dblGratuityAmount = dblBill * (dblGratuityRate / 100);
        dblTotalBill = dblBill + dblGratuityAmount;
        System.out.printf("The gratuity is: $%.2f \n", dblGratuityAmount);
        System.out.printf("The total bill is: $%.2f \n", dblTotalBill);
    }

}
