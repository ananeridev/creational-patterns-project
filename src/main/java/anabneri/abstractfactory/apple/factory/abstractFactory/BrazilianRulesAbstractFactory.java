package anabneri.abstractfactory.apple.factory.abstractFactory;


import anabneri.abstractfactory.apple.model.certificate.BrazilianCertificate;
import anabneri.abstractfactory.apple.model.certificate.Certificate;
import anabneri.abstractfactory.apple.model.packing.BrazilianPacking;
import anabneri.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
