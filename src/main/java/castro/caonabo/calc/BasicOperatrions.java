package castro.caonabo.calc;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.Scanner;

/**
 * Created by castro on 9/13/16.
 */
public class BasicOperatrions {
    double resultFromOperations;
    Display display= new Display();
    UserMemory userMemory= new UserMemory();
    ScienctificOperators scienctificOperators = new ScienctificOperators();
    boolean keepgoing = true;
    double conversion;


    public void usingOperators(String mode){
        double firstNumber=0,secondNumber=0;
        String chosenOperator ;
        Scanner numberAndOperators = new Scanner(System.in);


        BasicOperatrions mathOperatiosn = new BasicOperatrions();

        while (keepgoing){
            display.basicdDisplayInstructions();
        display.enteringOperators();
        chosenOperator = numberAndOperators.next();
            quitOrBack(chosenOperator);

       try {
           display.askingForNumbers();
           firstNumber = numberAndOperators.nextInt();
       }catch (Exception e){display.errorMessage();}


        try {
            display.askingForNumbers();
            secondNumber = numberAndOperators.nextInt();
        }catch (Exception e){display.errorMessage();}


        switch (chosenOperator.toLowerCase()) {



            case"add":
                conversion = mathOperatiosn.add(mode,firstNumber, secondNumber);
                break;
            case"subtract":
                 conversion = mathOperatiosn.substract(mode,firstNumber, secondNumber);
                break;

            case "divide":
                 conversion = mathOperatiosn.divide(mode,firstNumber, secondNumber);
                break;

            case"multiply":
                 conversion = mathOperatiosn.multiPly(mode,firstNumber, secondNumber);
                break;

            case "sciencetific":
                scienctificOperators.trigFunctions();
                break;

            case "info":
                display.printAllInstructions();
                break;
            case "m+":
                userMemory.setCurrentMemory(conversion);
                break;
            case "mc":
                userMemory.setCurrentMemory(conversion);
                break;
            case"mrc":
                conversion=userMemory.getCurrentMemory();display.displayModes(mode,conversion);
                break;
            case"quit":
                 System.exit(0);
                default:
               break;

            }

    }}








public double add(String mode ,double firstNumber,double secondNumber){
        resultFromOperations=(firstNumber + secondNumber);
    display.displayModes(mode,resultFromOperations);
        return resultFromOperations;}


public double substract(String mode ,double firstNumber,double secondNumber){
        resultFromOperations=(firstNumber - secondNumber);
    display.displayModes(mode,resultFromOperations);
        return resultFromOperations;

        }

public double divide(String mode ,double firstNumber,double secondNumber){
        resultFromOperations = (firstNumber / secondNumber);
    display.displayModes(mode,resultFromOperations);
        return resultFromOperations;
        }

public double multiPly(String mode ,double firstNumber,double secondNumber){
        resultFromOperations = (firstNumber * secondNumber);
    display.displayModes(mode,resultFromOperations);
        return resultFromOperations;
        }

public void quitOrBack(String userChoice){
        if(userChoice.equalsIgnoreCase("back")){keepgoing =false;}
        else if (userChoice.equalsIgnoreCase("sciencetific")){scienctificOperators.trigFunctions();}
        else if(userChoice.equalsIgnoreCase("quit")){System.exit(0);}

        }

}
