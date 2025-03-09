package patterns.adapter;

public class SDCardToUSBAdapter implements USB {
    private SDCard sdCard;
    public SDCardToUSBAdapter(SDCard sdCard) {
        this.sdCard = sdCard;
    }
    @Override
    public void connectWithUsbCable() {
        System.out.println("SD-card connected by USB");
        sdCard.insert();
        sdCard.readData();
    }
}
