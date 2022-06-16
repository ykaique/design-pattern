package br.com.cod3r.state.pacman.states;

import br.com.cod3r.state.pacman.Ghost;

public class ChasePacmanState implements GhostStates {
	private static final ChasePacmanState instance = new ChasePacmanState();
	private ChasePacmanState() {};
	
	public static ChasePacmanState getInstance() {
		return instance;
	}

	@Override
	public void spotPacman(Ghost ghost) {
		System.out.println("I don´t wanna see him, turn back..");
	}

	@Override
	public void losePacman(Ghost ghost) {
		System.out.println();
	}

	@Override
	public void pacmanTurnsSpecial(Ghost ghost) {
		
	}

	@Override
	public void pacmanTurnsNormal(Ghost ghost) {
		
	}

	@Override
	public void eatenByPacman(Ghost ghost) {
		
	}

	@Override
	public void reachTheBase(Ghost ghost) {
		
	}
}
