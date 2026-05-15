package creational.abstractfactory;

import creational.abstractfactory.factoryitems.productinterfaces.Button;
import creational.abstractfactory.factoryitems.productinterfaces.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
