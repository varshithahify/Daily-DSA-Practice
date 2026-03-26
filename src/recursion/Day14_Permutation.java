package recursion;

public class Day14_Permutation {
	static void permute(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		
		for(int i=0;i<=p.length();i++) {
			String first=p.substring(0,i);
			String second=p.substring(i);
			permute(first+ch+second,up.substring(1));
					
		}
	}
 public static void main(String[] args) {
	permute("","abc");
	System.out.println("running");
	
}
}
