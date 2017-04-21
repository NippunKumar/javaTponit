package tutorial;

public class Tutor {
	public static void main(String args[]){
	      // String str = "Param";
	       
	      String str2 = new String("Param");
	      String str1=str2.intern();
	      
	      String str3 = "ABCD";
	      
	      System.out.println(str1==str2);
	      //System.out.println(str==str3);
	}
	
}
