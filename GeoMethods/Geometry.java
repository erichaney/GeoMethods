class Geometry
{
    /*#
     * The following method stubs are given for you to practice writing 
     * static methods that operate on objects.
     * 
     * You should look up any helpful math formulas online.
     * 
     * The goal for this exercise is for you to *reuse* earlier methods 
     * whenever possible!
     * 
     */
    
    /**
     * Returns the distance between the two given points.
     * 
     * For example: 
     * distance(new Point(1,1), new Point(4,5)) returns 5.0.
     * 
     * @param a The first given point
     * @param b The second given point
     * @return The distance between points a and b
     */
    static double distance(Point a, Point b)
    {
        return 0;
    }

    /**
     * Returns the length of the given segment.
     * 
     * For example:
     * length(new Segment(1, 1, 4, 5)) returns 5.0
     * 
     * @param s The given segment
     * @return The length of segment s
     */
    static double length(Segment s)
    {
        return 0;
    }

    /**
     * Returns the slope of the given segment.
     * 
     * If the segment is vertical, this returns the special value Double.POSITIVE_INFINITY
     * 
     * For example:
     * slope(new Segment(2, 5, 2, 7)) returns Double.POSITIVE_INFINITY
     * slope(new Segment(-5, 5, 0, 0)) returns -1.0
     * 
     * @param s The given segment
     * @return The slope of segment s
     */
    static double slope(Segment s)
    {
        return 0;
    }
    
    /**
     * Returns the midpoint of the given segment
     * 
     * For example:
     * midpoint(new Segment(2, 10, 4, 20)) returns Point(3, 15)
     * 
     * @param s The given segment
     * @return The midpoint of segment s
     */
    static Point midpoint(Segment s)
    {
        return null;
    }

    /**
     * Returns the perimeter of the given triangle
     * 
     * For example:
     * area(new Triangle(0, 2, 1, 3, 2, 0)) returns 7.405
     * 
     * @param t The given triangle
     * @return The perimeter of triangle t
     */
    static double perimeter(Triangle t)
    {
        return 0;
    }

    /**
     * Returns the area of the given triangle
     * 
     * Hint: Look up Heron's Formula or The Shoelace Formula to get the area of a triangle from
     * its coordinates.
     * 
     * For example:
     * area(new Triangle(0, 2, 1, 3, 2, 0)) returns 2
     * 
     * @param t The given triangle
     * @return The area of trianlge t
     */
    static double area(Triangle t)
    {
        return 0;
    }

    /*# Extension problems */
    
    /**
     * Returns true if the three given points lie along the same straight line.
     * 
     * Hint: check slopes.
     * 
     * For example:
     * isCollinear(new Point(1, 1), new Point(2, 2), new Point(5, 5)) returns true.
     * 
     * @param a The first given point
     * @param b The second given point
     * @param c The third given point
     * @return True if points a, b, and c lie on a straight line.
     */
    static boolean isCollinear(Point a, Point b, Point c)
    {
        return false;
    }

    /**
     * Returns true if the given point lies on the given segment.
     * 
     * For example:
     * isCollinear(new Point(2, 2), new Segment(1, 1, 5, 5)) returns true.
     * isCollinear(new Point(6, 6), new Segment(1, 1, 5, 5)) returns false.
     * 
     * @param p The given point
     * @param s The given segment
     * @return True if point p lies on segment s.
     */
    static boolean isOnLineSegment(Point p, Segment s)
    {
        return false;
    }

    /**
     * Returns the angle in degrees that the given segment makes with the positive x axis.
     * 
     * Hint: search the Java Math API for inverse trig functions and how to convert from radians.
     * 
     * For example:
     * angleOf(new Segment(1, 1, 2, 2)) returns 45.0
     * 
     * @param s The given segment
     */
    static double angleOf(Segment s)
    {
        return 0;
    }
    
    /**
     * Returns the intersection point of the given segments, or null if there is no intersection.
     * 
     * This one is tricky. Good luck!
     * 
     * For example:
     * intersection(new Segment(0, 0, 2, 2), new Segment(2, 0, 0, 2)) returns Point(1, 1).
     * 
     * @param s1 The first given segment
     * @param s2 The second given segment
     * @return The intersection of s1 and s2, or null if no intersection exists.
     */
    static Point intersection(Segment s1, Segment s2)
    {
        return null;
    }
}