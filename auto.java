public class auto {

        private int idNumber, year, milesPerGallon;
    
        private String model, make, color;
    

		public void setIdNumber(int idNumber){
    
           if (idNumber >= 0 && idNumber <= 9999)
    
               this.idNumber = idNumber;
    
           else this.idNumber = 0;
    
        }
    
        public void setModel(String model){
    
            this.model = model;
    
        }
    
        public void setYear(int year){
    
           if (year >= 2000 && year <= 2017)
    
               this.year = year;
    
           else this.year = 0;
    
        }
    
        public void setMilesPerGalon(int milesPerGallon){
    
           if (milesPerGallon >= 10 && year <= 60)
    
               this.milesPerGallon = milesPerGallon;
    
           else this.milesPerGallon = 0;
    
        }
    
        public void setMake(String make){
    
            this.make = make;
    
        }
    
        public void setColor(String color){
    
            this.color = color;
    
        }
    
        public int getIdNumber(){return idNumber;}
    
        public String getModel(){return model;}
    
        public int getYear(){return year;}
        
        public int getMilesPerGallon(){return milesPerGallon;}
    
    
        public String getMake(){return make;}
    
        public String getColor(){return color;}
    
    
        public auto(int idNumber, String make, String model, int year, int milesPerGallon, String color){
    
           setIdNumber(idNumber);
    
           setModel(model);
    
           setYear(year);

           setMilesPerGalon(milesPerGallon);
    
           setMake(make);
    
           setColor(color);
    
        }
}
