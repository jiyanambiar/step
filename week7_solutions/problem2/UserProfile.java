package problem2;

public class UserProfile implements Exportable {
    private final String username;

    public UserProfile(String username) {
        this.username = username;
    }

    @Override
    public String exportData() {
        ExportManager.recordExport();
        return "Exported profile: " + username;
    }

    public static int getTotalExports() {
        return ExportManager.getTotalExports();
    }
}
