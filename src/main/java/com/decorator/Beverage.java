package com.decorator;

/**
 * @ClassName Beverage
 * @Description
 * @Author ShiZhiQian
 * @Date 2020/4/5 19:26
 *
 * @see java.io.InputStream
 * @see java.io.OutputStream
 *
 * @see java.io.Reader
 * @see java.io.Writer
 *
 **/
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
