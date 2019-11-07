package color;

public class Pixel extends Point {

    private Color color;

    public Pixel(Point point, Color color) {
        super(point);
        this.color = color;
    }

    public Pixel(double x, double y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +"   "+color.toString();
    }

    public static void main(String[] args) {

        // 测试代码
        Pixel pixel = new Pixel(new Point(13.2, 21), new Color(0xff20b45d));
        System.out.println(pixel);


    }
}
