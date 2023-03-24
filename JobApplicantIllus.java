public class JobApplicantIllus{

    private String Name, phoneNum;
    private boolean Word, Spread, Data, Graphics;

    //Include a Constructor that accepts values for each field 
    public JobAppli(String name, String phone, boolean word, boolean spread, boolean data, boolean graphics){
        this.Name = name;
        this.phoneNum = phone;
        this.Word = word;
        this.Spread = spread;
        this.Data = data;
        this.Graphics = graphics;
    }

    //Get Method for each Field
    public String getName(){return this.Name;}
    public String getPhoneNum(){return this.phoneNum;}
    public boolean getWord(){return this.Word;}
    public boolean getSpread(){return this.Spread;}
    public boolean getData(){return this.Data;}
    public boolean getGraphics(){return this.Graphics;}
}