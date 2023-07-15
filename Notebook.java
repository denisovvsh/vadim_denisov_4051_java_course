import java.util.*;

public class Notebook {
    private String model;
    private String manufacturer;
    private double price;
    private int yearOfRelease;
    private int ram;
    private int storageCapacity;
    private String operatingSystem;
    private String color;
    
    public Notebook(String model, String manufacturer, double price, int yearOfRelease, int ram, int storageCapacity, String operatingSystem, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    
    public int getRam() {
        return ram;
    }
    
    public int getStorageCapacity() {
        return storageCapacity;
    }
    
    public String getOperatingSystem() {
        return operatingSystem;
    }
    
    public String getColor() {
        return color;
    }
    
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
        System.out.println("Year of release: " + yearOfRelease);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Color: " + color);
    }
}
