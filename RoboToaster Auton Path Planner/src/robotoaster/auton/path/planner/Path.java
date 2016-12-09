/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotoaster.auton.path.planner;


import java.util.LinkedList;
/**
 *
 * @author Lucas
 */
public class Path {
    LinkedList<Line> lines = new LinkedList();
    double startAngle;
    
    public Path(){
        startAngle = 0;
    }
    
    public void insert(int X2, int Y2){
        while(!lines.isEmpty()){
            if(lines.getLast().secondPoint == null){
                Line next = new Line();
                next.setFirstPoint(X2, Y2);
                lines.getLast().setSecondPoint(X2, Y2);
            }
        }
    }
    
    public void startPath(int X1, int Y1){
        Line start = new Line();
        start.setFirstPoint(X1, Y1);
        lines.addFirst(start);
    }
}
