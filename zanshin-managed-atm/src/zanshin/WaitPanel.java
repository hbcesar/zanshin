package zanshin;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
class WaitPanel extends Panel {
	WaitPanel(long waitTime) {
		setLayout(new GridLayout(0, 1, 0, 0));
		setFont(new Font("Monospaced", Font.PLAIN, 14));

		add(new Label("", Label.CENTER));
		add(new Label("We are very sorry...", Label.CENTER));
		add(new Label("There has been a malfunction in the ATM.", Label.CENTER));
		add(new Label("In case this is a temporary glitch,", Label.CENTER));
		add(new Label("we ask you to please try the operation", Label.CENTER));
		add(new Label("again in " + (waitTime / 1000) + " seconds...", Label.CENTER));
		add(new Label("(This message will close automatically)", Label.CENTER));
	}
}
