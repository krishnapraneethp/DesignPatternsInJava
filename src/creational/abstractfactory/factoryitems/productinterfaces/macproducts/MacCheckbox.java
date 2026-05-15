package creational.abstractfactory.factoryitems.productinterfaces.macproducts;

import creational.abstractfactory.factoryitems.productinterfaces.Checkbox;

public class  MacCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Mac Checkbox");
    }
}
