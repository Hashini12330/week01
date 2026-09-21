public class Main {
    public static void main(String[] args){

        Monster mons = new Monster("John", 35);

        System.out.println("Moanster name is: " + mons.getName());
        System.out.println("Set new name to: " + mons.setName("BOB"));
        

        // print 2D array
        array arr = new array();
        arr.printArray();


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
