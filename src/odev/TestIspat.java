package odev;

import java.util.Random; 


public class TestIspat {
	static HybridArray<Integer> HybridArray;
	public static void main(String[] args) {
		HybridArray = new HybridArray<Integer>();
		for(int i =1 ;i < 10000 ;i++)
			HybridArray.addLast(i);

		long start = System.currentTimeMillis();
		HybridArray.addFirst(0);
		long end = System.currentTimeMillis();
		System.out.println("addFirst :"+(end - start) / 1000F);
		
		 start = System.currentTimeMillis();
		 long i = HybridArray.size();
		 end = System.currentTimeMillis();
		 System.out.println("size() : "+ (end - start) / 1000F);
		 
		 start = System.currentTimeMillis();
		 int val = HybridArray.get(new Random().nextInt(10000));
		 end = System.currentTimeMillis();
		 System.out.println("get() : "+(end - start) / 1000F);
		 
		 start = System.currentTimeMillis();
		 HybridArray.addLast(10000);
		 end = System.currentTimeMillis();
		 System.out.println("addLast()"+(end - start) / 1000F);
		 
		 start = System.currentTimeMillis();
		 HybridArray.clear();
		 end = System.currentTimeMillis();
		 System.out.println("clear(): "+(end - start) / 1000F);
		 
		 
		 start = System.currentTimeMillis();
		 HybridArray.removeAt(new Random().nextInt(10000));
		 end = System.currentTimeMillis();
		 System.out.println("removeAt(): "+(end - start) / 1000F);
		 
		 start = System.currentTimeMillis();
		 HybridArray.removeFrist();
		 end = System.currentTimeMillis();
		 System.out.println("removeFrist(): "+(end - start) / 1000F);
		 
		 start = System.currentTimeMillis();
		 HybridArray.removeLast();
		 end = System.currentTimeMillis();
		 System.out.println("removeLast(): "+(end - start) / 1000F);
		 
		 

		 
	}
}
