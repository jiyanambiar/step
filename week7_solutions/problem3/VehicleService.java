package problem3;

public final class VehicleService {
    private VehicleService() { }

    public static String getInsuranceIfApplicable(ServiceableVehicle vehicle) {
        if (vehicle instanceof Insurable) {
            Insurable insurable = (Insurable) vehicle;
            return insurable.getInsuranceInfo();
        }
        return "No insurance record exists.";
    }
}
