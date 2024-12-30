package tms.lesson8;

import tms.lesson8.domain.AndroidPhone;
import tms.lesson8.domain.ApplePhone;
import tms.lesson8.domain.Phone;
import tms.lesson8.domain.WindowsPhone;
import tms.lesson8.services.impl.CheckQualityServiceImpl;

public class MainApp {

    public static void main(String[] args) {

        ApplePhone phone1 = new ApplePhone("+375291702382", 5, "13.0");
        AndroidPhone phone2 = new AndroidPhone("+375291702435", 0, "SB258X36");
        WindowsPhone phone3 = new WindowsPhone("+375449632587", 20, "Win 10");

        CheckQualityServiceImpl checkQualityService = new CheckQualityServiceImpl();

        checkQualityService.check(phone1);
        checkQualityService.check(phone2);
        checkQualityService.check(phone3);

        Phone myPhone = new Phone("+57369874512", 6, "56") {
            @Override
            public void firmware() {
                System.out.println("Unknown firmware");
            }
        };

        checkQualityService.check(myPhone);

    }
}
