package tms.lesson8.domain;

public class WindowsPhone extends Phone{

    public WindowsPhone(String number, int volume, String firmware) {
        super(number, volume, firmware);
    }

    @Override
    public void firmware() {
        System.out.println(getFirmware());
    }

    @Override
    public void call(String number) {
        System.out.println("You are calling to Windows phone: " + number);
    }
}
