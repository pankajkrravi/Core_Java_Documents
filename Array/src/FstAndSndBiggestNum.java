
public class FstAndSndBiggestNum {

	public static void main(String[] args) {
		int ar[]={23,58,99,10,80,100,18,54,45};
		int fbig=ar[0];
		int sbig=ar[1];
		for(int i=1;i<ar.length;i++){
			if(ar[i]>fbig){
				sbig=fbig;
				fbig=ar[i];
			}
			else if(ar[i]>sbig&& ar[i]!=fbig)
				sbig=ar[i];
		}
		System.out.println("first biggest num  is: "+fbig);     
		System.out.println("second biggest num is : "+sbig);
	}
}

