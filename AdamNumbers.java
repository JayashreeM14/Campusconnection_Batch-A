import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int	n = sc.nextInt();
	    int a = n * n;
	    System.out.println(a);
	    int b = 0;
	    while(n != 0){
	        int digit = n % 10;
	        b = b * 10 + digit;
	        n = n / 10;
	        
	    }
	    
	    System.out.println(b);
	    int reverse = b * b;
	    System.out.println(reverse);
	    int c = 0;
	    while(reverse != 0){
	        int digit = reverse % 10;
	        c = c * 10 + digit;
	        reverse = reverse / 10;
	        
	    }
	    
	    System.out.println(c);
	    
	    if( a == c){
	        System.out.println("Adam numbers");
	    }
	    else{
	        System.out.println("Not an Adam number");
	    }
	    
	    
	}
}