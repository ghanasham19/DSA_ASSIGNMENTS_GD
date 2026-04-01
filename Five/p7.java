// method 1

import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int n = sc.nextInt();
	double sqr=Math.sqrt(n);
	System.out.println(sqr);
		for(int i=1;i<=sqr;i++){
			if(n%i==0){
				System.out.println(i);
				if(n/i!=i){
				System.out.println(n/i);
				}
			}	
		}
	}
}
