package anabneri.factory.apple.after.factory;

import anabneri.factory.apple.after.model.IPhone;
import anabneri.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
