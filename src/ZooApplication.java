import java.util.ArrayList;

import Animals.AfricanLion;
import Animals.Animal;
import Animals.BalaShark;
import Animals.BlueJay;
import Animals.CongoLion;
import Animals.Owl;
import Animals.RedBelliedPiranha;
import client.ZooGUI;

public class ZooApplication 
{
    public static void main(String[] args) 
    {
        ArrayList<Animal> lions = new ArrayList<>();
        lions.add(new CongoLion());
        lions.add(new AfricanLion());

        ArrayList<Animal> birds = new ArrayList<>();
        birds.add(new Owl());
        birds.add(new BlueJay());

        ArrayList<Animal> fishes = new ArrayList<>();
        fishes.add(new BalaShark());
        fishes.add(new RedBelliedPiranha());

        ZooGUI.MainMenu mainMenu = ZooGUI.createMainMenu()
            .addOption("Birds", birds)
            .addOption("Fishes", fishes)
            .addOption("Lions", lions);

        @SuppressWarnings("unused")
        ZooGUI client = new ZooGUI(mainMenu);
    }
}
