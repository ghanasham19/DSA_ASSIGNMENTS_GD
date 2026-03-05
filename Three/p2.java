class demo{
	public static void main(String[]args){
		int n=11;
		for(int i=1;i<=n*2;i++){
			int a=n;
			int b=n+1;	
			for(int j=1;j<=n*2;j++){
				
				if(j<=n){
					if(j>i||i+j>n+b){
						System.out.print(" "+" ");
					}else{
					 	System.out.print(j+" ");
					}
				}
				if(j>n){
					if(j<i||i+j<=n*2){
						System.out.print(" "+" ");
						a--;
					}else{
					 	System.out.print(a+" ");
						a--;
					}
				}

						
			}
		System.out.println();
		}

	}
}