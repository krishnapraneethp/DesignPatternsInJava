package creational.abstractfactory.factoryitems.productinterfaces.macproducts;

import creational.abstractfactory.factoryitems.productinterfaces.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }

}