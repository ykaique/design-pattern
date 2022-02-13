package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {

    public static void main(String[] args) {

        IPhoneSimpleFactory iPhoneXFactory = new IPhoneSimpleFactory();

        System.out.println("### Ordering an iPhone X highend");
        IPhone iPhone = iPhoneXFactory.orderIPhone("X","highend");
        System.out.println(iPhone);

        System.out.println();

        System.out.println("### Ordering an iPhone 11");
        IPhone iPhone2 = iPhoneXFactory.orderIPhone("11","standard");
        System.out.println(iPhone2);
    }

}
