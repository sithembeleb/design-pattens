package za.personal.prototype;

public class Line {
    public Point start, end;

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Line deepCopy()
    {
        Point newStart = new Point(start.x, start.y);
        Point newEnd = new Point(end.x, end.y);
        return new Line(newStart, newEnd);
    }


}