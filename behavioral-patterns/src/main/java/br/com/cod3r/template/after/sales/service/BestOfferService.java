package br.com.cod3r.template.after.sales.service;

import br.com.cod3r.template.after.sales.model.Cart;
import br.com.cod3r.template.after.sales.model.Category;
import br.com.cod3r.template.after.sales.service.template.BestOfferTemplate;
import br.com.cod3r.template.after.sales.service.template.BigCartDiscounts;
import br.com.cod3r.template.after.sales.service.template.BlackFriday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BestOfferService {

	private List<BestOfferTemplate> templates;

	private void loadTemplates(Cart cart){
		templates = new ArrayList<>();
		templates.add(new BigCartDiscounts(cart));
		templates.add(new BlackFriday(cart));
	}

	public void calculateBestOffer(Cart cart) {
		loadTemplates(cart);
		double bestOffer = Double.MAX_VALUE;
		for (BestOfferTemplate template : templates) {
			if (template.isAppliable()){
				Double currentPrice = template.calculateOffer(cart);
				System.out.println(String.format("%s: %.2f", template.getClass().getSimpleName()));
				bestOffer = (bestOffer > currentPrice) ? currentPrice : bestOffer;
			}
		}
		System.out.println(String.format("Final Price: %.2f", bestOffer));
	}
}