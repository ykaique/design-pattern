package br.com.cod3r.mediator.swing.translate.model;

import br.com.cod3r.mediator.swing.translate.mediator.Mediator;

public class EnglishUser extends User {

	public EnglishUser(String name, Mediator mediator) {
		super(name, mediator, Language.ENGLISH);
	}
	
}
