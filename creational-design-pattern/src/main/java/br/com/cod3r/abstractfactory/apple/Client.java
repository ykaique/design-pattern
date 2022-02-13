package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
		CountryRulesAbstractFactory rulesBr = new BrazilianRulesAbstractFactory();

		IPhoneFactory iPhoneFactory = new IPhone11Factory(rules);
		IPhoneFactory iPhoneBrFactory = new IPhoneXFactory(rulesBr);

		System.out.println("### Ordering iPhone 11");
		IPhone iPhone = iPhoneFactory.orderIPhone("standard");
		System.out.println(iPhone);

		System.out.println();

		System.out.println("### Ordering iPhone X");
		IPhone iPhoneBr = iPhoneBrFactory.orderIPhone("standard");
		System.out.println(iPhoneBr);
	}
}
