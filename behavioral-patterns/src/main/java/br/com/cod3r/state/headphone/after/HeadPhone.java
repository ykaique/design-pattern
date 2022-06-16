package br.com.cod3r.state.headphone.after;

import br.com.cod3r.state.headphone.after.states.HPState;
import br.com.cod3r.state.headphone.after.states.OffState;

public class HeadPhone {
    private HPState state;
    private boolean isOn;
    private boolean isPlaying;

    public HeadPhone() {
        this.state = OffState.getInstance();
        this.isOn = false;
        this.isPlaying = false;
    }

    public void onLongClick(){
        System.out.println("Long Click Pressed...");
        state.longClick(this);
    }

    public void onClick(){
        System.out.println("Click Pressed...");
        state.click(this);
    }

    public HPState getState() {
        return state;
    }

    public void setState(HPState state) {
        this.state = state;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}
