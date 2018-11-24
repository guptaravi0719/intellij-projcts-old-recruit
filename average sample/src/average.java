import java.util.Scanner;

public class averagesample {
    static int Total;
    static String branch;
    static int year;
    static int section;
static int per;
static int presentStudets;
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tne year\n");
        year = scanner.nextInt();
        System.out.println("enter the branch\n");
        branch = scanner.nextLine();
      if(year==1)
      {
        if (branch.equals("IT") == true) {
            Total = 60;
         if(branch.equals("CS")){
             Total=90;
         }
        }
        //here code for other year student data would be written
        }
        System.out.println("enter the section\n");
        section = scanner.nextInt();
        if (year == 1) {
            firstyear();
        }
        System.out.print("enter the no. of present students\n");
        presentStudets=scanner.nextInt();
        //  if(year==2){secondyear(); }
        // if(year==3){thirdyear();}
//  if(year==4){fourthyear();}
System.out.println("The percentage of students is"+per+"%");

    }

    public static void firstyear() {
        if (branch.equals("IT") == true) {
            percent(Total);


        }
    }

    public static int percent(int t) {
per=(presentStudets/Total)*100;
return per;
    }


}






