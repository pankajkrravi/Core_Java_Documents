public class Lab182 {
	public static void main(String[] args) {
		JLC:
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=3;j++)
				{
					if(j==3)
						break JLC;
					System.out.println(i+"\t"+j);
					//continue;
					//break;
				}
			}
	}
}
