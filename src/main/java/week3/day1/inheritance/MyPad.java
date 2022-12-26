package week3.day1.inheritance;

public class MyPad extends IPad {

    public static void main(String[] args) {
        MyPad myPad = new MyPad();
        myPad.watchMovie();
        myPad.watchMovie("Horizontal");
        myPad.watchMovie("Vertical", 120);
    }
}
