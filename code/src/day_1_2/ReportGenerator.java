package day_1_2;

public abstract class ReportGenerator {
    public final void generateReport(String title, String data) {
        System.out.println("=== " + title.toUpperCase() + " ===");
        writeBody(data);
        System.out.println("Report generated successfully.\n");
    }

    protected abstract void writeBody(String data);
}

 class PDFReportGenerator extends ReportGenerator {
    @Override
    protected void writeBody(String data) {
        System.out.println("Formatting content for PDF output...");
        System.out.println("Data: " + data);
    }
}
