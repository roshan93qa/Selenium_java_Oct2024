package String_29_10;

public class CountSmallUpperSpecial {

	public static void main(String[] args) {
		 String str="I am Java DevelOPer @123!!";
		 int countSmall=0;
		 int countCaps=0;
		 int countNum=0;
		 int countSpe=0;
		 for(int i=0;i<str.length();i++) {
			 char c=str.charAt(i);
			 if('a'<=c && c<='z') {
				 countSmall++;
			 }else if('A'<=c && c<='Z') {
				 countCaps++;
			}else if('1'<=c && c<='9') {
				 countNum++;
			}else {
				countSpe++;
			}
		}
		 System.out.println(countSmall);
		 System.out.println(countCaps);
		 System.out.println(countNum);
		 System.out.println(countSpe);
	}

}
