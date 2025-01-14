package basics.QonBS;

public class Mountain {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 9,5, 4, 3, 2};
        System.out.println(PeakIndexAtMountainArray(arr));
    }

    static int PeakIndexAtMountainArray( int arr[] ){
          int start = 0;
          int end = arr.length - 1;

          //for to get mid value 

          
          
          while (start<end) {
              
              int mid = start + (end-start)/2;

              if(arr[mid]>arr[mid+1]) {
                  //this is des part of array
                  // this may be ans but look at left 
                  //this is why end! = mid -1
                  end = mid;
                }
                else{
                    // acc part of array
                    start = mid + 1;
                    //bec we know that mid+1 ele > mid elem
             }
            
          }

          // at the end , start == end and pointing to the largest no. bec of 2 checks above 
          return end; // or return start as both are + 

    }
}
