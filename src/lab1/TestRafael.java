package lab1;

import java.util.Arrays;

public class TestRafael {

	public static void main(String[] args) {
		Rafael obj = new Rafael();
		//Rafael obj1 = new Rafael(1);
		String name = obj.getName();
		String Position = obj.getPosition();
		String arr[] = obj.getArr();
		System.out.println("Name:"+name);
		System.out.println("Position:"+Position);
		String[] arr2 = obj.getArr();
		System.out.println(Arrays.toString(arr2));
		
	}

}
