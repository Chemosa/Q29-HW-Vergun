package tms.lesson8.services.impl;

import tms.lesson8.domain.Phone;
import tms.lesson8.services.CheckQualityService;

public class CheckQualityServiceImpl implements CheckQualityService {

    public void check (Phone phone) {

        phone.call(phone.getNumber());
        phone.play(phone.getVolume());
        phone.firmware();

        System.out.println("Phone is checked!");
        System.out.println("-----------------------------");

    }

    }

