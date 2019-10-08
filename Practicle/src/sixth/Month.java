package sixth;
import java.util.Scanner;
public class Month {
	public static void main(String[] args) {
		System.out.println("Ëntre the number of days ");
		Scanner Sc = new Scanner(System.in);
		int days = Sc.nextInt();
		int months = days/30;
		int new_days = days%30;
		System.out.println("total  months & days =" +months + "months" + new_days + "days");
	}
}