package com.basic.interview.programs;

public class BinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[],int l,int r, int x)
    {
        if(r>=l)
        {
            int mid = l+(r-l)/2;
            //if the element is present at the middle itself
            if(arr[mid]==x)
            {
                return mid;
            }

            //if element is smaller than mid, then it can only be present in left subarray
            if(arr[mid]>x)
            {
                return binarySearch(arr,l,mid-1,x);
            }
            else
                return binarySearch(arr,mid+1,r,x);
        }
        //we reach here when elements are not found in array
        return -1;
    }

    //Driver method to test the above function
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int arr[] = {2,4,6,7,13,23,66,79,86};
        int n = arr.length;
        int x = 2;
        int result = bs.binarySearch(arr,0,n-1,x);
        if(result == -1)
            System.out.println("Element is not found");
        System.out.println("Element found at index: "+result);


    }


}
