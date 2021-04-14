package anabneri.abstractfactory.apple.factory.abstractFactory;


import anabneri.abstractfactory.apple.model.certificate.Certificate;
import anabneri.abstractfactory.apple.model.certificate.USCertificate;
import anabneri.abstractfactory.apple.model.packing.Packing;
import anabneri.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
