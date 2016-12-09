/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotoaster.auton.path.planner;

/**
 *
 * @author Lucas
 */
public class Line {
    Point firstPoint, secondPoint;
    
    Line(){
        firstPoint = null;
        secondPoint = null;
    }
    
    Line(int X1, int Y1, int X2, int Y2){
        firstPoint = new Point(X1, Y1);
        secondPoint = new Point(X2, Y2);
    }
    
    public void setFirstPoint(int X1, int Y1){
        firstPoint = new Point(X1, Y1);
    }
    
    public void setSecondPoint(int X2, int Y2){
        secondPoint = new Point(X2, Y2);
    }
    
}
