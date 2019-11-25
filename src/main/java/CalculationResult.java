public class CalculationResult  implements Calculate{

    private double result;

    public double getResult() {
        return result;
    }





    public void multiply(double a, double b)
    {
        double ans = a*b;
        this.result = ans;
    }
    public void add(double a, double b)
    {
        double ans = a+b;
        this.result = ans;
    }
    public boolean withinTolerance(Calculate cc, double b)
    {
        CalculationResult cr = (CalculationResult) cc;
        double x = this.getResult();
        double y = cr.getResult();

        double check = Math.abs(x-y);
        if(check<= b)
            return true;
        else return false;
    }
    public String toString(){
        return "Result: "+ getResult();
    }


}
