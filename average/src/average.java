import java.util.Scanner;

public class average {
   static float Total;
    static String branch;
    static int year;
    static int section;
   static float x;
static float presentStudent;
    public static void main(String[] args) {
      //  float presentStudents;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter tne year\n");
        year = scanner1.nextInt();
        System.out.println("enter the branch\n");
        branch = scanner.nextLine();
        System.out.println("enter the section\n");
        section = scanner.nextInt();
        System.out.print("enter the no. of present students\n");
        presentStudent=scanner.nextInt();

        if(year==1)
        {
            if (branch.equals("IT") == true) {
                Total = 60;}
                if(branch.equals("CS")==true){
                    Total=90;

                }
                firstyear ();


            //here code for other year student data would be written
        }

        //  if(year==2){secondyear(); }
        // if(year==3){thirdyear();}
//  if(year==4){fourthyear();}
System.out.println("The percentage of students is   "+x+"%");

    }

    public static void firstyear() {

            percent();

    }

    public static float percent() {


        System.out.println();


        x=(presentStudent/ Total)*100;

              return x;
    }


}






