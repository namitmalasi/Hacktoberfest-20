import java.io.*;
class InsertionSort
{
public static void main(String args[])throws IOException
{
int arr[]=new int[7];
InputStreamReader ir= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.println("enter the values:");
for(int i=0;i<arr.length;i++)
{
arr[i]=Integer.parseInt(br.readLine());
}
for(int i=1;i<arr.length;i++)
{
	int key=arr[i];
	int j=i-1;
	while(j>=0&&arr[j]>key)
	{
	       arr[j+1]=arr[j];
	       j=j-1;
	}
	arr[j+1]=key;
}
System.out.println("the values after sorting are:");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}