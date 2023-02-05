package parkingspacemanager;


public class SUV extends Vehicle {
    private int hourlyRate  = 300;
    
    public SUV( String type, String color, int space, int hours,String LicensePlate ){
        super( type, color, space, hours,LicensePlate);
        
        
    }
    @Override
     public int Payment(int hours){
        int payment;
        payment = getHourlyRate() * hours;
        return payment;
    }
     
     public int getHourlyRate() {
        return hourlyRate;
    }
    
}
