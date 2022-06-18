package br.com.cod3r.template.after.sales.service.template;

import br.com.cod3r.template.after.sales.model.Cart;

import java.util.Calendar;

public class BlackFriday extends BestOfferTemplate {

    public BlackFriday(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        return Calendar.getInstance().get(Calendar.MONTH) == Calendar.NOVEMBER;
    }

    @Override
    protected void calibrateVariables() {
        priceFactor = 0.75d;
    }
}
