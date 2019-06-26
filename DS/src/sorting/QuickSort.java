package sorting;

/**
 * Time complexity:
 * 
 * Worst Case -> Big Oh(n*n)
 * Average Case -> Big Oh(nlogn) OR Big theeta(nlogn)
 * Best possible case -> Big Oh(nlogn) OR Big Omega(nlogn)
 * 
 * Quick Sort vs Merge Sort
 * Merge sort complexity in worst case is O(nlogn) and quick sort's is O(n*n),
 * But Quick sort is still faster then merge sort.
 * 
 * In this sol we are taking last elem as pivot but quick sort can be improved and work with O(nlogn) 
 * if we choose pivot by other following methods as listed below:
 * 1.) choose random number as pivot.
 * 2.) choose mid element as pivot.
 * 
 * @author Lovish Pahwa
 *
 */

public class QuickSort
{

   static int[] arr = { 20, 3, 5, 2, 1, 89, 54 };

   //a simple print function just for better readability.
   public static void print( int[] array )
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

   int partition( int[] array, int beg, int end )
   {
      int partitionIndex = beg;
      int pivotIndex = end;
      for ( int i = beg; i < end; i++ )
      {
         if ( array[ i ] < array[ pivotIndex ] )
         {
            int temp = array[ i ];
            array[ i ] = array[ partitionIndex ];
            array[ partitionIndex ] = temp;
            partitionIndex = i;
         }
      }
      int temp = array[ partitionIndex ];
      array[ partitionIndex ] = array[ pivotIndex ];
      array[ pivotIndex ] = temp;
      return partitionIndex;
   }

   public void sort( int[] array, int beg, int end )
   {
      if ( beg >= end )
      {
         return;
      }

      int partitionIndex = partition( array, beg, end );
      sort( array, beg, partitionIndex - 1 );
      sort( array, partitionIndex + 1, end );
   }

   public static void main( String arg[] )
   {
      /**
       * Time complexity is Big Oh(n*n) (in worst case)
       */
      QuickSort sortObj = new QuickSort();
      print( arr );
      sortObj.sort( arr, 0, arr.length - 1 );
      print( arr );
   }

}
