package anabneri.abstractfactory.apple.factory.abstractFactory;

import anabneri.abstractfactory.apple.model.certificate.Certificate;
import anabneri.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
