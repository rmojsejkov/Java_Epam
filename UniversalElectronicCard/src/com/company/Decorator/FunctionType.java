package com.company.Decorator;

/**
 * This is an abstract class, that is a decorator
 * @author Moiseikov R.A
 * @version 1.0
 */
public abstract class FunctionType extends UEC {
    protected UEC uec;

    public FunctionType(UEC uec) {
        this.uec  = uec;
    }

    public abstract String getInfo();
}
