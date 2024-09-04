public class place_tiles {
    //Recurisve Function
    public static int placeTiles(int n, int m) {
       //Base Case
        if ( n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        //vertically
        int vertPlacements = placeTiles(n-m, m);

        //horizontally
        int horizonPlacements = placeTiles(n-1, m);

        return vertPlacements + horizonPlacements;
    }
    public static void main(String[] args) {
        //Calling the recursive function
        int n = 4, m = 2;   
        System.out.println(placeTiles(n, m));

    }
}
