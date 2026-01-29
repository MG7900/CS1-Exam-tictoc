import java.math.MathContext;

public class Cafe {

    public String name;
    public boolean isOpen;
    public int numberOfPastries;

    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        //instance variable below w/ parameters
        System.out.println();
        Coffee blairCoffee = new Coffee(203, "chocolate", false);
        blairCoffee.printInfo();
        System.out.println();
        //my coffee below w/ parameters

        Coffee myCoffee = new Coffee(67,"vanilla",true);
        myCoffee.printInfo();

    }

    //constructor
    public Cafe(){
        System.out.println("Hello World! Good luck on your exams!");
        name = "Coding Cafe";
        isOpen = false;
        numberOfPastries = 43;
        System.out.println("Welcome to "+name+"! It is "+isOpen+" that we are open. We have "+numberOfPastries+" pastries!");

        //new number of pastries
        numberOfPastries = 67;
        System.out.println("Welcome to "+name+"! It is "+isOpen+" that we are open. We have "+numberOfPastries+" pastries!");

        //methods called below
        randomBakeBatch();
        flavorOfTheDay("coconut");
        System.out.println();
        countBeans();
        baristaChoice();

        starTriangle(3);
        System.out.println();

        perimeterTriangle(3);
        System.out.println();
    }

    public void randomBakeBatch(){

        //setting lower range and upper range
        int randomInt = (int) (Math.random() * 27 + 12);
        System.out.println("We are baking "+randomInt+" pastries today!");
    }

    public void flavorOfTheDay(String flavor){
        System.out.println("Today's special syrup flavor is "+flavor);
    }

    public void countBeans(){
        for(int x=10;x<19;x+=2){
            System.out.println(x);
        }
        //to separate the patterns so they look better
        System.out.println();
        for(int y=30;y<151;y+=30){
            System.out.println(y);
        }
        System.out.println();
        for(int i=6;i>0;i--){
            System.out.print(i+", ");
        }

    }

    public void baristaChoice(){
        int randomNum;
        randomNum = (int)(Math.random()*100);
        System.out.println();
        if(randomNum<25){
            System.out.println("The barista recommends a caramel flavor latte.");
        } else if (randomNum<50) {
            System.out.println("The barista recommends a vanilla flavor latte.");
        } else if (randomNum<75) {
            System.out.println("The barista recommends a vanilla flavor latte.");
        }else{
            //if the code runs to here, this means that randomNum is larger than 75 and must be below 100, so no point to write randomNum<100 etc
            System.out.println("The barista recommends a pumpkin flavor latte.");
        }

    }

    public void starTriangle(int size) {
        //add a variable for row count
        //when x exceeds the row count, next row and print * until equalling the number of rows
        System.out.println();
        for (int x = 1; x <= size; x++) {
            for (int row=1; x > row; row++) {
                System.out.print("* ");
                System.out.println();
            }

        }
    }
    public void perimeterTriangle(int size){

    }
}


