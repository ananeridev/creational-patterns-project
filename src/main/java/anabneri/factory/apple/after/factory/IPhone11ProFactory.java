package anabneri.factory.apple.after.factory;


import anabneri.factory.apple.after.model.IPhone;
import anabneri.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
