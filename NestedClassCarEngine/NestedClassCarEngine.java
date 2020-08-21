class Car{
    String carName;
    String carType;

    public Car(String name, String type){
        this.carName = name;
        this.carType = type;
}
    private String getCarName() {
        return this.carName;
    }

    class Engine{
        String engineType;

        void setEngineType(){
            this.engineType = Car.this.carName + " " + Car.this.carType;
        }

        String getEngineType() {
            return this.engineType;
        }
    }
}

class NestedClassCarEngine{
    public static void main(String[] args){
        Car car1 = new Car("BWM", "X7");
        Car.Engine car1Engine = car.new Engine();
        car1Engine.setEngineType();
        System.out.println("car1 engine type: " + car1Engine.getEngineType());

        Car car2= new Car("QiRui", "QQ");
        Car.Engine car2Engine = car2.new Engine();
        car2Engine.setEngineType();
        System.out.println("car2 engine type: " + car2Engine.getEngineType());
    }
}
