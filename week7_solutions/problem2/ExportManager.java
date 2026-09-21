package problem2;

public final class ExportManager {
    private static int totalExports;

    private ExportManager() { }

    static void recordExport() {
        totalExports++;
    }

    public static int getTotalExports() {
        return totalExports;
    }

    public static void exportAll(Exportable[] items) {
        for (Exportable item : items) {
            System.out.println(item.exportData());
        }
    }
}
