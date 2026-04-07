package recursion;

public class Day17_Triangle1 {
	static void triangle(int r, int c) {
		if(r==0) {
			return;
	}
	if(c<r) {
			System.out.print("*");
			triangle(r,c+1);
		}
		else {
			System.out.println( );
			triangle(r-1,0);
		}
	}
public static void main(String[] args) {
triangle(4,0);
}
}
//	int n=5;
//	for(int i=n;i>=1;i--) {
//		for(int j=1;j<=n-i;j++) {
//			System.out.print(" ");
//		}
//		for(int j=1;j<=i;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	for(int i=1;i<=n;i++) {
//		for(int j=n-i;j>=1;j--) {
//			System.out.print(" ");
//		}
//		for(int j=1;j<=i;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//}
//}
