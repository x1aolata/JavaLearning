package internalClass;

public  class Device {
    private String name;

    public  double getPrice()
    {
        return 23;
    }

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
