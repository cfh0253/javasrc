import java.awt.*;
import java.awt.event.*;

/** Template standalone GUI application */
public class TemplateGUI extends Frame {
	boolean unsavedChanges = false;
	Button quitButton;

	/** "main program" method - construct and show */
	public static void main(String av[]) {
		// create a TemplateGUI object, tell it to show up
		new TemplateGUI().setVisible(true);
	}

	/** Construct the object including its GUI */
	public TemplateGUI() {
		super("TemplateGUI");
		setLayout(new FlowLayout());
		add(new Label("Hello, and welcome to the world of Java"));
		add(quitButton = new Button("Exit"));
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
			
		pack();
	}
}

