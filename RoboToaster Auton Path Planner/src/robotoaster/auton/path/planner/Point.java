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
public class Point {
    int X, Y;
    
    Point(int X, int Y){
        this.X = X;
        this.Y = Y;
    }
    
    int getX(){
        return X;
    }
    
    int getY(){
        return Y;
    }
    
}
