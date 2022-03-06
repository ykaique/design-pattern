package br.com.cod3r.mediator.swing.after;

import br.com.cod3r.mediator.swing.before.components.AddButton;
import br.com.cod3r.mediator.swing.before.components.Label;
import br.com.cod3r.mediator.swing.before.components.ResetButton;
import br.com.cod3r.mediator.swing.before.components.State;

import javax.swing.*;
import java.awt.*;

public class Screens {

    private AddButton button;
    private ResetButton reset;
    private br.com.cod3r.mediator.swing.before.components.Label label;
    private State state;

    public Screens() {
        state = new State();
        label = new Label(state);
        button = new AddButton(state, label);
        reset = new ResetButton(state, label, button);
    }


    public void init() {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            JLabel title = new JLabel("Counter");
            frame.add(title, BorderLayout.NORTH);

            frame.add(reset, BorderLayout.WEST);
            frame.add(button, BorderLayout.CENTER);
            frame.add(label, BorderLayout.SOUTH);

            frame.setSize(400,200);
            frame.setVisible(true);
    }

}
