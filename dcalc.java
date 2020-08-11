package disccalc;
import java.util.Scanner;

public class dcalc {

	public static void main(String[] args) {
		int itemprice,disc,total,totaldisc;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter in the price of the item: ");
		itemprice = sc.nextInt();
		System.out.println("Please enter in the discount percentage: ");
		disc = sc.nextInt();
		totaldisc = (itemprice * disc/100);
		total = itemprice - totaldisc;
		System.out.println("Your total after the discount is: R" + total);
		
	}

}
