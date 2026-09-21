package problem5;

public abstract class HomeDevice {
    private static int nextSerialNumber = 1001;
    private final String serialNumber;

    protected HomeDevice() {
        serialNumber = "HD-" + nextSerialNumber++;
    }

    public abstract String activate();

    public String getSerialNumber() {
        return serialNumber;
    }
}
