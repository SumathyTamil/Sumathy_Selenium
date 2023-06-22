package week1.day3;

import java.util.Arrays;

import jdk.internal.misc.FileSystemOption;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!= (i+1)) {
		 System.out.print(i+1);
		 break;
		}}

	}

	
}
