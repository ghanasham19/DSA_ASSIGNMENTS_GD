import java.util.*;
class demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Any Number: ");
		int n = sc.nextInt();
			for(int i =1;i<n*2;i++){	
				int diff=i-n;
				int a=1;
				for(int j=1;j<=n;j++){
					if(i+j<=n){
						System.out.print(" ");
					}else if(i>n&&diff>0){
						System.out.print(" ");
						diff--;
					}else{
						System.out.print(a+" ");
						a++;
					}
				}
				System.out.println();
			}
		
	}4
}


//output:
//Enter an Any Number:
//n=4
//   1
//  1 2
// 1 2 3
//1 2 3 4
// 1 2 3
 // 1 2
  // 1