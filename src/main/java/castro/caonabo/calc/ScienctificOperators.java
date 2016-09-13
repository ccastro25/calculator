package castro.caonabo.calc;

import java.util.Scanner;
import java.util.logging.MemoryHandler;

/**
 * Created by castro on 9/13/16.
 */
public class ScienctificOperators {

    UserMemory userMemory = new UserMemory();
    Display display = new Display();
   Scanner userInput = new Scanner(System.in);
    String usersChoice;


    double firstnumber;
    double secondnumber;

    public void trigFunctions() {
        BasicOperatrions basicOperators = new BasicOperatrions();
        ScienctificOperators sciencetificFeatures = new ScienctificOperators();
        double conversion = 0;

        while (true) {

            while (true) {
                display.sciencetificDisplay();
                display.enteringOperators();
                usersChoice = userInput.next();
                basicOperators.quitOrBack(usersChoice);

                try {
                    display.askingForNumbers();
                    firstnumber = userInput.nextInt();
                } catch (Exception e) {
                    display.errorMessage();
                }


                try {
                    display.askingForNumbers();
                    secondnumber = userInput.nextInt();
                } catch (Exception e) {
                    display.errorMessage();
                }


                if (usersChoice.equalsIgnoreCase("sine")) {
                    conversion = sciencetificFeatures.sine(firstnumber);
                    display.showTrigfunc(conversion);

                } else if (usersChoice.equalsIgnoreCase("invertedSine")) {
                    conversion = sciencetificFeatures.invertedSine(firstnumber);
                    display.showTrigfunc(conversion);
                    //basicOperators.setMemory(conversion);

                } else if (usersChoice.equalsIgnoreCase("Cosine")) {
                    conversion = sciencetificFeatures.cosine(firstnumber);
                    display.showTrigfunc(conversion);
                    // basicOperators.setMemory(conversion);

                } else if (usersChoice.equalsIgnoreCase("inverteCosine")) {
                    conversion = sciencetificFeatures.invertedCosine(firstnumber);
                    display.showTrigfunc(conversion);
                    //  basicOperators.setMemory(conversion);

                } else if (usersChoice.equalsIgnoreCase("tangent")) {
                    conversion = sciencetificFeatures.tangent(firstnumber);
                    display.showTrigfunc(conversion);
                    //  basicOperators.setMemory(conversion);

                } else if (usersChoice.equalsIgnoreCase("inversetanget")) {
                    conversion = sciencetificFeatures.invertTangent(firstnumber);
                    display.showTrigfunc(conversion);
                    // basicOperators.setMemory(conversion);

                } else if (usersChoice.equalsIgnoreCase("inverese")) {
                    conversion = sciencetificFeatures.invert(firstnumber);
                    display.showTrigfunc(conversion);
                    // basicOperators.setMemory(conversion);

                } else if (usersChoice.equalsIgnoreCase("log")) {
                    conversion = sciencetificFeatures.log(firstnumber);
                    display.showTrigfunc(conversion);

                } else if (usersChoice.equalsIgnoreCase("log10")) {
                    conversion = sciencetificFeatures.log10(firstnumber);
                    display.showTrigfunc(conversion);
                    // basicOperators.setMemory(conversion);

                } else if (usersChoice.equalsIgnoreCase("squareRoot")) {
                    conversion = sciencetificFeatures.squareRoot(firstnumber);
                    display.showTrigfunc(conversion);

                } else if (usersChoice.equalsIgnoreCase("square")) {
                    conversion = sciencetificFeatures.square(firstnumber);
                    display.showTrigfunc(conversion);
                    //  basicOperators.setMemory(conversion);

                } else if (usersChoice.equalsIgnoreCase("exponent")) {
                    conversion = sciencetificFeatures.exponent(firstnumber, secondnumber);
                    display.showTrigfunc(conversion);

                } else if (usersChoice.equalsIgnoreCase("square")) {
                    conversion = sciencetificFeatures.square(firstnumber);
                    display.showTrigfunc(conversion);
                    // basicOperators.setMemory(conversion);

                } else if (usersChoice.equalsIgnoreCase("factorial")) {
                    conversion = sciencetificFeatures.factorial(firstnumber);
                    display.showTrigfunc(conversion);
                    // basicOperators.setMemory(conversion);
                }

                else  if (usersChoice.equalsIgnoreCase("M+")){userMemory.setCurrentMemory(conversion);}
                else  if (usersChoice.equalsIgnoreCase("mr")){conversion=userMemory.getCurrentMemory();display.Show(conversion);}
                else  if (usersChoice.equalsIgnoreCase("mc")){userMemory.clearMemory();}
            }

        }
        }
    public double sine( double firstnumber){return  Math.sin(firstnumber);}

    public double invertedSine(double firstnumber){return  Math.asin(firstnumber);}

    public double cosine(double firstnumber){ return Math.cos(firstnumber);}

    public double invertedCosine(double firstnumber){return  Math.acos(firstnumber);}

    public double tangent(double firstnumber){return Math.tan(firstnumber);}

    public double invertTangent(double firstnumber){return  Math.atan(firstnumber);}

    public double invert(double firstnumber){return (1/firstnumber); }

    public double log(double firstnumber){return Math.log(firstnumber);}

    public double log10(double firstnumber){return Math.log10(firstnumber);}

    public double squareRoot(double firstnumber){return Math.sqrt(firstnumber);}

    public double square(double firstnumber){return Math.pow(firstnumber, 2.0);}

    public double factorial(double firstnumber){
        int fact = 1; // this  will be the result
        for (int i = 1; i <= firstnumber; i++) {
            fact *= i;
        }
        return fact;
    }

    public double exponent(double firstnumber, double secondNumber){return Math.pow(firstnumber, secondNumber);}
}

