package Hello;

public class Complex {

    private double real = 0;
    private double imaginary = 0;

    private Complex() {
    }

    public Complex(String s) {
        String ss = s.replace(" ", "");
        //有加号吗？
        if (ss.indexOf('+') != -1) {
            this.real = Double.valueOf(ss.substring(0, ss.indexOf('+')));
            this.imaginary = Double.valueOf(ss.substring(ss.indexOf('+') + 1, ss.indexOf('i')));
        }//没有加号有减号
        else {
            if (ss.indexOf('-') != -1) {
                //有减号没i
                if (ss.indexOf('i') == -1) {
                    this.real = Double.valueOf(ss);
                }//有减号有i
                else {
                    //首字符是-?
                    if (ss.charAt(0) == '-') {
                        //两个-?
                        if (ss.indexOf('-', ss.indexOf('-') + 1) != -1) {
                            this.real = Double.valueOf(ss.substring(0, ss.indexOf('-', ss.indexOf('-') + 1)));
                            this.imaginary = -Double.valueOf(ss.substring(ss.indexOf('-', ss.indexOf('-') + 1) + 1, ss.indexOf('i')));
                        }
                        else {
                            if (ss.equals("-i")) {
                                this.imaginary = -1;
                            }
                            else {
                                this.imaginary = Double.valueOf(ss.substring(0, ss.indexOf('i')));
                            }
                        }
                    }
                    else//不是
                    {
                        this.real = Double.valueOf(ss.substring(0, ss.indexOf('-')));
                        this.imaginary = -Double.valueOf(ss.substring(ss.indexOf('-') + 1, ss.indexOf('i')));
                    }
                }
            }//没有加减号
            else if (ss.indexOf('i') != -1) {
                if (ss.equals("i")) {
                    this.imaginary = 1;
                }
                else {
                    this.imaginary = Double.valueOf(ss.substring(0, ss.indexOf('i')));
                }
            }
            else {
                this.real = Double.valueOf(ss);
            }
        }
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex complex) {
        Complex c = new Complex();
        c.real = this.real + complex.real;
        c.imaginary = this.imaginary + complex.imaginary;
        return c;
    }

    public Complex subtract(Complex complex) {
        Complex c = new Complex();
        c.real = this.real - complex.real;
        c.imaginary = this.imaginary - complex.imaginary;
        return c;
    }

    @Override
    public String toString() {

        if (this.real == 0 && this.imaginary != 0) {
            return imaginary + "i";
        }
        else {
            if (this.real != 0 && this.imaginary == 0) {
                return real + "";
            }
            else if (this.real == 0 && this.imaginary == 0) {
                return 0 + "";
            }
            else {
                if (this.imaginary >= 0)
                    return real + " + " + imaginary + "i";
                else
                    return real + " - " + -imaginary + "i";
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Complex) {
            Complex complex = (Complex) obj;
            if (this.real == complex.real && this.imaginary == complex.imaginary)
                return true;
            else
                return false;
        }
        else {
            return false;
        }
    }

    public double mo() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }

    public static void main(String[] args) {

        //测试代码
        Complex complex1 = new Complex("-4 + 3i");
        Complex complex2 = new Complex("-4   + 3i");
        Complex complex3 = new Complex("4+3i");
        System.out.println(complex1);
        System.out.println(complex1.add(complex2));
        System.out.println(complex1.subtract(complex2));
        System.out.println(complex2.mo());
        System.out.println(complex1.equals(complex2));
        System.out.println(complex3.equals(complex2));


    }


}

