public class Monster{

    private String name;
    private int age;

    public Monster(String name, int age){
        this.name = name;
        this.age = age;

    }


    public String setName(String name){
        this.name = name;
        return name;
    }

    public String getName(){
        return name;
    }

}