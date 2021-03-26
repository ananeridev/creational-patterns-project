package br.com.anabneri;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args )
    {
    // regras ficam separadas de tal forma que se for necessario implementar uma nova regra
		// não muda na construção, e um código flexivel
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}    }

