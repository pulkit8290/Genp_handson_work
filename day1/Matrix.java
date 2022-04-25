package com.org.genp.day1;
import java.util.Scanner;

public class Matrix {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number Of Rows");
         
        int matrixRow = sc.nextInt();
         
        System.out.println("Enter The Number Of Columns");
         
        int matrixCol = sc.nextInt();
        int[][] matrix = new int[matrixRow][matrixCol];
        int[][] transpose = new int[matrixCol][matrixRow];
        EnterData(sc, matrix, matrixRow, matrixCol);
        Transpose(matrix,transpose,matrixRow, matrixCol);
        
        PrintMatrix(matrix, matrixRow, matrixCol);
        PrintTransposeMatrix(transpose, matrixRow, matrixCol);
        SumMatrix(transpose, matrixRow, matrixCol);
  }
  public static void EnterData(Scanner sc, int[][] matrix, int matrixRow, int matrixCol){
     System.out.println("Enter Data");
          
          for (int i = 0; i < matrixRow; i++)
          {
              for (int j = 0; j < matrixCol; j++)
              {
                  matrix[i][j] = sc.nextInt();
              }
          }
  }
  public static void Transpose(int[][] matrix,int[][] transpose, int matrixRow, int matrixCol){
		  
	      for(int i = 0; i < matrixRow; i++) {
	          for (int j = 0; j < matrixCol; j++) {
	              transpose[j][i] = matrix[i][j];
	          }}
	      }
  public static void PrintMatrix(int[][] matrix, int matrixRow, int matrixCol){
	    System.out.println("Matrix after data entered is : ");
	        
	        for (int i = 0; i < matrixRow; i++)
	        {
	            for (int j = 0; j < matrixCol; j++)
	            {
	                System.out.print(matrix[i][j]+"\t");
	            }
	             
	            System.out.println();
	        }}
  public static void PrintTransposeMatrix(int[][] transpose, int matrixRow, int matrixCol){
    System.out.println("Matrix after transpose is : ");
        
        for (int i = 0; i < matrixCol; i++)
        {
            for (int j = 0; j < matrixRow; j++)
            {
                System.out.print(transpose[i][j]+"\t");
            }
             
            System.out.println();
        }}
   public static void SumMatrix(int[][] transpose, int matrixRow, int matrixCol){
     System.out.println("Sum to each column of a Matrix is : ");  
   for(int i = 0; i < matrixRow; i++){  
         int sumCol = 0;  
            for(int j = 0; j < matrixCol; j++){  
              sumCol = sumCol + transpose[j][i];  
            }  
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);  
        }  
  }
}



