package DSA;
//SOLVED
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int q=1;q<=T;q++){
            int N=sc.nextInt();
            int count=0;
            int counter=0;
            int res=0;
            if(N%5==0){
                res=(N/5);
            }
            else{
                res=((int)Math.ceil(N/5.0));
            }
            
            // for(int i=1;i<=N;i++){
            //     if(i%2==1 && counter==0){
            //         count++;
            //         System.out.println("count++;");
            //         counter=1;
            //     }
            //     else if(i%2==1){
            //         counter=0;
            //         System.out.println("else: "+i);
            //         if(i+2<=N){
            //             i=i+2;
            //             System.out.println("i=i+2");
            //         }
            //         else{
            //             break;
                        
            //         }
            //     }
            // }
            System.out.println("Case #"+q+": "+res);
        }
    }
}