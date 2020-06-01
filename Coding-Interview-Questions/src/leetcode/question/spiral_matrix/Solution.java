package leetcode.question.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void spiralOrder_ok(int[][] matrix) {
		int x = 0; // coulmn
		int y = -1; // row
		int index = 0;

		while (true) {
			int thislenght = 0;

			if (index % 2 == 0) {
				thislenght = matrix[0].length - (index / 2); // col_length 3 ,
			} else {
				thislenght = matrix.length - (index / 2) - 1; // row_length
			}

			if (thislenght == 0)
				return;
			int xIncr = 0;
			int yIncr = 0;
			switch (index % 4) { // 4 directions
			case 0:
				yIncr = 1;
				break;
			case 1:
				xIncr = 1;
				break;
			case 2:
				yIncr = -1;
				break;
			case 3:
				xIncr = -1;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + index % 4);
			}

			for (int i = 0; i < thislenght; i++) {
				System.out.print(matrix[x + (i + 1) * xIncr][y + (i + 1) * yIncr] + " , ");
			}
			x = x + thislenght * xIncr;
			y = y + thislenght * yIncr;

			index++;
		} // while

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// spiralOrder(matrix);

		int[][] matrix2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }};
		//spiralOrder2(matrix2);
		System.out.println(spiralOrderFinal(matrix2));

	}

	private static void spiralOrder2(int[][] matrix) {

		int startColumn = 0;
		int endColumn = matrix[0].length - 1;

		int startRow = 0;
		int endRow = matrix.length - 1;

		while (startColumn <= endColumn && startRow <= endRow) {

			// Top row
			for (int i = startColumn; i <= endColumn; i++) {
				System.out.print(matrix[startRow][i] + " , ");
			}
			startRow++; // Move to next Row

			// End Column
			for (int i = startRow; i <= endRow; i++) {
				System.out.print(matrix[i][endColumn] + " , ");
			}
			endColumn--; // Move to next

			// Bottom row
			for (int i = endColumn; i >= startColumn; i--) {
				System.out.print(matrix[endRow][i] + " , ");
			}
			endRow--; // Move to row up

			// First Column
			for (int i = endRow; i >= startRow; i--) {
				System.out.print(matrix[i][startColumn] + " , ");
			}
			startColumn++;
		}

	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		 
		
		
		List<Integer> list  = new ArrayList<Integer>();
		if(matrix == null || matrix.length == 0) return list;
		
		
		int endRow = matrix.length - 1;
		int startRow = 0;
		
		int endColumn = matrix[0].length - 1;
		int startColumn = 0;
		

		
		while (startColumn <= endColumn && startRow <= endRow) {

			// Top row
			for (int i = startColumn; i <= endColumn; i++) {
				list.add(matrix[startRow][i]);
			}
			startRow++; // Move to next Row

			// End Column
			for (int i = startRow; i <= endRow; i++) {
				list.add(matrix[i][endColumn] );
			}
			endColumn--; // Move to next

			// Bottom row
			for (int i = endColumn; i >= startColumn; i--) {
				list.add(matrix[endRow][i] );
			}
			endRow--; // Move to row up

			// First Column
			for (int i = endRow; i >= startRow; i--) {
				list.add(matrix[i][startColumn]);
			}
			startColumn++;
		}
		
		return list;
	}
	
	
	public static ArrayList<Integer> spiralOrderFinal(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
 
        if(matrix == null || matrix.length == 0) return result;
 
        int endRow = matrix.length;
        int endColumn = matrix[0].length;
 
        int startRow=0; 
        int startColumn=0;
 
        while(endRow>0 && endColumn>0){
 
            //if one row/column left, no circle can be formed
            if(endRow==1){
                for(int i=0; i<endColumn; i++){
                    result.add(matrix[startRow][startColumn]);
                    startColumn++;
                }
                break;
            }else if(endColumn==1){
                for(int i=0; i<endRow; i++){
                    result.add(matrix[startRow][startColumn]);
                    startRow++;
                }
                break;
            }
 
            //below, process a circle
 
            //top - move right
            for(int i=0;i<endColumn-1;i++){
                result.add(matrix[startRow][startColumn]);
                startColumn++;
            }
 
            //right - move down
            for(int i=0;i<endRow-1;i++){
                result.add(matrix[startRow][startColumn]);
                startRow++;
            }
 
            //bottom - move left
            for(int i=0;i<endColumn-1;i++){
                result.add(matrix[startRow][startColumn]);
                startColumn--;
            }
 
            //left - move up
            for(int i=0;i<endRow-1;i++){
                result.add(matrix[startRow][startColumn]);
                startRow--;
            }
 
            startRow++; // move to next row
            startColumn++; // move to next column
            endRow=endRow-2; // as we covered two rows so remove that 
            endColumn=endColumn-2; // // as we covered two columns so remove that
        }
 
        return result;
    }

}
