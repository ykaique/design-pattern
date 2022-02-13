package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone11;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone(String level) {

        if (level.equals("standard")) {
            return new IPhone11();
        } else if (level.equals("highend")){
            return new IPhone11Pro();
        }
        return null;
    }
}
