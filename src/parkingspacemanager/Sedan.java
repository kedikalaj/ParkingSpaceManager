package parkingspacemanager;


public class Sedan extends Vehicle {
    private int hourlyRate  = 200;
    
    public Sedan(String type, String color, int space, int hours,String LicensePlate ){
        super(type, color, space, hours,LicensePlate);
   
        
    }
    @Override
    public int checkIn(int hours){
        int payment;
        payment = getHourlyRate() * hours;
        return payment;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    
}
