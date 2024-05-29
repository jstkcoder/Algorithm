package PRACTICE;
// 2D 그리드가 주어질 때, 1은 땅을 의미하고 0은 물을 의미한다. 섬의 개수를 계산하는 함수를 작성하시오.
// 섬은 상하좌우로 연결된 땅의 집합을 의미한다.
public class DFS_NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numIslands += 1;
                    dfs(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    private void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0'; // 방문한 땅은 0으로 표시

        // 상, 하, 좌, 우로 이동
        dfs(grid, i - 1, j); // 위
        dfs(grid, i + 1, j); // 아래
        dfs(grid, i, j - 1); // 왼쪽
        dfs(grid, i, j + 1); // 오른쪽
    }

    public static void main(String[] args) {
        DFS_NumberOfIslands solution = new DFS_NumberOfIslands();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int result = solution.numIslands(grid);
        System.out.println("섬의 개수는: " + result);
    }
}
