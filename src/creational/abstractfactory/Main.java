package creational.abstractfactory;

/*
 * Abstract Factory Design Pattern in Java
 * The Abstract Factory Pattern provides an interface
 * for creating families of related objects without
 * specifying their concrete classes.
 *
 * It is called a factory of factories
 *
 * Main (C) - Client
 *      ||
 * GuiFactory (I) - Abstract Factory
 *       |
 *       | -> WindowsFactory (C) - Concrete Factory
 *                   |-> WindowsButton (C) - Button (I)
 *                   |-> WindowsCheckbox (C) - Checkbox (I)
 *       | -> MacFactory (C) - Concrete Factory
 *                   |-> MacButton (C) - Button (I)
 *                  |-> MacCheckbox (C) - Button (I)
 */


import creational.abstractfactory.factoryitems.concretefactory.MacFactory;
import creational.abstractfactory.factoryitems.concretefactory.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        validateRequest(args);

        GuiFactory factory = getFactoryAsPerOsName(args);

        Application application = new Application(factory);

        getFunctionalityAsPerGuiType(application, args);
    }

    private static void validateRequest(String[] args) {
        if (args.length > 2) {
            System.out.println("Only two argument expected");
            System.exit(-1);
        } else if(args.length < 2) {
            System.out.println("OS name and GUI type expected");
            System.exit(-1);
        }
    }

    private static GuiFactory getFactoryAsPerOsName(String[] args) {
        GuiFactory factory = null;

        if(!args[0].trim().isEmpty()) {
            if (args[0].equalsIgnoreCase("windows")) {
                factory = new WindowsFactory();
            } else if (args[0].equalsIgnoreCase("mac")) {
                factory = new MacFactory();
            } else {
                System.out.println("INVALID OS TYPE");
                System.exit(-1);
            }
        }

        return factory;
    }

    private static void getFunctionalityAsPerGuiType(Application application, String[] args) {
        if(!args[1].trim().isEmpty()) {
            if (args[1].equalsIgnoreCase("paint")) {
                application.paint();
            } else if (args[1].equalsIgnoreCase("check")) {
                application.check();
            } else {
                System.out.println("INVALID GUI TYPE");
                System.exit(-1);
            }
        }
    }
}
