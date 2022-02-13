package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public class Client {

    public static void main(String[] args) {

        IPhoneFactory iPhoneXFactory = new IPhone11Factory();

        System.out.println("### Ordering an iPhone X hihhend");
        IPhone iPhone = iPhoneXFactory.orderIPhone("highend");
        System.out.println(iPhone);
        System.out.println();
        System.out.println("### Ordering an iPhone X");
        IPhone iPhone2 = iPhoneXFactory.orderIPhone("standard");
        System.out.println(iPhone2);
    }

}
