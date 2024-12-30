package tms.lesson8.domain;

public abstract class Phone {

    private String number;
    private int volume;
    private String firmware;

    public Phone(String number, int volume, String firmware) {
        this.number = number;
        this.volume = volume;
        this.firmware = firmware;
    }

    public String getNumber() {
        return number;
    }

    public int getVolume() {
        return volume;
    }

    public String getFirmware() {
        return firmware;
    }

    public void call (String number) {
        System.out.println("Number " + number + " is calling:");
    }

    public void play (int volume) {
        if (volume == 0) {
            System.out.println("Need to re-repair or volume is off.");
        } else if (volume < 0 || volume > 10){
            System.out.println("Incorrect value of volume: check data again.");
        } else {
            System.out.println("La-la-la...");
        }
    }

    public abstract void firmware ();

}
