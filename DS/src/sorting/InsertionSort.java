package sorting;

/**
 * Time complexity:
 * 
 * Worst Case -> Big Oh(n*n)
 * Average Case -> Big Oh(n*n)
 * Best possible case -> Big Omega(n)
 * 
 * @author Lovish Pahwa
 *
 */

public class InsertionSort
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
      int j = 0;
      for ( int k = 0; k < arr.length; k++ )
      {
         temp = arr[ k ];
         j = k;
         while ( j > 0 && arr[ j - 1 ] > temp )
         {
            arr[ j ] = arr[ j - 1 ];
            j--;
         }
         arr[ j ] = temp;
      }
      print( arr );
   }

   public static void main( String arg[] )
   {
      /**
       * Time complexity is Big Oh(n*n)
       */
      normalWay();

   }

}
