package com.workshop.DesignPatterns.creational.buider.example1;


public class FinancialReport {

    private String title;
    private String content;

    private FinancialReport(FinancialReportBuilder financialReportBuilder) {
        this.title = financialReportBuilder.title;
        this.content = financialReportBuilder.content;
    }

    public static FinancialReportBuilder builder() {
        return new FinancialReportBuilder();
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public static class FinancialReportBuilder {
        private String title;
        private String content;

        FinancialReportBuilder() {
        }

        public FinancialReportBuilder title(final String title) {
            this.title = title;
            return this;
        }

        public FinancialReportBuilder content(final String content) {
            this.content = content;
            return this;
        }

        public FinancialReport build() {
            return new FinancialReport(this);
        }

        public String toString() {
            return "FinancialReport.FinancialReportBuilder(title=" + this.title + ", content=" + this.content + ")";
        }
    }

}
