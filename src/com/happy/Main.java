
package com.happy;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner RT = new Scanner(System.in);
        System.out.println("what is side a?");
        int a= RT.nextInt();
        System.out.println("what is side b?");
        int b=RT.nextInt();
        System.out.println("what is c?");
        int c=RT.nextInt();
        if (rightTriangled(a,b,c))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }}
    static Boolean rightTriangled(int a,int b, int c){
//methode for right angled triangle to be called in the main
        if(( a*a)+ (b*b)==(c*c) )
            return true;
        else
            return false;
    }
}


