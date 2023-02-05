package parkingspacemanager;

public abstract class Vehicle {
    private String Type;
    private String Color;
    private int Space;
    private int Hours;
    private String LicensePlate;
    
    public Vehicle(String type, String color, int space, int hours, String LicensePlate){
        this.Color = color;
        this.Type = type;
        this.Space = space;
        this.Hours = hours;
        this.LicensePlate=LicensePlate;
    }
    
    public abstract int Payment(int hours);
    
    
}
