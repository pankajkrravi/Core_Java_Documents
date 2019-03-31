import java.util.Scanner;

public class AddtwoMat {
	int[][] readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows and colums: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		for(int i=0;i<mat.length;i++)
		{
			System.out.println("Enter "+i+1+ " rows " +mat[i].length+" elements :");
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	void displayMat(int mat[][]){
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	int [][]addMat(int x[][],int y[][])
	{
		if(x.length!=y.length||x[0].length!=y[0].length)
		{
			System.out.println("order must be same: ");
			return null;
		}
		int[][] sum=new int[x.length][x[0].length];
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				sum [i][j]=x[i][j]+y[i][j];
			}
		}
		return sum;
		}
	}