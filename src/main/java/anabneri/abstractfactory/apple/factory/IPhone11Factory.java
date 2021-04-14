package anabneri.abstractfactory.apple.factory;


import anabneri.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import anabneri.abstractfactory.apple.model.iphone.IPhone;
import anabneri.abstractfactory.apple.model.iphone.IPhone11;
import anabneri.abstractfactory.apple.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11(rules);
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro(rules);
		} else return null;
	}

}
