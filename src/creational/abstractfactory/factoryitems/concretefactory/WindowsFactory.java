package creational.abstractfactory.factoryitems.concretefactory;

import creational.abstractfactory.GuiFactory;
import creational.abstractfactory.factoryitems.productinterfaces.Button;
import creational.abstractfactory.factoryitems.productinterfaces.Checkbox;
import creational.abstractfactory.factoryitems.productinterfaces.windowsproducts.WindowsButton;
import creational.abstractfactory.factoryitems.productinterfaces.windowsproducts.WindowsCheckbox;

public class WindowsFactory  implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
