public abstract class IPhone {
    CountryRulesAbstractFactory rules;

    public IPhone(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public abstract void getHardware();
    
    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println("Testing all the hardwares");
        System.out.println(rules.getCertificates().applyCertification());
    }

    public void pack() {
        System.out.println("Packing the devices");
        System.out.println(rules.getPacking().pack());
    }
}