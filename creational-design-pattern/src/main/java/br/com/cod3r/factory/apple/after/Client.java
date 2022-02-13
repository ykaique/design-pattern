package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.after.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.after.model.IPhone;

public class Client {

    public static void main(String[] args) {

        IPhoneFactory iPhoneXFactory = new IPhone11Factory();

        System.out.println("### Ordering an iPhone X");
        IPhone iPhone = iPhoneXFactory.orderIPhone();
        System.out.println(iPhone);
    }

}
