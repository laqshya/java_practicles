package third;
import java.util.Random;
import java.util.Scanner;
public class Dandom {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("Entre any number");
		Scanner Sc = new Scanner(System.in);
		int x = Sc.nextInt();
		int rand_int1 = rand.nextInt(x); 
        int rand_int2 = rand.nextInt(x);
        int rand_int3 = rand.nextInt(x); 
        int rand_int4 = rand.nextInt(x);
        int rand_int5 = rand.nextInt(x);
        System.out.println("Random Integers: "+rand_int1); 
        System.out.println("Random Integers: "+rand_int2);
        System.out.println("Random Integers: "+rand_int3); 
        System.out.println("Random Integers: "+rand_int4);
        System.out.println("Random Integers: "+rand_int5);   
	}

}
