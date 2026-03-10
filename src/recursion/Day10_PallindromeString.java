package recursion;

public class Day10_PallindromeString {
	static Boolean rev(String reverse,int i,int j) {
		if(i>=j) {
			return true;
		}
		if(reverse.charAt(i)!=reverse.charAt(j)) {
			return false;
		}
		return rev(reverse,i+1,j-1);
		}
		
	
public static void main(String[] args) {
	String reverse="abba";
	if(rev(reverse,0,reverse.length()-1)) {
		System.out.println("Pallindrome");
	}
	else
		System.out.println("Not Pallindrome");
}
}
