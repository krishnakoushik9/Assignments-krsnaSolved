package krsnaSolved;

import java.util.Arrays;

public class searcha2dmatrixii {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,5},
                {4,6,7,8},
                {9,12,20,30}
        };
        int target = 30;
        int[] ans = search(matrix,target);
        System.out.println((Arrays.toString(ans)));
    }
    static int[] search(int[][] matrix,int target){
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(target == matrix[row][col]){
                return new int[]{row,col};
            }
            if (target > matrix[row][col]){
                row ++;
            }
            else {
                col --;
            }
        }return new int[]{-1,-1};
    }
}
