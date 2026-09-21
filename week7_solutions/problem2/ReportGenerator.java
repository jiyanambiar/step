package problem2;

public class ReportGenerator implements Exportable {
    private final String reportName;

    public ReportGenerator(String reportName) {
        this.reportName = reportName;
    }

    @Override
    public String exportData() {
        ExportManager.recordExport();
        return "Exported report: " + reportName;
    }

    public static int getTotalExports() {
        return ExportManager.getTotalExports();
    }
}
