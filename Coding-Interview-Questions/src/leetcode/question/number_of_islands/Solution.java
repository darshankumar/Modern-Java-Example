package leetcode.question.number_of_islands;
class Solution {
    public static int numIslands(char[][] grid) {
    	if(grid==null || grid.length==0 ||grid[0].length==0) {
    		return 0;
    	}
    	// grid of 1 and 0
    	int count =0;
    	for(int i=0;i<grid.length;i++) {
    		for(int j=0;j<grid[i].length;j++) {
    			if(grid[i][j]=='1') {
					callBFS(grid,i,j);
					count+=1;
    			}
    		}
    		//System.out.println("-----");
    	}
		return count;
    }
    
    
    private static void callBFS(char[][] grid, int i, int j) {
		if(i < 0 || i>= grid.length || j < 0  || j>=grid[i].length || grid[i][j]!='1') 
			return; // border case
		
			grid[i][j]='V'; // mark as visited.
			
			callBFS(grid, i+1, j); // check in up
			callBFS(grid, i-1, j); // check in down
			callBFS(grid, i, j-1); // check in left
			callBFS(grid, i, j+1); // check in right
		}		
	


	public static void main(String[] args) {
		
    	char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
    	System.out.println(numIslands(grid));
    	
    	
    	char[][] grid2 = {
    			{'1','1','0','0','0'},
    			{'1','1','0','0','0'},
    			{'0','0','1','0','0'},
    			{'0','0','0','1','1'} };
    	
    	System.out.println(numIslands(grid2));
    	
    	
	}
	
}