class CPU{
    double price;

    class Processor {
        int cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    class RAM {
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
}

class NestedClass {
    public static void main(String[] args){
        CPU cpu = new CPU();

        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();

        System.out.println("cpu cache: " + processor.getCache());
        System.out.println("cpu RAM clock speed: " + ram.getClockSpeed());

    }
}
