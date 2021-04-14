package anabneri.factory.apple.halfSimple.factory;


import anabneri.factory.apple.halfSimple.model.IPhone;
import anabneri.factory.apple.halfSimple.model.IPhoneX;
import anabneri.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
