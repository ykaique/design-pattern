package br.com.cod3r.command.alexa.after.alexa;

import br.com.cod3r.command.alexa.after.commands.Command;
import br.com.cod3r.command.alexa.before.lights.PhillipsHueLight;
import br.com.cod3r.command.alexa.before.lights.XiaomiLight;

import java.util.HashMap;
import java.util.Map;

public class Alexa {

    private Map<String, Command> integrations;
    private AlexaAI ai;

    public Alexa() {
        integrations = new HashMap<>();
        ai = new AlexaAI();
    }

    public void addIntegration(String key, Command command, String... keywords) {
        integrations.put(key, command);
        ai.addAssociation(key, keywords);
    }

    public void sendRequest(String request) {
        Command command = integrations.get(request);
        if (command == null) {
            String key = ai.getFindAssociation(request);
            command = integrations.get(key);
            if (command == null) {
                System.out.println("Sorry, i can´t perform your request!");
                return;
            }
        }
        System.out.println("Send a generic command as you saved in my configuration");
        command.execute();
    }

}
