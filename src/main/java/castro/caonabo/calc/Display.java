package castro.caonabo.calc;

/**
 * Created by castro on 9/13/16.
 */
public class Display {


    public void welcomeDispaly() {
        System.out.println("\n\n\nTo change to DECIMAL mode enter: decimal \n\n" +
                "for HEXADECIMAL mode enter: hexadecimal \n\n" +
                ",for BINARY mode enter: binary\n\n" +
                ", and OCTAL mode enter: octal.\n\n To quit calculator enter :quit \n\n");
    }


    public void basicdDisplayInstructions() {
        System.out.println("  ENTER THE NUMBER FOLLWED BY ENTER/RETURN ," +
                "THAN THE OPERATOR AND LASTLY THE NEXT VALUE.\n \n to call info: info\n go back enter back ,\nto quit enter quit .\nThese options are typed in the operator sections ");

        System.out.println("The funcions available and commands are :\n\n " +
                "add,divide,subtract,multiply\n\n" +
                        "or for sciencetific: sciencetific:"
                );
    }



    public  void printAllInstructions(){
        basicdDisplayInstructions();;
        sciencetificDisplay();
        memoryOptions();

    }

    public void sciencetificDisplay(){

        System.out.print("sciencetific: sciencetific\n\n"
                +"Which include:\n"+
                "sine : sine\n" +
                "Inverted Sine : invertedSine\n" +
                "Consine: consine\n" +
                "Inverse Cosine: inverseCosine\n" +
                "Tangent: tanget \n" +
                "Inverse Tanget: inverseTanget\n" +
                "The inverse of any number: inverse \n" +
                "Log: log\n" +
                "log10: log10\n\n" +
                "square root: squarerRoot\n" +
                "Rasising to the power: exponent\n" +
                "Square: square \n" +
                "Factorial: factorial\n"
                );
    }

    public void errorMessage(){
        System.out.println("ERROR");
    }



   public  String displayModes(String mode,double value){




       String convertedNumber="";
       CalculatorApp calculatorApp = new CalculatorApp();


        if(mode.equalsIgnoreCase(calculatorApp.option[1].toString())){
             convertedNumber = Integer.toString((int)value, 2);// to binary

            System.out.println(convertedNumber+"\n\n");}


        else if(mode.equalsIgnoreCase(calculatorApp.option[3].toString())){
              convertedNumber = Integer.toString((int)value, 16);// to hex


            System.out.println(convertedNumber+"\n\n");}


        else if(mode.equalsIgnoreCase(calculatorApp.option[2].toString())){
            convertedNumber = Integer.toString((int)value, 8);// to octal

            System.out.println(convertedNumber+"\n\n");}


        else {
            convertedNumber = Double.toString(value);//

            System.out.println(convertedNumber+"\n\n");}

 return convertedNumber;

    }


    public void askingForNumbers(){

        System.out.println("Please Enter your number");


    }

    public void enteringOperators(){
        System.out.println("Enter your operation, back or quit");

    }

    public void showTrigfunc(double resutls){

        System.out.print(resutls);
        memoryOptions();
    }

    public void Show(double value){
        System.out.println(value);

    }


    public void memoryOptions(){

        System.out.println("\n\n Mc: clear\n Mrc: remove\n M+: add");
    }
}



