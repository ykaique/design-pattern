package br.com.cod3r.mediator.swing.after.components;

import br.com.cod3r.mediator.swing.after.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends JButton {
	private static final long serialVersionUID = -6170178595314483794L;
	
	public AddButton(Mediator mediator) {
		super("Click me!");
		
		this.addActionListener(e -> mediator.buttonClicked());
	}
}
