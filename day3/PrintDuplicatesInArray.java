package week1.day3;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {2,5,7,7,5,9,2,3};
		Arrays.sort(marks);
		for(int i=0;i<marks.length-1;i++) {
			   //   if((i+1)!=marks.length) {
				if(marks[i]==marks[i+1]) {
					System.out.println("Duplicate value is:"+marks[i]);
				//}
			}
		}
	}

}
