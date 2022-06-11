package br.com.cod3r.command.alexa.after.alexa;

import br.com.cod3r.command.alexa.after.commands.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class AlexaAI {

    private Map<String, String[]> associations;

    public AlexaAI() {
        this.associations = new HashMap<>();
    }

    public void addAssociation(String key, String[] association) {
        associations.put(key, association);
    }

    public String getFindAssociation(String request) {
        for (String[] association : associations.values()) {
            if (Stream.of(association).allMatch(request::contains)){
                return getKeyFromAssociations(association);
            }
        }
        return null;
    }

    private String getKeyFromAssociations(String... keywords) {
        return associations.entrySet()
                .stream()
                .filter(stringEntry -> keywords.equals(stringEntry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst().get();
    }
}
