public class call_guests_party {
    public static int callGuests(int n) {

        //Base case
        if ( n <= 1) {
            return 1;
        }
        //Single
        int ways1 = callGuests(n-1);

        //Pairs
        int ways2 = (n-1) * (callGuests(n-2));

        return ways1 + ways2;
    }
    public static void main(String[] args) {
        //Calling out the recursive function
        int n = 4;
        System.out.println(callGuests(n));
        
    }
}
