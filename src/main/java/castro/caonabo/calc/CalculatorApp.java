package castro.caonabo.calc;

import java.util.Scanner;

/**
 * Created by castro on 9/13/16.
 */
public class CalculatorApp {
Options[] option = Options.values();
    Options currentOption = Options.DECIMAL;



public enum Options{

    DECIMAL,BINARY,OCTAL,HEXADECIMAL
}

    public static void main(String[] args) {
        CalculatorApp app = new CalculatorApp();

        app.goinBack();
        while (true) {
            UserOperatrionOFChoice userOperatrionOFChoice = new UserOperatrionOFChoice();
            String usersDecision;

            Display display = new Display();
            Scanner userInput = new Scanner(System.in);

            display.welcomeDispaly();
            usersDecision = userInput.next();

            if(usersDecision.equalsIgnoreCase("quit")){System.exit(0);}
            else {userOperatrionOFChoice.usersMath(usersDecision);
            }
        }

    }

public void goinBack(){}


}
