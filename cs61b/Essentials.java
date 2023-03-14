/*
 * In Java all code live inside a class;
 * All statements must end with a semicolon;
 * main () is declared as public static void main(String[] args);
 */
public class Essentials{
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
    }
}

/*
 * javac(Java Compiler)
 * java(Java Interpreter)
 *
 * RUN IT;
 * Essentials.java ---(javac)---> Essentials.class ---(java)---> STUFF HAPPENS;
 * WE COMPILE .JAVA & INTERPRET .CLASS;
 *
 * Just for fun. Try opening up Essentials.class using a text editor like Notepad, TextEdit, Sublime, vim, or whatever you like.
 * You'll see lots of crazy garbage that only a Java interpreter could love.
 * This is Java bytecode, which we won't discuss in our course.
 */

/*
 * CLASS FILE
 * Is type CHECK; Distributed code is safer;
 * .CLASS files are simpler for machine to execute; Distributed code is faster;
 */