public class JobApplicant {

        private String name, phone;
     
        private boolean word, spreadsheet, database, graphics;
     
        public JobApplicant(String name, String phone, boolean word, boolean spreadsheet, boolean database, boolean graphics){
     
            this.name = name;
     
            this.phone = phone;
     
            this.word = word;
     
            this.spreadsheet = spreadsheet;
     
            this.database = database;
     
            this.graphics = graphics;
     
        }

    public String getName() {return name;}

    public String getPhone() {return phone;}

    public boolean getWord() {return word;}

    public boolean getSpreadsheet() {return spreadsheet;}

    public boolean getDatabase() {return database;}

    public boolean getGraphics() {return graphics;}

}
