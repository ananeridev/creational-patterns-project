public class CarSimpleFactory {

    public public static Car orderCar(String type, String level) {
        Car machine = null;

        if("sedan".equals(type)) {
            if ("standard".equals(type)) {
                machine = new Car();
            } else if ("highEnd".equals(type)) {
                machine = new 
            }  
        } else if ("hatch".equals(type)) {
            if ("standard".equals(level)) {
                machine = new Crv();
            } else if ("highEnd".equals(level)) {
                machine = new Uno();
            }
        }

        if(machine != null) {
            machine.getHardware();
            machine.security();
            machine.certificates();
            machine.pack();
        }

        return machine;
    }
}