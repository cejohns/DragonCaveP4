package Java;

import java.util.Scanner;


public class DragonCave {
    public static  String CavePicker(int cave)
    {
        System.out.println("You are in the land full of Dragons. In front on you, " +
                "You see two caves. In one cave, the dragon is friendly" +
                "and will share his treasure with you. The other dragon " +
                "is greedy and hungry and will eat you on sight." +
                "Which cave will you go  into? (1 or 2)");
        //int cave;
        String result = "";



        try
        {
            if (cave<=2)
            {
                if(cave == 1)
                {
                    //System.out.println("You've won!!");
                    result ="You've won!!";

                }
                else if (cave == 2)
                {
                    //System.out.println("You're Dead!!");
                    result = "You're Dead!!";
                } else if (cave == 0) {
                    //end game
                    System.exit(0);
                }
            }
            else
            {

                throw  new IndexOutOfBoundsException();
            }

        }

        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e + "You entered 1 or 2");
        }
        return result;
    }
    public static   void main(String[] args){

        //Scanner myObj = new Scanner(System.in);
        // String Message = "";
        Scanner myObj = new Scanner(System.in);
        int cave = myObj.nextInt();

    }


}
