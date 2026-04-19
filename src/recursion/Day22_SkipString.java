package recursion;

public class Day22_SkipString {
	static void skip(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		if(up.startsWith("banana")) {
			skip(p,up.substring(6));
		}
		else {
			skip(p+up.charAt(0),up.substring(1));
		}
	}
	public static void main(String[] args) {
		skip("","baabananaacd");
	}

}
