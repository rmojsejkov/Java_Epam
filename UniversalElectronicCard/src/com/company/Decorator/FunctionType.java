package com.company.Decorator;

/**
 * This is an abstract class
 */
public abstract class FunctionType extends UEC {
    protected UEC uec;

    public FunctionType(UEC uec) {
        this.uec  = uec;
    }

    public abstract String getInfo();
}
