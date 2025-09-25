package DSA;
//import java.util.Arrays;
public class BinarySearch {
    int binarysearching(int[] arr, int n,int target){
        int low = 0, high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target==arr[mid]) return mid;
            else if(arr[mid]<target) low = mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,12,25,36,47,110,130};
        int n = 9;
        int target = 110;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarysearching(arr,n,target));
    }
}
