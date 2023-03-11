import java.util.*;
public class Factors {
public static void main(String args[]) {
	int i,number,count=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	number = sc.nextInt();
	for(i=1;i<=number;i++) {
		if(number%i==0) {
			System.out.println(i);
			count++;
	   }
}
	System.out.println("Number of Factors "+count);

}
}
