package creational.abstractfactory;

import creational.abstractfactory.factoryitems.productinterfaces.Button;
import creational.abstractfactory.factoryitems.productinterfaces.Checkbox;

public class Application {
    private Button button = null;
    private Checkbox checkbox = null;

    public Application(GuiFactory factory) {
        if(factory != null) {
            this.button = factory.createButton();
            this.checkbox = factory.createCheckbox();
        }
    }

    public void paint() {
        button.paint();
    }

    public void check() {
        checkbox.check();
    }
}
