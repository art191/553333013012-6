package com.rmuti.datastructure;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList lst = new ArrayList();
		lst.add("test1");
		lst.add("test2");
		lst.add("test3");
		lst.add("test4");
		lst.add("test5");

		System.out.println(lst);

		System.out.println("\n");

		ArrayListStack stk = new ArrayListStack();

		stk.push('A');
		stk.push('B');
		stk.push('C');
		stk.push('D');
		stk.push('E');

		
		stk.Show_Stack();
		System.out.println("pop = " + stk.pop());
		stk.Show_Stack();

 System.out.println("");
		ArrayListQueue q = new ArrayListQueue();

		q.enQueue("A");
		q.enQueue("B");
		q.enQueue("C");
		q.enQueue("D");
		q.enQueue("F");
		q.enQueue("G");
		q.Show_Queue();
		System.out.println("De Queue = " + q.deQueue());
		q.Show_Queue();

		System.out.println("De Queue = " + q.deQueue());
		q.Show_Queue();

		System.out.println("De Queue = " + q.deQueue());
		q.Show_Queue();

		System.out.println("First Data = " + q.peek());

		System.out.println("Data in Queue = " + q.getSize());
	}
}
