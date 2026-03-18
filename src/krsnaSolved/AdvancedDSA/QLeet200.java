package krsnaSolved.AdvancedDSA;

public class QLeet200 {
    public static void main(String[] args) {
        char[][] data ={
            {'1','1','1','0','0','0','1','0'},
            {'1','1','0','0','0','0','0','0'},
            {'0','0','0','0','0','1','0','1'},
            {'0','0','0','0','0','0','0','0'}
        };
        int result = numIslands(data);
        System.out.println(result);
    }
    public static int numIslands(char[][] grid){
        int no_OfIslands = 0;
        for(int i = 0;i< grid.length;i++){
            for(int j = 0;j < grid[i].length;j++){
                char c = grid[i][j];
                if(c == '1'){
                    no_OfIslands++;
                    dfs(grid,i,j);
                }
            }
        }
        return no_OfIslands;
    }

    public static void dfs(char[][] grid,int i,int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return ;
        }
        if(grid[i][j] == '0'){
            return ;
        }
        grid[i][j] = '0';
        //UP
        dfs(grid,i-1,j);
        //DOWN
        dfs(grid,i+1,j);
        //LEFT
        dfs(grid,i,j-1);
        //RIGHT
        dfs(grid,i,j+1);
    }
}
