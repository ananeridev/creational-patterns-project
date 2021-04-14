package anabneri.factory.apple.simple.factory;


import anabneri.factory.apple.simple.model.*;

public class IPhoneSimpleFactory {

	public static IPhone orderIPhone(String generation, String level) {
		IPhone device = null;

		if (generation.equals("X")) {
			if (level.equals("standard")) {
				device = new IPhoneX();
			} else if (level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if (generation.equals("11")) {
			if (level.equals("standard")) {
				device = new IPhone11();
			} else if (level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}

		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}
}
