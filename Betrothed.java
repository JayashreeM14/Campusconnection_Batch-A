import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	int sum1 = 0, sum2 = 0;
	for(int i=1; i<n1; i++){
	    if(n1 % i == 0){
	        sum1 += i;
	    }
	}
	System.out.println(sum1);
	for(int i=1; i<n2; i++){
	    if(n2 % i == 0){
	        sum2 += i;
	    }
	}
	System.out.println(sum2);
	if(sum1 == n2+1 || sum2 == n1+1)
	{
	    System.out.println("Bethrothed Number");
	}
	else{
	    System.out.println("Not a Bethrothed Number");
	}
	    }
}