class MotherBoard {
    String model;

    public MotherBoard(String model){
        this.model = model;
    }

    class USB{
        int usb2 = 2;
        int usb3 = 1;

        int getUsbPorts() {
            if (MotherBoard.this.model == "MSI") {
                return 4;
            } else {
            return this.usb2 + this.usb3;
            }
        }
    }
}

class StaticNestedClass{
    public static void main(String[] args){
        MotherBoard mb = new MotherBoard("MSI");
        MotherBoard.USB usb = mb.new USB();

        System.out.println("usb ports: " + usb.getUsbPorts());
    }
}
