package com.day2.batch5.session3;

//https://www.techrbun.com/pascals-triangle-in-java-using-2d-array/
import java.util.Scanner;
class Pascal_Triangle
{//opening of class
    public static void main(String args[])
    {//opening of main
        Scanner sc=new Scanner(System.in);
        int n,i,j,a[][];
        //taking user's input.
        System.out.println("HOW MANY STEPS?");
        n=sc.nextInt();
        a=new int[n][n];
        //filling the 2D matrix.
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++)
                if(j==0 || j==i)
                    a[i][j]=1;
                else
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
        }
        //displaying the Pascal's Triangle as the output.
        System.out.println("\nOUTPUT:\n");
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
                System.out.print(a[i][j]+"\t");

            System.out.println();
        }
    }//clossing of main
}//closing of class