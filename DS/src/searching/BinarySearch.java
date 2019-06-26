package searching;

import sorting.QuickSort;

/**
 * Time complexity:
 * 
 * Worst Case -> Big Oh(logn)
 * Average Case -> Big Oh(logn) OR Big theeta(logn)
 * Best possible case -> Big Oh(logn) OR Big Omega(logn)
 
 * @author Lovish Pahwa
 *
 */
public class BinarySearch
{
   static int[] arr = { 20, 3, 5, 2, 1, 89, 54 };

   int binarySearch( int[] array, int low, int high, int key )
   {
      while ( low <= high )
      {
         int mid = ( low + high ) / 2;
         if ( key < array[ mid ] )
         {
            high = mid - 1;
         }
         else if ( key > array[ mid ] )
         {
            low = mid + 1;
         }
         else
         {
            return mid;
         }
      }
      return -1;
   }

   public static void main( String[] args )
   {
      /**
       * lets sort the array because Binary search only works for sorted array.
       */
      QuickSort.print( arr );
      QuickSort sort = new QuickSort();
      sort.sort( arr, 0, arr.length - 1 );
      QuickSort.print( arr );

      BinarySearch search = new BinarySearch();
      System.out.println( "Key '" + 5 + "' is present at index - " );
      System.out.println( search.binarySearch( arr, 0, arr.length - 1, 5 ) );
   }

}
