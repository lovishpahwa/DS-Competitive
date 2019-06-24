package sorting;
/**
 * Time complexity:
 * 
 * Worst Case -> Big Oh(n*n)
 * Average Case -> Big Oh(n*n)
 * Best possible case -> Big Omega (n)
 * 
 * @author Lovish Pahwa
 *
 */
public class BubbleSort
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
      print( arr );
      for ( int k = 0; k < arr.length; k++ )
      {
         for ( int i = 0; i < arr.length - k - 1; i++ )
         {
            if ( arr[ i ] > arr[ i + 1 ] ) //if true -> swap
            {
               temp = arr[ i ];
               arr[ i ] = arr[ i + 1 ];
               arr[ i + 1 ] = temp;
               temp = 0;
            }
         }
      }
      print( arr );
   }

   static void bestPossibleWay()
   {
      print( arr );
      boolean isSwapingDone = false;
      for ( int k = 0; k < arr.length; k++ )
      {
         for ( int i = 0; i < arr.length - k - 1; i++ ) // by (-k) it becomes slightly better/fast, because now will not consider elements which are already at correct place.
         {
            if ( arr[ i ] > arr[ i + 1 ] ) //if true -> swap
            {
               temp = arr[ i ];
               arr[ i ] = arr[ i + 1 ];
               arr[ i + 1 ] = temp;
               temp = 0;
               isSwapingDone = true;
            }
         }
         if ( !isSwapingDone )
         { // if no swapping -> break , means array already sorted.
            break;
         }
      }
      print( arr );
   }

   public static void main( String arg[] )
   {
      /**
       * Time complexity is Big Oh(n*n)
       */
      normalWay();

      /**
       * Time complexity is Big Omega(n) in best case where sorting completed in only one swapping.
       */
      bestPossibleWay();
   }
}
