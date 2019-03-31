import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
	//	System.out.println("enter number :");
		//int n[]=sc.nextInt();
		int[]array={11,34,56,77,88,99,123,456,2345};
		System.out.println("enter number :"+	binarySearch(array,99,0,array.length-1));
		//binarySearch(n, 0, 0, 0);
  
	}

	private static int binarySearch(int [] array,int key,int start,int end) {
	  if(start<=end){
		  int middle=(start+end)/2;
		  if(array[middle]>key){
			  return binarySearch(array,key,start,middle-1);
		  }else if(array[middle]<key){
			  return binarySearch(array,key,middle+1,end);
		  }else{
			  return middle;
		  }
	  }else{
		  return -1;
		  }
	  }
}


