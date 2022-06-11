package br.com.cod3r.command.alexa.after.commands;

import br.com.cod3r.command.alexa.after.lights.GenericLight;

public class TurnLightOnComand implements Command {

    private GenericLight light;

    public TurnLightOnComand(GenericLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
