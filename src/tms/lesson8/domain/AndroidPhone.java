package tms.lesson8.domain;

public class AndroidPhone extends Phone {

    public AndroidPhone(String number, int volume, String firmware) {
        super(number, volume, firmware);
    }

    @Override
    public void firmware() {
        System.out.println("Version for Android is checked: " + getFirmware());
    }
}
