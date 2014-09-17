package Project1;

public class LawnGames {

    static String[] eventArray;

    static String[][] olympArray;


        public LawnGames() {

              olympArray = new String[][] {

                      {"Liz","female","19"},
                      {"Amanda","female","19"},
                      {"Emily","female","20"},
                      {"Emma","female","20"},
                      {"Claire", "female","17"},
                      {"Brooke","female","22"},
                      {"Marianne","female","49"},
                      {"Susan","female","47"},
                      {"Joe","male","50"},
                      {"Jack","male","20"},
                      {"Kevin","male","21"},
                      {"Brendan","male","20"},
                      {"Dylan","male","18"},
                      {"Chris","male","20"},
                      {"Sam","male","20"},


            };

                 eventArray = new String[]{

                   "Washoos","CanJam","Horseshoes","Cornhole","Ladderball","Stickgame"
            };


        }



        public void displayEvents(){

               for (int i=0; i<eventArray.length; i++) {

                   System.out.println(eventArray[i]);
               }

        }


        public void displayOlymp() {

            for (int i = 0; i < olympArray.length; i++) {
                System.out.print(olympArray[i][0] + ": ");
                for (int j = 1; j < olympArray[i].length; j++) {
                    System.out.print(olympArray[i][j] + " ");
                }
                System.out.println();
            }

        }



        public static void displayHelp(){

            System.out.print("Enter either the command event or olympians. Events command will display the days events and olympians will display the days olympians' name, sex and age. ");
        }

       public static void main(String []args) {

        System.out.println("Lawn Games");

        LawnGames game1 = new LawnGames();

           if (args[0].equals("events")){

               game1.displayEvents();

           }  else if(args[0].equals("olympians")){

               game1.displayOlymp();

           }  else {

               displayHelp();
           }


    }
}

