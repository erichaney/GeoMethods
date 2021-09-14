class Triangle
{
    Point A, B, C;
    Segment AB, BC, CA;
    
    
    Triangle(Point A, Point B, Point C)
    {
        this.A = A;
        this.B = B;
        this.C = C;
        
        this.AB = new Segment(A, B);
        this.BC = new Segment(B, C);
        this.CA = new Segment(C, A);
    }
    
    Triangle(
    double x1, double y1,
    double x2, double y2,
    double x3, double y3)
    {
        this.A = new Point(x1, y1);
        this.B = new Point(x2, y2);
        this.C = new Point(x3, y3);
        this.AB = new Segment(A, B);
        this.BC = new Segment(B, C);
        this.CA = new Segment(C, A);
    }
}