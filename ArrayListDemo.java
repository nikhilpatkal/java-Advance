//example of ArrayListDemo 
import java.util.*;
class ArrayListDemo
{
	public static void main(String[]args)
	{
		ArrayList al=new ArrayList();//this is initialization of ArrayList()
		System.out.println("content of befor add"+al);
		System.out.println("size of array befor fill="+al.size());//this is use to show size of array
		al.add(0,"AAA");//this  is use to add value in array
		al.add(1,"BBB");//(index,value)
		al.add(2,"CCC");
		al.add(3,12);//we can add any type of value in ArrayList
		System.out.println("after fill content in arr="+al.size());
		System.out.println("after fill content arr is="+al);
		al.remove("DDD");//remove use to remove cuntent of array
		System.out.println("after remove value of array is="+al);
		}
}