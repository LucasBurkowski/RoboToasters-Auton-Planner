/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotoaster.auton.path.planner;

import java.util.*;
import AutonPlanner.Field;
import java.awt.geom.*;
/**
 *
 * @author Lucas
 */
public class RoboToasterAutonPathPlanner {
    public LinkedList distances = new LinkedList();
    public LinkedList angles = new LinkedList();
    public LinkedList finalDistances = new LinkedList();
    
    public void getDistances(LinkedList points){
        for(int i = 0; i < points.size() - 1; i++){
            double distance = 0;
            Point2D first = (Point2D) points.get(i);
            Point2D second = (Point2D) points.get(i + 1);
            distance = first.distance(second);
            distances.add(distance);
        }
        System.out.println(distances);
    }
    
    public void getAngles(LinkedList points){
        Point2D one = (Point2D) points.get(0);
        Point2D two = (Point2D) points.get(1);
        double start = Math.atan2(one.getY() - two.getY(),
                               one.getX() - two.getX());
        start = start * 180/Math.PI;
        for(int i = 0; i < points.size() - 2; i++){
            double angle = 0;
            double angle2 = 0;
            double finalAngle = 0;
            Point2D first = (Point2D) points.get(i);
            Point2D second = (Point2D) points.get(i + 1);
            Point2D third = (Point2D) points.get (i + 2);
            angle = Math.atan2(one.getY() - two.getY(),
                               one.getX() - two.getX());
            angle2 = Math.atan2(second.getY() - third.getY(), 
                                second.getX() - third.getX());
            finalAngle = 0-angle2;
            finalAngle = finalAngle * 180/Math.PI;
            if (finalAngle > 0){
                angles.add(((360 - finalAngle) - start) * -1);
            }
            if (finalAngle < 0){
                angles.add((360 + finalAngle) - start);
            }
        }
        System.out.println(angles);
    }
    
    public void convertToInches(LinkedList distance){
        for(int i = 0; i < distance.size(); i++){
            double newDistance = ((double) distance.get(i)) * 0.2;//This is the converison of pixels to inches
            finalDistances.add(newDistance);
        }
        System.out.println(finalDistances.toString());
    }
    
}
