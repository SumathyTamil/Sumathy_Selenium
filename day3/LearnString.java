package week1.day3;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="Amazon";
//        char[] c = s1.toCharArray();
//		for(int i=c.length-1;i>=0;i--) {
//			System.out.print(c[i]);
//		}
		String s2="My name is Sumathy";
		String[] s3 = s2.split(" ");
		for(int i=s3.length-1;i>=0;i--) {
			System.out.println(s3[i]);
		}
	}
}
