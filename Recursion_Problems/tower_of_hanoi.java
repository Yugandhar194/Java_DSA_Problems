class towerOfHanoi { 
	public static void towerOfHanoi( int n, char src_rod, char dest_rod, char helper_rod)       //Creating a function
	{ 
		if (n == 0) { 
			return;         //Base Case
		} 
		towerOfHanoi(n - 1, src_rod, helper_rod, dest_rod); 
		System.out.println("Move disk " + n + " from rod "+ src_rod + " to rod "+ dest_rod);    //Work of Recursive function
		towerOfHanoi(n - 1, helper_rod, dest_rod, src_rod); 
	} 
	// Driver code 
	public static void main(String args[]) 
	{ 
		int N = 2 ; 
		// A, B and C are names of rods 
		towerOfHanoi(N, 'A', 'C', 'B'); 
	} 
}