package castro.caonabo.calc;

/**
 * Created by castro on 9/13/16.
 */
public class UserMemory {

    double currentMemory;

    public double getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(double currentMemory) {
        this.currentMemory = currentMemory;
    }

    public void clearMemory(){
    this.currentMemory = 0;

    }
}
