public interface Calculate {
     void multiply(double a, double b);
     void add(double a, double b);
     boolean withinTolerance(Calculate c, double b);
     String toString();

    default double divide(double numerator, double denominator ) throws ArithmeticException
    {
        double ans =0;

            ans = numerator / denominator;


            if(ans == Double.NEGATIVE_INFINITY || ans== Double.POSITIVE_INFINITY || ans ==Double.NaN)
                throw new ArithmeticException("Divide by zero error");



        return ans;
    }
}
