package creational.abstractfactory.factoryitems.concretefactory;

import creational.abstractfactory.GuiFactory;
import creational.abstractfactory.factoryitems.productinterfaces.Button;
import creational.abstractfactory.factoryitems.productinterfaces.Checkbox;
import creational.abstractfactory.factoryitems.productinterfaces.macproducts.MacButton;
import creational.abstractfactory.factoryitems.productinterfaces.macproducts.MacCheckbox;

public class MacFactory  implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}