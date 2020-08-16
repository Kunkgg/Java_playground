class Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Lamp on?" + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Lamp on?" + isOn);
    }
}

class Main{
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        lamp1.turnOn();
        Lamp lamp2 = new Lamp();
        lamp2.turnOff();
    }
}
