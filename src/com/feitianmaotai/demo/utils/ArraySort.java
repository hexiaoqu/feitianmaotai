package com.feitianmaotai.demo.utils;

import java.util.Arrays;

/**
 * 数组操作类
 * 
 * @author 13721
 *
 */
public class ArraySort {
	/**
	 * 正序
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] positiveArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * 降序
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] converseArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * 输出最终数组
	 * 
	 * @param arr
	 */
	public static void printArray(int[] arr) {
		System.out.print("新的数组c的内容为：");
		System.out.println(Arrays.toString(arr));
	}

}
