package week3.day1.inheritance;

public class IPad extends IOS {

    public void watchMovie() {
        System.out.println("Watching movie from iPad");
    }

    public void watchMovie(String orientation) {
        System.out.println("Watching movie from iPad in " + orientation + " orientation") ;
    }

    public void watchMovie(String orientation, int timeout) {
        System.out.println("Watching movie from iPad in " + orientation + " orientation with max timeout as " + timeout + " minutes");
    }
}
