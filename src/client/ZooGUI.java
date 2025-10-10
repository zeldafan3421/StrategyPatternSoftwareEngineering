package client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Animals.Animal;

public class ZooGUI 
{
    private final String WINDOW_TITLE = "Zoo Strategy Pattern";
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 400;

    private final String[] ANIMAL_BEHAVIOR_OPTIONS = {
            "Move",
            "Eat",
            "Make Noise"
        };

    private JFrame frame;
    private JPanel panel;
    private static JLabel message = new JLabel();

    public static class MenuButton extends JButton
    {
        private ArrayList<Animal> choices;
        public MenuButton(String name, ArrayList<Animal> choices)
        {
            this.choices = choices;
            setText(name);
        }

        public MenuButton bind(ZooGUI owner)
        {
            addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    owner.openAnimalSelection(choices);
                }
            });

            return this;
        }
    };
    
    public static class MainMenu 
    {
        private ArrayList<MenuButton> options;

        public MainMenu()
        {
            options = new ArrayList<>();
        }

        public MainMenu addOption(String name,  ArrayList<Animal> animals)
        {
            options.add(new MenuButton(name, animals));

            return this;
        }

        public ArrayList<MenuButton> getButtons()
        {
            return options;
        }
    };
    
    public static MainMenu createMainMenu()
    {
        return new MainMenu();
    }

    public static void setMessage(String text)
    {
        message.setText(text);
    }

    public ZooGUI(MainMenu menu)
    {
        frame = new JFrame();
        panel = new JPanel();

        for (MenuButton button : menu.getButtons())
        {
            panel.add(button.bind(this));
        }

        message.setText("");
        panel.add(message);

        setupWindow();
    }

    public JFrame getFrame()
    {
        return frame;
    }

    private void openBehaviorSelection(Animal animal)
    {
        int selection = JOptionPane.showOptionDialog(frame,
                "What would you like to do",
                animal.toString(),
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.OK_CANCEL_OPTION,
                null, // do not use a custom Icon
                ANIMAL_BEHAVIOR_OPTIONS, // the titles of buttons
                ANIMAL_BEHAVIOR_OPTIONS[0]
            );

        if (selection == 0) 
        {
            animal.performMove();
        } 
        else if (selection == 1)
        {
            animal.performEat();
        }
        else if (selection == 2)
        {
            animal.performSound();
        }
    }

    private void openAnimalSelection(ArrayList<Animal> animals)
    {
        int selection = JOptionPane.showOptionDialog(frame,
                "What would you like to do",
                "Chose an animal.",
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.OK_CANCEL_OPTION,
                null, // do not use a custom Icon
                animals.toArray(), // the titles of buttons
                animals.get(0)
        );
        
        openBehaviorSelection(animals.get(selection));
    }

    private void setupWindow()
    {
        frame.setTitle(WINDOW_TITLE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setVisible(true);
        frame.add(panel);
    }
}
