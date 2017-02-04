/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3;
import java.util.Scanner;
/**
 *
 * @author Eddie
 */
public class HW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        double[][] b = {{4,2,4}, {2,3,4}, {3,6,1}};
        System.out.println("Enter matrix1: ");      
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                a[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Enter matrix2: ");
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                b[i][j] = sc.nextDouble();
            }
        }
        System.out.println("The multiplication of the matrices is");
        double[][] c = multiplyMatrix(a,b);

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                System.out.print(a[i][j]);
                System.out.print("  ");
            }
            
            if(i == 1){
                System.out.print(" *  ");
            }else{
                System.out.print("   ");
            }
            for(int j = 0;j < 3;j++){
                System.out.print(b[i][j]);
                System.out.print("  ");
            }
            if(i == 1){
                System.out.print(" =  ");
            }else{
                System.out.print("   ");
            }
            for(int j = 0;j < 3;j++){
                System.out.print(c[i][j]);
                System.out.print("  ");
            }
            System.out.print("\n");
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[1].length];
        if (a[1].length == b.length) {    
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[1].length; j++) {
                    for (int k = 0; k < a[1].length; k++) {
                        c[i][j] += (a[i][k] * b[k][j]);
                    }
                }
            }
        }
        return c;
    }
}
