package br.com.cod3r.template.after.sales.service.template;

import br.com.cod3r.template.after.sales.model.Cart;

public abstract class BestOfferTemplate {

    protected Cart cart;
    protected Double regularItemPrice;
    protected Double deliveryTax;
    protected Double priceFactor;
    protected Double deliveryFactor;

    public BestOfferTemplate(Cart cart) {
        this.cart = cart;
        this.regularItemPrice = calculateRegularItemsPrice();
        this.deliveryTax = calculateDeliveryTax();
        this.priceFactor = 1d;
        this.deliveryFactor = 1d;
    }

    private Double calculateDeliveryTax() {
        Integer distance = cart.getBuyer().getDistance();
        Double totalWeight = cart.getItems().stream()
                .reduce(0d, (acc, item) -> acc + item.getWeight(), Double::sum);
        return (distance * totalWeight) / 100;
    }

    private Double calculateRegularItemsPrice() {
        return cart.getItems().stream()
                .reduce(0d, (acc, item) -> acc + item.getValue(), Double::sum);
    }

    public Double calculateOffer(Cart cart){
        calibrateVariables();
        return (regularItemPrice * priceFactor) + (deliveryTax * deliveryFactor);
    }

    public abstract boolean isAppliable();
    protected abstract void calibrateVariables();
}
