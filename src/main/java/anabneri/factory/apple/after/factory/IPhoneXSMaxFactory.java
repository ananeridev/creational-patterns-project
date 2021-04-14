package anabneri.factory.apple.after.factory;


import anabneri.factory.apple.after.model.IPhone;
import anabneri.factory.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
