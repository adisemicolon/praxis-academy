class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

   
    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}

interface Bicycle {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}

class interfaceSepeda {
    public static void main(String[] args) {
        ACMEBicycle spdGunung = new ACMEBicycle();
        spdGunung.changeCadence(50);
        spdGunung.speedUp(10);
        spdGunung.changeGear(2);
        spdGunung.printStates();
    }
}
