public class Automobile {
    
    private int IdNum, Year, milesGallon;
    private String Make, Color, Model;

    public void setIdNum(int newIdNum)
    {
        if (newIdNum >= 0 && newIdNum <= 9999)
        {
            this.IdNum = newIdNum;
        }
       else this.IdNum = 0;
    }

    public void setYear (int newYear)
    {
        if (newYear >= 2000 && newYear <= 2017)
        {
        this.Year = newYear;
        }
        else this.Year = 0;
    }

    public void setMilesGallon(int newMilesGallon)
    {
        if(newMilesGallon >= 10 && newMilesGallon <= 60)
        {
            this.milesGallon = newMilesGallon;
        } 
        else this.milesGallon = 0;
    }

    public void setMake(String newMake){
        this.Make = newMake; 
    }

    public void setColor(String newColor){
        this.Color = newColor;
    }

    public void setModel(String newModel){
        this.Model = newModel;
    }

    public int getIdNumber(){return this.IdNum;}
    public int getYear(){return this.Year;}
    public int getMilesPerGallon(){return this.milesGallon;}
    public String getMake(){return this.Make;}
    public String getModel(){return this.Model;}
    public String getColor(){return this.Color;}

    

    public Automobile(int idnum, int year, int milesgallon, String make, String model, String color){
        setIdNum(idnum);
        setYear(year);
        setMilesGallon(milesgallon);
        setMake(make);
        setModel(model);
        setColor(color);
    }

    void dispIdNum(){
        System.out.println("Car ID Number : "+ this.IdNum);
    }

    void dispYear(){
        System.out.println("Car Production Year : "+this.Year);
    }

    void dispMilesGallon(){
        System.out.println("Miles Per Gallon Consumption : "+this.milesGallon);
    }

    void dispMake(){
        System.out.println("Car Brand Make : "+this.Make);
    }

    void dispModel(){
        System.out.println("Car Model : "+this.Model);
    }

    void dispColor(){
        System.out.println("Car Color : "+this.Color);
    }
}
