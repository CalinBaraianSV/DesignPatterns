package com.workshop.DesignPatterns.creational.buider.example1;


public class FinancialReport {

    private String title;
    private String content;
    private String revenue;
    private String expenses;
    private String summary;

    private FinancialReport(FinancialReportBuilder financialReportBuilder) {
        this.title = financialReportBuilder.title;
        this.content = financialReportBuilder.content;
        this.revenue = financialReportBuilder.revenue;
        this.expenses = financialReportBuilder.expenses;
        this.summary = financialReportBuilder.summary;
    }

    public static FinancialReportBuilder builder() {
        return new FinancialReportBuilder();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getRevenue() {
        return revenue;
    }

    public String getExpenses() {
        return expenses;
    }

    public String getSummary() {
        return summary;
    }

    public static class FinancialReportBuilder {
        private String title;
        private String content;
        private String revenue;
        private String expenses;
        private String summary;

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
        public FinancialReportBuilder revenue(final String revenue) {
            this.revenue = revenue;
            return this;
        }
        public FinancialReportBuilder expenses(final String expenses) {
            this.expenses = expenses;
            return this;
        }
        public FinancialReportBuilder summary(final String summary) {
            this.summary = summary;
            return this;
        }

        public FinancialReport build() {
            return new FinancialReport(this);
        }

        }

    @Override
    public String toString() {
        return "FinancialReport{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", revenue='" + revenue + '\'' +
                ", expenses='" + expenses + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}


