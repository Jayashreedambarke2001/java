package corejava;

import java.util.Scanner;

public class SubMatrix {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Initializing array
        int i, j;
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        
        //creating scanner class object
        Scanner sc = new Scanner(System.in);
        
        //input for 1st matrix
        System.out.print("Enter 9 elements for first matrix: ");
        for(i=0; i<3; i++)
        {
           for(j=0; j<3; j++)
           {
              a[i][j] = sc.nextInt();
           }
        }
        
        //input for 2nd matrix
        System.out.print("Enter 9 elements for second matrix: ");
        for(i=0; i<3; i++)
        {
           for(j=0; j<3; j++)
           {
              b[i][j] = sc.nextInt();
           }
        }
        
        for(i=0; i<3; i++)
        {
           for(j=0; j<3; j++)
           {
              c[i][j] = a[i][j] - b[i][j];
           }
        }
        
        //Addition result
        System.out.println("\n----Substraction Result----");
        for(i=0; i<3; i++)
        {
           for(j=0; j<3; j++)
           {
              System.out.print(c[i][j]+ " ");
           }
           System.out.print("\n");
        }
     }
  


	



	}


