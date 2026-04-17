import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap<Integer,Integer> hm = new HashMap<>();
		int arr[]={1,2,2,2,2,3,4,4};
			for(int i =0;i<arr.length;i++){
				hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
			}
		// 1-1 , 2-2 , 3-3, 4-2
		int Max=arr[0];
		int s_Max=arr[0];
		for(int hi : hm.keySet()){
			if(hm.get(hi)>hm.get(Max)){
				s_Max=Max;
				Max=hi;
			}else if(hm.get(hi)>hm.get(s_Max)) s_Max=hi;	
		}
		
		System.out.println(s_Max);
	}
}