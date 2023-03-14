/*
* Since all Java code is part of a class then we must declare functions as part of the class;
* All functions inside a class are called "methods";
* All methods must have a type, larger() is type `int` and must return an integer;
*
* */
public class DefineFunctions {
    public static int larger(int x, int y){
        return Math.max(x, y);
    }
    public static void main(String[] args) {
        System.out.println(larger(2, 5));
    }

}