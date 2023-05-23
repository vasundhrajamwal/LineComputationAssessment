package com.bridgelabz.lineComparisonAssessment;
import java.util.Objects;
public class Line {
    double x1,y1,x2,y2;
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    @Override
    public String toString() {
        return "Line{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Double.compare(line.x1, x1) == 0 && Double.compare(line.y1, y1) == 0 && Double.compare(line.x2, x2) == 0 && Double.compare(line.y2, y2) == 0;
    }
}
