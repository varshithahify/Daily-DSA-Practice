package recursion;

import java.util.Arrays;

public class Day23_MazePrint {
static void path(String p,boolean[][] maze,int r,int c, int[][] path, int step) {
	if(!maze[r][c]) {
		return;
	}
	path[r][c]=step;
	if(r==maze.length-1 && c==maze[0].length-1) {
		for(int[] arr:path) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(p);
		System.out.println();
		return;
	}
	maze[r][c]=false;
	
	if(r<maze.length-1)
		path(p+"D",maze,r+1,c,path,step+1);
	
	if(c<maze[0].length-1)
		path(p+"R",maze,r,c+1,path,step+1);
	
	if(r>0)
		path(p+"U",maze,r-1,c,path,step+1);
	
	if(c>0)
		path(p+"D",maze,r,c-1,path,step+1);
	
	maze[r][c]=true;
	path[r][c]=0;
	}
public static void main(String[] args) {
	boolean[][] maze= {
			{true,true,true},
			{true,true,true},
			{true,true,true}
	};
	int[][] path=new int[maze.length][maze[0].length];
	path("", maze,0,0,path,1);
}

}
