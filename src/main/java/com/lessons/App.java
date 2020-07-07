package com.lessons;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);


    /**********************************************************
     * main()
     *
     * Main program to access this class from the command-line
     ********************************************************** */
    public static void main(String[] args)
    {
        logger.debug("main() started");

        // Verify the command line arguments
        verifyCommandLineArgs(args);

        String arg1 = args[0];
        String arg2 = args[1];
        String s = "Hello";
        String s2 = "World";
        String s3 = s + s2;
        logger.debug(s3);
        Integer i=7;
        String s4 = "yo";
        logger.debug(s4);

        // Create a new instance (or copy) of the AddStuff class
        AddStuff a = new AddStuff(arg1, arg2);
        AddStuff b = new AddStuff("12", "20");
        AddStuff c = new AddStuff("30", "20");
        AddStuff d = new AddStuff("50", "60");
        AddStuff e = null;



     int sum =   b.getSum();
//      int sum3 = e.getSum();
      int mul = b.getMultiplication();
      logger.debug("mul={}", mul);

        // Calculate the sum
        int sum2 = a.getSum();

        logger.debug("sum={}", sum);
        System.out.println(arg1 +  "+" + arg2 + "=" + sum);


        logger.debug("main() finished.");
    }


    /**********************************************************
     * verifyCommandLineArgs()
     *
     * Verify that the args are valid
     * Verify that only 2 args were provided
     ********************************************************** */
    private static void verifyCommandLineArgs(String[] args)
    {
        if (args.length != 2)
        {
            // The user did not provide the two arguments
            throw new RuntimeException("You did not provide exactly 2 arguments");
        }

        String arg1 = args[0];
        String arg2 = args[1];

        if (StringUtils.isNumeric(arg1) == false)
        {
            throw new RuntimeException("Your 1st argument of " + arg1 + " is not numeric.  It must be a number.");
        }
        else if (StringUtils.isNumeric(arg2) == false)
        {
            throw new RuntimeException("Your 2nd argument of " + arg2 + " is not numeric.  It must be a number.");
        }
    }

}