public class calculator {
    private double cResult;

    public double getResult() {
        return cResult;
    }

    public void setResult(double cResult) {
        this.cResult = cResult;
    }

    public void Calculator() {
        this.cResult = 0;
    }


    public double Calculator(double result) {
        return this.cResult = result;
    }

    public double addDoubles(double firstDouble, double secondDouble) {
        this.cResult = firstDouble + secondDouble;
        return this.cResult;
    }


    public double subtractDoubles(double firstDouble, double secondDouble) {
        this.cResult = firstDouble - secondDouble;
        return this.cResult;
    }


    public double multiplyDoubles(double firstDouble, double secondDouble) {
        this.cResult = firstDouble * secondDouble;
        return this.cResult;
    }


    public double divideDoubles(double firstDouble, double secondDouble) {
        if (secondDouble != 0) {
            this.cResult = firstDouble / secondDouble;
        } else {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return this.cResult;
    }
}
