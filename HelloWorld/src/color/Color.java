package color;


public class Color {

    private int value;

    public Color(int rgb) {
        this.value = rgb;
    }

    public Color(int red, int green, int blue) {
        this.value = (255 << 24) | (red << 16) | (green << 8) | blue;
    }

    public int getRGB() {
        return value;
    }

    public int getRed() {
        return (this.value & 0x00ff0000) >> 16;
    }

    public int getGreen() {
        return (this.value & 0x0000ff00) >> 8;
    }

    public int getBlue() {
        return this.value & 0x000000ff;
    }

    @Override
    public String toString() {
        return "RGB:(" + getRed() + "," + getGreen() + "," + getBlue() + ")  #" + Integer.toHexString(this.value);
    }

}
