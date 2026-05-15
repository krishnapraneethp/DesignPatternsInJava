package creational.abstractfactory.factoryitems.productinterfaces.windowsproducts;

import creational.abstractfactory.factoryitems.productinterfaces.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Windows Checkbox");
    }
}
