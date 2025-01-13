package tms.lesson8.domain;

public class ApplePhone extends Phone{

      public ApplePhone(String number, int volume, String firmware) {
        super(number, volume, firmware);
    }

    @Override
    public void firmware() {
        System.out.println("Version for Apple is checked: " + getFirmware());
    }
}
