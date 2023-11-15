package com.workshop.DesignPatterns.creational.buider.example1;

public abstract class FinancialReport {

    private String title;
    private String content;

    protected FinancialReport(Builder<?> builder) {
        this.title = builder.title;
        this.content = builder.content;
    }

    public static Builder<?> builder() {
        throw new UnsupportedOperationException("Builder must be implemented in subclasses");
    }

    public static abstract class Builder<T extends Builder<T>> {
        private String title;
        private String content;

        public T title(String title) {
            this.title = title;
            return self();
        }

        public T content(String content) {
            this.content = content;
            return self();
        }

        protected abstract T self();

        public abstract FinancialReport build();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
