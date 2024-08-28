/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static int smallest_sub_arr(int[] arr, int n, int k) {
	    int min_len = Integer.MAX_VALUE;
	    for(int i=0;i<n;i++){
	        int currentOR = 0;
	        for(int j = i; j < n;j++){
	            currentOR |= arr[j];
	            
	            if(currentOR >= k){
	                min_len = Math.min(min_len, j-1+i);
	                break;
	            }
	            
	            }
	        }
	        return min_len == Integer.MAX_VALUE ? -1 : min_len;
	    }
		public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    
		    int[] arr = new int[n];
		    for(int i=0; i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    
		    int k = sc.nextInt();
		    int result = smallest_sub_arr(arr,n,k);
		    System.out.println(result);
		}
	}
