package com.rmuti.datastructure.bin;

import java.util.Arrays;


public class ClassTest {

	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("MAZDA","กระบะ",830000),
				new Car("MITSUBISHI","กระบะ",890000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));

	}
}