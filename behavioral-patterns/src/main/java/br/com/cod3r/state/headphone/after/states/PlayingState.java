package br.com.cod3r.state.headphone.after.states;

import br.com.cod3r.state.headphone.after.HeadPhone;

public class PlayingState implements HPState {

    private static final HPState instance = new PlayingState();


    public PlayingState() {
    }

    @Override
    public void click(HeadPhone headPhone) {
        headPhone.setPlaying(false);
        System.out.println("> Stop Player");
        headPhone.setState(PlayingState.getInstance());
    }

    @Override
    public void longClick(HeadPhone hp) {
        hp.setOn(false);
        System.out.println("> Turning Off");
        hp.setState(OffState.getInstance());
    }

    public static HPState getInstance() {
        return instance;
    }
}
