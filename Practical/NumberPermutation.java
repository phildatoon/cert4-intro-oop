/* Datoon, Philip Bryan B.
 * 131311399
 * Practical - Permutation.java
 */
 
import java.util.Scanner;

public class NumberPermutation {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int[] num = new int[3];
      int temp = 0;
		
      for (int x = 0; x < 3; x++) {
         System.out.print("Enter num[" + x + "]: ");
         num[x] = sc.nextInt();
      }
		
		System.out.println();
		System.out.println("All possible permutations are:");
		permute(num, 0);		
	}
	
	public static void permute(int[] num, int x) {
		if (x == num.length) {
			for (int y = 0; y < num.length; y++) {
				System.out.print(num[y] + " ");
         }
         
			System.out.println();
		} else {
			for (int z = x; z < num.length; z++) {
				int temp;
				
				temp = num[x];
				num[x] = num[z];
				num[z] = temp;

				permute(num, x + 1);
				temp = num[x];
				num[x] = num[z];
				num[z] = temp;
			}
		}
	}
}