public class TestAutomobile {
    
    public static void main(String[] args){
        Automobile Car1 = new Automobile(8888, 2000, 60, "Yamaha", "Prius", "Candy Red");
        
        Car1.dispIdNum();
        Car1.dispMake();
        Car1.dispYear();
        Car1.dispModel();
        Car1.dispMilesGallon();
        Car1.dispColor();
    }
}
