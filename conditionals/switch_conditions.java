import javax.swing.plaf.synth.SynthStyle;

class SwitchConditions{
    public static void main(String args[]){
        int n = 6;
        String day = "";

        // If Else

        // if (n==1)
        //     day = "Monday";
        // else if (n==2)
        //     day = "Tuesday";
        // else if (n==3)
        //     day = "Wednesday";
        // else if (n==4)   
        //     day = "Thursday";
        // else if (n==5)
        //     day = "Friday";
        // else if (n==6)
        //     day = "Saturday";
        // else
        //     day = "Sunday";


        switch(n){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:   
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
        }

        System.out.println(day);
    
        
        String date_s = "Monday";

        switch(date_s){
            case "Saturday", "Sunday" -> System.out.println("6 am");

            case "Monday" -> System.out.println("9 am");

            default -> System.out.println("8 am");
        }
        
        String result = switch(date_s){
            case "Saturday", "Sunday" -> "6 am";

            case "Monday" -> "9 am";

            default -> "8 am";
        };

        System.out.println("Alarm is at -> " + result);


        result = switch(date_s){
            case "Saturday", "Sunday": yield "6 am";

            case "Monday": yield "9 am";

            default: yield "8 am";
        };

        System.out.println("Alarm is at (with colon) -> " + result);
    
    }
}