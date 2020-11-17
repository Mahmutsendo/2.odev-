package odev;


public class Main {

	public static void main(String[] args) {
		int index = 3;
		HybridArray<Integer>  TestHybridArray = new HybridArray<Integer>();
		TestHybridArray.addLast(1);
		TestHybridArray.addLast(2);
		TestHybridArray.addLast(3);
		TestHybridArray.addFirst(0);
		System.out.println(TestHybridArray);
		TestHybridArray.removeFrist();
		System.out.println(TestHybridArray);
		TestHybridArray.removeLast();
		System.out.println(TestHybridArray);
		TestHybridArray.addFirst(0);
		System.out.println(TestHybridArray);
		TestHybridArray.addLast(3);
		TestHybridArray.addLast(4);
		TestHybridArray.addLast(5);
		TestHybridArray.addFirst(-1);
		System.out.println(TestHybridArray);
		System.out.println("After removing the midel value of TestHybridArray :"+TestHybridArray.get(TestHybridArray.size()/2));
		TestHybridArray.removeAt(TestHybridArray.size()/2);
		System.out.println(TestHybridArray);
		System.out.println("The Value of index "+index+" is "+TestHybridArray.get(index));
		System.out.println("The current size of our TestHybridArray is :"+TestHybridArray.size());
		TestHybridArray.insert(2, 3);
		System.out.println(TestHybridArray);
		TestHybridArray.clear();
		System.out.print("After clear the our TestHybridArray : ");
		System.out.println(TestHybridArray);
		System.out.println("The  size of current HybridArray is :"+TestHybridArray.size());
	}

}
