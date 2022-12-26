package week3.day1.inheritance;

public class MyPhone {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.startApp();
        iPhone.sendSMS();
        iPhone.makeCall();
        iPhone.increaseVolume();
        iPhone.shutDown();
    }
}
