class Segment
{
    Point A;
    Point B;
    
    Segment(Point A, Point B)
    {
        this.A = A;
        this.B = B;
        
        if (A.x == B.x && A.y == B.y)
        {
            throw new IllegalArgumentException("A segment's endpoints cannot be the same.");
        }
    }
    
    //Overloaded constructor
    Segment(double x1, double y1, double x2, double y2)
    {
        this.A = new Point(x1, y1);
        this.B = new Point(x2, y2);
        
        if (A.x == B.x && A.y == B.y)
        {
            throw new IllegalArgumentException("A segment's endpoints cannot be the same.");
        }
    }
}