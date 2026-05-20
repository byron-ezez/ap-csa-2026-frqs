public class Bottle{
  private double maxCap;
  private double current;
  private double tfPer;

  public Bottle(double maxCap){
    this.maxCap = maxCap;
    current = maxCap;
    tfPer = maxCap/4;
  }

  public double updateAmount(double remove){
    if(current-remove >= tfPer){
        current = current-remove;
        return current;
    }
    current = maxCap;
    return current;
    
  }



  
}
