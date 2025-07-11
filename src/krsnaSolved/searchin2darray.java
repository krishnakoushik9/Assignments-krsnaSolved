package krsnaSolved;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,3,6},
                {9,12,44},
                {15,67,1}
        };
        int target =2;
        System.out.println(searchMatrix(matrix,target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int end = m * n -1;
        int cols = matrix[0].length;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target>matrix[mid / cols][mid % cols]){
                start = mid + 1;
            }
            else if (target <matrix[mid / cols][mid % cols]){
                end = mid - 1;
            }
            else {
                return true;
            }
        }return false;
    }
}
