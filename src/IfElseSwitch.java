public class IfElseSwitch {

    public static void main(String[] args) {
        int x = 2;
        if(x > 1){
            System.out.println ("x er større end 1");}
        else {System.out.println ("x er mindre eller lig med 1");}

        int color = 3;
        switch (color){

            case 1:
                System.out.println("blue");
                break;
            case 2:
                System.out.println("red");
                break;
            case 3:
                System.out.println("green");
                break;
            case 4:
                System.out.println("yellow");
                break;
            case 5:
                System.out.println("purple");
                break;
            default:
                System.out.println("The color is not defined");

        }}}