package creational.abstractfactory.factoryitems.productinterfaces.windowsproducts;

import creational.abstractfactory.factoryitems.productinterfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }

}
