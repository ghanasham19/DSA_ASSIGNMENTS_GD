class demo{
	public static void main(String[]args){
	int n=9;
	int a=n;
		for(int i=1;i<=n*2;i++){
			if(i<=n){				
				for(int j=1;j<=i;j++){
					System.out.print(j+" ");
				}
				for(int k=1;k<=2*(n-i);k++){
					System.out.print(" "+" ");
				}
				for(int l=i;l>=1;l--){
					System.out.print(l+" ");
				}
			}else{
				for(int j=1;j<=a;j++){
					System.out.print(j+" ");
				}
				for(int k=1;k<=2*(n-a);k++){
					System.out.print(" "+" ");
				}
				for(int l=a;l>=1;l--){
					System.out.print(l+" ");
				}
				a--;
			}


			System.out.println();


		}	
	
	}
}