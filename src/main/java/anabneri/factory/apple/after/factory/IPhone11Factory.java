package anabneri.factory.apple.after.factory;


import anabneri.factory.apple.after.model.IPhone;
import anabneri.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
