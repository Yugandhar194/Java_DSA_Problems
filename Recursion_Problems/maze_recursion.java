public class maze_recursion {

//Maze Code -> Rat can move only from start to end via right & down only

    public static int countPaths(int i, int j, int n, int m) {
        // 2 Base Cases
        if ( i == n || j == m) {
            return 0;
        }
        if ( i == n-1 && j == m-1) {
            return 1;
        }

        //move downwards
        int down = countPaths(i+1, j, n, m);

        //move right
        int right = countPaths(i, j+1, n, m);

        return down+right;

    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int total = countPaths(0, 0, n, m);
        System.out.println(total);

        //Time Complexity : Can't be determined
    }
}
