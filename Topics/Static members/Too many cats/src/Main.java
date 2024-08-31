
class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;
    public static final int TOO_MANY_CATS = 5;


    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        this.name = name;
        this.age = age;

        System.out.println(++counter > TOO_MANY_CATS ? "You have too many cats" : "");
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}