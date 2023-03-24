import java.util.Scanner;

public class TestJobApplicant{

public static void main(String[] args)

{

   JobApplicant applicant1 = new JobApplicant("Ted","555-1234", true, false, false, false);

   JobApplicant applicant2 = new JobApplicant("Lily", "655-1235", true, false, true, false);

   JobApplicant applicant3 = new JobApplicant("Marshall", "755-1236", false, false, false, false);

   JobApplicant applicant4 = new JobApplicant("Barney", "855-1237", true, true, true, false);

   JobApplicant applicant5 = new JobApplicant("Robin", "955-1238", true, true, true, true);

 

   String qualifiedMessage = "is qualified for an interview. ";

   String notQualifiedMessage = "is not qualified for an interview at this time. ";

   

   

   if (isQualified(applicant5))

       display(applicant5, qualifiedMessage);

   else

       display(applicant5, notQualifiedMessage);

}

   public static boolean isQualified(JobApplicant applicant) {

       int count = 0;

       boolean isQualified;

       final int MIN_SKILLS = 3;

     

       if(applicant.getWord())

           count += 1;

       if(applicant.getSpreadsheet())

           count += 1;

       if(applicant.getDatabase())

           count += 1;

       if(applicant.getGraphics())

           count += 1;

       if(count >= MIN_SKILLS)

           isQualified = true;

       else

           isQualified = false;

       return isQualified;

   }

   public static void display(JobApplicant applicant, String message) {

       System.out.println(applicant.getName() + " " + message +" Phone: " + applicant.getPhone());

   }

}

