package za.personal.prototype;

public class Evaluate
{
    public static void main(String[] args)
    {
        Line line1 = new Line(
                new Point(3, 3),
                new Point(10, 10)
        );

        Line line2 = line1.deepCopy();
        line2.end.x = 77;
        System.out.println(line1);
        System.out.println(line2);

    }
}
