package com.yogesh;

public class ReverseNum {
    public static void main(String[] args) {
//       int a= rev1(2231);
//        System.out.println(a);
        System.out.println(countZeros(30002300,0));
    }
    static int sum=0;
    public static void rev(int n){

        if(n==0){
           return;
        }
        sum=sum*10 + n%10;
        rev(n/10);
    }

    public static int rev1(int n){

        if(n%10==0){
            return n;
        }

        return (n%10 * (int)Math.pow(10,(int)Math.log10(n))) + rev1(n/10);
    }

//special pattern how to pass value to above calls
    // in this we are returning count only once when it reached to base condition
    // after that it return same count to all the function calls

    //special example to return same value to above function calls
    static int countZeros(int n ,int c){
        if(n==0){
            return c;
        }
        if (n%10==0){
//            return countZeros(n/10,c+1);
            c++;
        }
        return countZeros(n/10,c);
    }
}

