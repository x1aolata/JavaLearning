package objectOriented;

public abstract class Shape {
    {
        System.out.println("执行Shape的初始化块...");
    }

    public static void fun() {
        System.out.println("哈哈哈哈....大笑");
    }

    private String color;

    public abstract double calPerimeter();

    public abstract String getType();

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
