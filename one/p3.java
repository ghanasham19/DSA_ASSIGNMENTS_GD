import java.util.*;
class demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		
		int n=sc.nextInt();
		int a=2;
		int v=1;
		for(int i=1;i<=n;i++){

			for(int j=1;j<=n;j++){
				
				System.out.print(v);
				v++;
			}
			System.out.println();
		}
	}
}