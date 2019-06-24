package sorting;

/**
 * Time complexity:
 * 
 * Worst Case -> Big Oh(n*n)
 * Average Case -> Big Oh(n*n)
 * Best possible case -> Big Oh(n*n)
 * 
 * 
 * Bubble Sort Vs Selection Sort
 * 
 * In BS our target is to set the max number at right most index by swapping.
 * In SS our target is to set min number at left most index by swapping.
 * 
 * In BS best possible case complexity is O(n) because we can check if swapping not done means array already sorted.
 * In SS best possible case also is O(n*n) because here we reach at last index at last iteration.
 * 
 * @author Lovish Pahwa
 *
 */
public class SelectionSort
{

   static int[] arr = { 20, 3, 5, 2, 1, 89, 54 };
   static int temp = 0;

   //a simple print function just for better readability.
   static void print( int[] array )
   {
      System.out.println();
      System.out.print( "array - > " );
      for ( int i = 0; i < array.length; i++ )
      {
         if ( i != 0 )
            System.out.print( "," );
         System.out.print( array[ i ] );
      }
      System.out.println();
   }

   static void normalWay()
   {
      //int count = 0;
      print( arr );
      for ( int k = 0; k < arr.length; k++ )
      {
         for ( int i = k+1; i < arr.length; i++ )//starting from k+1 because from o-k array already sorted.
         {
            //count++;
            if ( arr[ k ] > arr[ i ] ) //we assumed that arr[k] is minimum so if anyone else found lesser then that then swap.
            {
               temp = arr[ k ];
               arr[ k ] = arr[ i ];
               arr[ i ] = temp;
               temp = 0;
            }
         }
      }
      print( arr );
      //System.out.println( count );
   }

   public static void main( String arg[] )
   {
      /**
       * Time complexity is Big Oh(n*n)
       */
      normalWay();
      
   }
}
