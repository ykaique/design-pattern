package br.com.cod3r.factory.apple.simple.factory;

import br.com.cod3r.factory.apple.simple.model.IPhone;
import br.com.cod3r.factory.apple.simple.model.IPhone11;
import br.com.cod3r.factory.apple.simple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.simple.model.IPhoneX;
import br.com.cod3r.factory.apple.simple.model.IPhoneXSMax;


public class IPhoneSimpleFactory {

    public IPhone orderIPhone(String generation, String level) {
        IPhone device = null;

        if (generation.equals("11")) {
            if (level.equals("standard")) {
                device = new IPhone11();
            } else if (level.equals("highend")){
                device = new IPhone11Pro();
            }
        } else if (generation.equals("X")) {
            if (level.equals("standard")) {
                device =  new IPhoneX();
            } else if (level.equals("highend")) {
                device =  new IPhoneXSMax();
            }
        }
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

}
