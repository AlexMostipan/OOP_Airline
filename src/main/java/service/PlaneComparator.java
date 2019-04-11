package service;
import model.Plane;

import java.util.Comparator;

public class PlaneComparator implements Comparator<Plane> {
    @Override
    public int compare (Plane p1 , Plane p2){
        return new Integer(p1.getFlihtRange()).compareTo(p2.getFlihtRange());
    }
}
