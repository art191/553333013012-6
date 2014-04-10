package com.rmuti.datastructure;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//--add data for Array list---///
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");
		//--Show data Array------//
		System.out.println(list);
		//--add "test5" to array[2]---//
		list.add(2, "test5");
		//--Show data Array------//
		System.out.println(list);
		//--add "test6" to array[First]---//
		list.addFirst("test6");
		//--Show data Array------//
		System.out.println(list);
		//--add "test7" to array[Last]---//;
		list.addLast("test7");
		//--Show data Array------//
		System.out.println(list);
		//--Remove array[4]is  "test4"
		list.remove(4);
		//--Show data Array------//
		System.out.println(list);
		
		

	}

}
