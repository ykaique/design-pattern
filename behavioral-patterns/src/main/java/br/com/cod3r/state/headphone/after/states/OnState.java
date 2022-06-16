package br.com.cod3r.state.headphone.after.states;

import br.com.cod3r.state.headphone.after.HeadPhone;

public class OnState implements HPState {

    private static final HPState instance = new OnState();


    public OnState() {
    }

    @Override
    public void click(HeadPhone headPhone) {
        headPhone.setPlaying(true);
        System.out.println("> Resume Player");
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
