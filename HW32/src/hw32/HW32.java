/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw32;

/**
 *
 * @author Eddie
 */
public class HW32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyRectangle2D rect = new MyRectangle2D(2,2,5.5,4.9);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        if(rect.contains(3, 3)){
            System.out.println("Rect contains 3,3");
        }
        else{
            System.out.println("Rect does not contain 3,3");
        }
        MyRectangle2D rect2 = new MyRectangle2D(4,5,10.5,3.2);
        if(rect.contains(rect2)){
            System.out.println("Rect contains rect2");
        }
        else{
            System.out.println("Rect does not contain rect2");
        }
        MyRectangle2D rect3 = new MyRectangle2D(3,5,2.3,5.4);
        if(rect.overlaps(rect3)){
            System.out.println("Rect overlaps rect3");
        }
        else{
            System.out.println("Rect does not overlap rect3");
        }
           
    }
    
}
