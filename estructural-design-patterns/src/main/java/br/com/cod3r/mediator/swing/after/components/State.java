package br.com.cod3r.mediator.swing.after.components;


import br.com.cod3r.mediator.swing.after.mediator.Mediator;

public class State {
	private int counter;
	private Mediator mediator;

	public State(Mediator mediator) {
		counter = 0;
		this.mediator = mediator;
	}
	
	public void addCount() {
		counter++;
		if (counter == 10){
			mediator.stop();
		}
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
}
