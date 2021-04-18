package logicalprgrams;

public class SumUsingForEachLoop {
	static int sum=0;
	public static void main(String...arg) {
		int arr[]=new int[] {1,2,3,4,5};
		for(int data : arr){
			sum=sum+data;
		}
		System.out.println(sum);
		
	}
	

}
