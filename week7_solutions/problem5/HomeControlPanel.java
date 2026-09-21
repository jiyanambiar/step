package problem5;

public final class HomeControlPanel {
    private HomeControlPanel() { }

    public static void connectAll(RemoteControllable[] items, String appId) {
        for (RemoteControllable item : items) {
            System.out.println(item.connect(appId));
        }
    }

    public static double getConsumptionIfTrackable(HomeDevice device) {
        if (device instanceof EnergyTrackable) {
            EnergyTrackable trackable = (EnergyTrackable) device;
            return trackable.getConsumptionWatts();
        }
        return -1.0; // indicates that this HomeDevice does not track energy
    }
}
