package arrayList_Operations;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_to_Array 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> arrayList= new ArrayList<>();
		System.out.println("HOw many Elements to Enter in ArrayList");
		int size = s.nextInt();
		System.out.println("Enter the Elements..");
		for(int i=0;i<=size-1;i++)
		{
			arrayList.add(s.nextInt());
		}
		Integer[] arr = new Integer[arrayList.size()];
		arrayList.toArray(arr);
		for(Integer ele : arr)
		{
			System.out.println(ele +" ");
		}
	}
}
