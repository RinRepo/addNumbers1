package com.lessons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddStuff
{
    private static final Logger logger = LoggerFactory.getLogger(AddStuff.class);


    private int operand1;
    private int operand2;

public String stuff = "Hi Mom";
    /**********************************************************
     * AddStuff()   **CONSTRUCTOR**
     *
     * Assumes that the strings are numeric
     ********************************************************** */
    public AddStuff(String aArg1, String aArg2)
    {
        logger.debug("AddStuff() constructor started.");

        this.operand1 = java.lang.Integer.parseInt(aArg1);
        this.operand2 = java.lang.Integer.parseInt(aArg2);
    }



    /**********************************************************
     * getSum()
     *
     * Add=up the numeric values and return the result
     ********************************************************** */
    public int getSum()
    {
        Integer i = 5;

        logger.debug("getSum() called.  Returns {}", this.operand1 + this.operand2);
        return(this.operand1 + this.operand2);
    }

    public int getMultiplication()
    {
        Integer i = 5;

        logger.debug("getMultiplication() called.  Returns {}", this.operand1 * this.operand2);
        int answer = this.operand1 * this.operand2;
        return(answer);
    }

}