package com.bridgelabz.lineComparisonAssessment;
import java.util.Scanner;
import static com.bridgelabz.lineComparisonAssessment.LineComparison.getLength;

public class LineEqualityUC2 {
    public static void main(String[] args) {

        Line line1 = getLine();
        double lengthOfLine = getLength(line1);
        System.out.println("Length of line 1 is: " + lengthOfLine);
        Line line2 = getLine();
        double lengthOfLine2 = getLength(line2);
        System.out.println("Length of line 2 is " + lengthOfLine2);
        System.out.println(line1);
        System.out.println(line2);
        if(lengthOfLine == lengthOfLine2)
            System.out.println("both lines are equal");
        else
            System.out.println("lines are not equal");
    }

    public static Line getLine() {
        double x1, y1, x2, y2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for x1: ");
        x1 = scan.nextDouble();
        System.out.println("Enter value for y1: ");
        y1 = scan.nextDouble();
        System.out.println("Enter value for x2: ");
        x2 = scan.nextDouble();
        System.out.println("Enter value for y2: ");
        y2 = scan.nextDouble();
        Line line = new Line(x1, y1, x2, y2);
        return line;
    }
    public static double getLength(Line line){
        double lengthOfLine = Math.sqrt(Math.pow(line.x2 - line.x1, 2) + Math.pow(line.y2 - line.y1, 2));
        return lengthOfLine;
    }
}
