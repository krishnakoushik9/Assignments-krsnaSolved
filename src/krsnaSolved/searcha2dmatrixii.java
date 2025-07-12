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
        boolean ans = search(matrix,target);
        System.out.println((ans));
    }
    static boolean search(int[][] matrix,int target){
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] < target){
                row ++;
            }else{
                col --;
            }
        }return false;
    }
}
