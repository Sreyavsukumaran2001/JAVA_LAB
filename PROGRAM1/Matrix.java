
import java.util.*;
public class Matrix
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the rows:");
int m=sc.nextInt();
System.out.println("Enter the columns:");
int n=sc.nextInt();
int[][] m1=new int[m][n];
int[][] m2=new int[m][n];
int[][] sum=new int[m][n];
System.out.println("Enter the first matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
m1[i][j]=sc.nextInt();
}
}
System.out.println("Enter the second matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
m2[i][j]=sc.nextInt();
}
}
//addition of two matrix
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
sum[i][j]=m1[i][j]+m2[i][j];
}
}
System.out.println("sum of two matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(sum[i][j]+"\t");
}
System.out.println();
}
}
}
