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
public class MyRectangle2D {
    double x;
    double y;
    double width;
    double height;
    
    MyRectangle2D(){
        x = 0;
        y = 0;
        width = 1;
        height = 1;        
    }
    
    MyRectangle2D(double x1, double y1,double w, double h){
        x = x1;
        y = y1;
        width = w;
        height = h;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double getwidth(){
        return width;
    }
    
    public double getheight(){
        return height;
    }
    public void setX(double ax){
        x = ax;
    }
    public void setY(double ay){
        y = ay;
    }
    public void setWidth(double aw){
        width = aw;
    }
    public void setHeight(double ah){
        height = ah;
    }
    
    public double getArea(){
        return (width * height);
    }
    
    public double getPerimeter(){
        return((2 * width) + (2 * height));
    }
    
    public boolean contains(double px,double py){
        if(px < x - width ){
            return false;
        }    
        if(px > x + width ){
            return false;
        }     
        if(py < y - height ){
            return false;
        }
        if(py > y + height){
            return false;
        }
        
        return true;
    }
    
    public boolean contains(MyRectangle2D r){
        if(contains(r.getX() + r.getwidth(),r.getY() + r.getheight()))
            return false;
        if(contains(r.getX() - r.getwidth(),r.getY() + r.getheight()))
            return false;
        if(contains(r.getX() + r.getwidth(),r.getY() - r.getheight()))
            return false;
        if(contains(r.getX() - r.getwidth(),r.getY() - r.getheight()))
            return false;
        
        return true;
    }
    
    public boolean overlaps(MyRectangle2D r){
        if(contains(r.getX() + r.getwidth(),r.getY() + r.getheight()) || contains(r.getX() - r.getwidth(),r.getY() + r.getheight()) || contains(r.getX() + r.getwidth(),r.getY() - r.getheight()) || contains(r.getX() - r.getwidth(),r.getY() - r.getheight()))
            return true;
        return false;
    }
    
}
