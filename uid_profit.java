/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int[] uid = new int[n];
        for(int i = 0; i<n;i++){
         uid[i] = s.nextInt();
        }
        int [] profit = new int[n];
        for(int i=0;i<n;i++){
             profit[i] = s.nextInt();
        }
        int ans= 0;
        int maxval = 0;
        for(int i=0;i<n;i++){
            maxval = Math.max(maxval,profit[i]); {
                for(int j=i+1;j<n;j++){
                    if(uid[i]==uid[j]){
                        maxval = Math.max(maxval,profit[j]);
                    }
                    else{
                        i=j-1;
                        break;
                    }
                }
                
                ans +=maxval;
                maxval=0;
                
                
            }
        }
        System.out.println(ans);
    }
}
