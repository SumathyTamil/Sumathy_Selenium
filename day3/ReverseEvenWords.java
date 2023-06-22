package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am a software tester";
		String[] words=text.split(" ");
		//System.out.println(words.length);
		for(int i=0;i<words.length;i++) {
			if(i%2!=0) {
				
				String txt = words[i];
			char[] ch = txt.toCharArray();
			for(int j=ch.length-1;j>=0;j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
			}else
			System.out.print(words[i]+" ");
		}
	}

}
