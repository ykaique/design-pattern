package br.com.cod3r.template.after.sales.service.template;

import br.com.cod3r.template.after.sales.model.Cart;

import java.util.Calendar;

public class BigCartDiscounts extends BestOfferTemplate {

    public BigCartDiscounts(Cart cart) {
        super(cart);
    }

    @Override
    public boolean isAppliable() {
        return regularItemPrice > 1000;
    }

    @Override
    protected void calibrateVariables() {
        priceFactor = 0.9;
    }
}
