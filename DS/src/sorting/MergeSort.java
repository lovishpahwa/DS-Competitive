package sorting;

/**
 * Time complexity:
 * 
 * Worst Case -> Big Oh(nlogn)
 * Average Case -> Big Oh(nlogn) OR Big theeta(nlogn)
 * Best possible case -> Big Oh(nlogn) OR Big Omega(nlogn)
 * 
 * @author Lovish Pahwa
 *
 */

public class MergeSort
{

   static int[] arr = { 20, 3, 5, 2, 1, 89, 54 };

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

   void merge( int[] array, int beg, int mid, int end )
   {
      int l = mid - beg + 1; // length of left array.
      int r = end - mid; // length of right array.
      int[] left = new int[ l ];
      int[] right = new int[ r ];
      for ( int i = 0; i < l; i++ )
      {
         left[ i ] = array[ beg + i ];
      }
      for ( int i = 0; i < r; i++ )
      {
         right[ i ] = array[ mid + 1 + i ];
      }

      int i = 0;
      int j = 0;
      int k = beg; // k is used to access original array that's why setting beg value in it.
      while ( i < l && j < r )
      {
         if ( left[ i ] <= right[ j ] )
         {
            array[ k ] = left[ i ];
            i++;
         }
         else
         {
            array[ k ] = right[ j ];
            j++;
         }
         k++;
      }
      
      /**
       * Below two whiles are added
       * because one of the array left/right may be have one more value so to handle that value this below whiles are added.
       */
      while ( i < l )
      {
         array[ k ] = left[ i ];
         i++;
         k++;
      }
      while ( j < r )
      {
         array[ k ] = right[ j ];
         j++;
         k++;
      }
   }
   
   void sort( int[] array, int beg, int end )
   {
      if ( beg >= end )
      {
         return;
      }
      int mid = ( beg + end ) / 2;
      sort( array, beg, mid ); // recursion occurs here for further dividing.
      sort( array, mid + 1, end );
      merge( array, beg, mid, end );
   }

   public static void main( String arg[] )
   {
      /**
       * Time complexity is Big Oh(nlogn)
       */
      MergeSort sortObj = new MergeSort();
      print( arr );
      sortObj.sort( arr, 0, arr.length - 1 );
      print( arr );
   }

}
