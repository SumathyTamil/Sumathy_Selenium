package week1.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test ="changeme";
		char[] ch = test.toCharArray();
		// TODO Auto-generated method stub
       for(int i=0;i<ch.length;i++) {
    	   if(i%2==0) {
    		   char result=Character.toUpperCase(ch[i]);
    		   System.out.print(result);
    	   }
    	   else {System.out.print(ch[i]);}
       }
	}

}
