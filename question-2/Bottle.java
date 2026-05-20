public class Bottle{
/* variables for the maximum capacity, current amount in a bottle, and twenty five percent 
of the maximum capacity for the updateAmount method */
  private double maxCap;
  private double current;
  private double tfPer;
/* Bottle constructor, assigns a maximum capacity, sets the current 
to the maximum capacity and caculates 25% of the maximum capacity */
  public Bottle(double maxCap){
    this.maxCap = maxCap;
    current = maxCap;
    tfPer = maxCap/4;
  }
/* Checks if the amount being removed from the current amount is at least 25% of the current amount, 
if it is then that amount will be removed, if not then the current amount will be set to the maximum capacity */
  public double updateAmount(double remove){
    if(current-remove >= tfPer){
        current = current-remove;
        return current;
    }
    current = maxCap;
    return current;
    
  }



  
}
