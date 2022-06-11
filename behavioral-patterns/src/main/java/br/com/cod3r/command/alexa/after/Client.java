package br.com.cod3r.command.alexa.after;

import br.com.cod3r.command.alexa.after.alexa.Alexa;
import br.com.cod3r.command.alexa.after.commands.TurnLightOffComand;
import br.com.cod3r.command.alexa.after.commands.TurnLightOnComand;
import br.com.cod3r.command.alexa.after.lights.PhillipsHueLight;
import br.com.cod3r.command.alexa.after.lights.XiaomiLight;

public class Client {

	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		configureAlexa(alexa);

		alexa.sendRequest("Turn on the living room light");
		alexa.sendRequest("Turn off the kitchen light");
	}

	private static void configureAlexa(Alexa alexa) {
		PhillipsHueLight livingRomm = new PhillipsHueLight();
		XiaomiLight kitchen = new XiaomiLight();

		alexa.addIntegration("Turn on the living room light", new TurnLightOnComand(livingRomm), "on", "living room", "light");
		alexa.addIntegration("Turn off the living room light", new TurnLightOffComand(livingRomm), "off", "living room", "light");
		alexa.addIntegration("Turn on the kitchen light", new TurnLightOnComand(kitchen), "on", "kitchen", "light");
		alexa.addIntegration("Turn off the kitchen light", new TurnLightOffComand(kitchen), "off", "kitchen", "light");
	}
}
