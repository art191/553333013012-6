package com.rmuti.datastructure.bin;

public class ArrayListPQ {
		ArrayList lst = new ArrayList();
		public void enQueue(Object e) {
			lst.add(e);
		}
		public Object deQueue() {	
			Object a = lst.get(maxIndex());
			lst.remove(maxIndex());
			return a;
		}
		public int maxIndex() {
		       int max = 0;
		       for (int i = 0; i < lst.size(); i++) {
		                 Comparable d = (Comparable) lst.get(i);
		                 Object maxObj = lst.get(max);
		                 if (d.compareTo(maxObj) > 0) {
		                            max = i;
		                 }
		       }
		       return max;
		}


}