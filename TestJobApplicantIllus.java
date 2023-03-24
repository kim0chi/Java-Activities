public class TestJobApplicantIllus {
    public static void main(String[] args){

        JobApplicantIllus Appli1 = new JobApplicantIllus("Benedict", "09275850761",true,true,false,true);
        JobApplicantIllus Appli2 = new JobApplicantIllus("Charles", "09223151231",true,true,false,false);
        JobApplicantIllus Appli3 = new JobApplicantIllus("Dale", "092423123441",false,false,false,true);
        JobApplicantIllus Appli4 = new JobApplicantIllus("Zach", "091231223121",false,true,false,true);
        JobApplicantIllus Appli5 = new JobApplicantIllus("Miguel", "09531351111",true,true,false,true);
    }

    public Qualification(JobApplicantIllus Appli){
        int count = 0;
        boolean isQualified;
        final int minimum = 3; 

            if(Appli.getWord())
                count += 1;
            if(Appli.getSpread())
                count += 1;
            if(Appli.getData())
                count += 1;
            if(Appli.getGraphics())
                count += 1;
            if(count >= minimum)
                isQualified = true;
            else
                isQualified = false;
            
            return isQualified;
    }

    public static void disp(JobApplicantIllus Appli, String Message){
        System.out.println(Appli.getName()+" "+ Message + "Phone : " + Appli.getPhoneNum());
    }
}
