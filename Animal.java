package oops_part1.Abstraction;

public abstract class Animal {
    public int age;

    public String name ;

    public int getAge() {
        System.out.println("My age is 21");
        return age;
    }

    public void setAge(int age) {
        System.out.println("G" + "Govind");
        this.age = age;
    }


//If we remove public access modifier from here then this class or sayhello will only excessable to this package
    public abstract void Sayhello();

    public void sleep(){
        System.out.println("ZZZ...");
    }

}
