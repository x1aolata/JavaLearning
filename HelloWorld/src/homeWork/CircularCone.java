package homeWork;


public class CircularCone implements Area, Volume, Comparable {

    private double l;
    private double r;

    public CircularCone(double l, double r) {
        this.l = l;
        this.r = r;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * (r * l + r * r);
    }

    @Override
    public double volume() {
        return Math.PI * r * r * Math.sqrt(Math.pow(l, 2) - Math.pow(r, 2)) / 3;
    }


    @Override
    public int compareTo(Object o) {

        CircularCone circularCone = (CircularCone) o;
        if (volume() - circularCone.volume() == 0)
            return 0;
        else if (volume() - circularCone.volume() > 0)
            return 1;
        else
            return -1;

    }

    public static void main(String[] args) {

        // 测试代码
        CircularCone c1 = new CircularCone(5, 3);
        CircularCone c2 = new CircularCone(12, 4);
        CircularCone c3 = new CircularCone(5, 3);

        System.out.println(c1.compareTo(c2));
        System.out.println(c1.compareTo(c3));

    }

}
