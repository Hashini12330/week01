import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Monster mons = new Monster("John", 35);

        System.out.println("Moanster name is: " + mons.getName());
        System.out.println("Set new name to: " + mons.setName("BOB"));
        

        // print 2D array
        array arr = new array();
        arr.printArray();

        // set size of 2D array
        setSize size = new setSize();
        size.setArray();

        // Array and ArrayList
        arrLists obj = new arrLists(20, "John");
        obj.tools.add("Hammer");
        obj.tools.add("Screwdriver");   

        obj.shoeDetails();




    }
}


// 2D array
class array{
    int[][] PlayerInv = {
        {1, 0},
        {0, 1},
        {1, 1}
    };


    public void printArray(){
        for (int i = 0; i < PlayerInv.length; i++){
            
            System.out.println("Row " + (i + 1) + ":");


            for (int item = 0; item < PlayerInv[i].length; item++){
                System.out.println("Item" + (item + 1) + ": " + PlayerInv[i][item]);
            }
        }
    }

}



// set size of 2D array
class setSize{
    int[][] num = new int[3][4]; // row size = 3, column size = 4


    public void setArray(){
        num[0][0] = 4;  
        num[1][2] = 5;
        num[2][3] = 6;

        /*              Column
                    0    1    2    3
                +----+----+----+----+
        Row 0    |    |    |    |    |
                +----+----+----+----+
        Row 1    |    |    |    |    |
                +----+----+----+----+
        Row 2    |    |    |    |    |
                +----+----+----+----+         */

    
        System.out.println("Row size: " + num.length); // row size
        System.out.println("Column size: " + num[0].length); // column size

        // print 2D array
        System.out.println("Print elements: " + num[0][0]);

    }

}


// Array and ArrayList
class arrLists{
    private int age;
    private String name;

    // array attribute
    int[] arr = {1, 2, 8, 6, 4}; // array

    // collection attrinute
    ArrayList<String> tools = new ArrayList<String>();

    // constructor
    public arrLists(int age, String name){
        this.age = age;
        this.name = name;

    }

    // method to set array values
    public void shoeDetails(){
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);


        // for Array
        System.out.println("Array values:");
        for(int num : arr){
            System.out.println(num);

        }

        // for ArrayList
        System.out.println("ArrayList values:");
        for(String tool : tools){
            System.out.println(tool);

        }

    }






}