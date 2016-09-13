package castro.caonabo.calc;

import java.util.Scanner;

/**
 * Created by castro on 9/13/16.
 */
public class UserOperatrionOFChoice {


    CalculatorApp calculatorApp = new CalculatorApp();


    public String usersMath(String usersAnswers) {
        Scanner userInput = new Scanner(System.in);
        BasicOperatrions mathOperatrions = new BasicOperatrions();
        Display display = new Display();
        String chosenOperator;

              for (int i = 0; i < calculatorApp.option.length; i++) {
                if ((usersAnswers.toUpperCase().equalsIgnoreCase(calculatorApp.option[i].toString()))){
                    display.basicdDisplayInstructions();

                    mathOperatrions.usingOperators(calculatorApp.option[i].toString());

                   // display.displayModes(calculatorApp.option[i].toString(),9);
                }

            }



        return usersAnswers; }
    }
