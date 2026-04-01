import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Your Number: ");
	int n = sc.nextInt();
	int nn=n;
	int nnn=n;
	int len=0;
	int arms=0;
		while(n>0){
			n=n/10;
			len++;
		}

		while(nn>0){
			int a=len;
			int rem = nn%10;
			int b=1;
				while(a>0){
					b*=rem;
					a--;
				}
			arms+=b;
			nn=nn/10;
			}

		if(arms==nnn){
		System.out.println("Number is Amstrome");
		}else{
		System.out.println("Number is not Amstrome");
		}
	}
}
	