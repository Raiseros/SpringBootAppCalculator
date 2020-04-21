package ru.holyav.calculator.entity;




public class Calculator {


    private long sumMeters;

    private long costSquareMeter;

    private long sumTaxes;

    private boolean checkBox;

    private long sumAfterCheckBox;

    private long remainsTenRate;

    private long remainsFiveRate;

    private long remainsTwentyRate;

    private long remainsThirtyRate;

    public long getSumAfterCheckBox() {
        return sumAfterCheckBox;
    }

    public void setSumAfterCheckBox(long sumAfterCheckBox) {
        this.sumAfterCheckBox = sumAfterCheckBox;
    }

    public long getSumMeters() {
        return sumMeters;
    }

    public void setSumMeters(long sumMeters) {
        this.sumMeters = sumMeters;
    }

    public long getCostSquareMeter() {
        return costSquareMeter;
    }

    public void setCostSquareMeter(long costSquareMeter) {
        this.costSquareMeter = costSquareMeter;
    }

    public long getSumTaxes() {
        return sumTaxes;
    }

    public void setSumTaxes(long sumTaxes) {
        this.sumTaxes = sumTaxes;
    }

    public boolean isCheckBox() {
        return checkBox;
    }

    public void setCheckBox(boolean checkBox) {
        this.checkBox = checkBox;
    }

    public long getRemainsTenRate() {
        return remainsTenRate;
    }

    public void setRemainsTenRate(long remainsTenRate) {
        this.remainsTenRate = remainsTenRate;
    }

    public long getRemainsFiveRate() {
        return remainsFiveRate;
    }

    public void setRemainsFiveRate(long remainsFiveRate) {
        this.remainsFiveRate = remainsFiveRate;
    }

    public long getRemainsTwentyRate() {
        return remainsTwentyRate;
    }

    public void setRemainsTwentyRate(long remainsTwentyRate) {
        this.remainsTwentyRate = remainsTwentyRate;
    }

    public long getRemainsThirtyRate() {
        return remainsThirtyRate;
    }

    public void setRemainsThirtyRate(long remainsThirtyRate) {
        this.remainsThirtyRate = remainsThirtyRate;
    }

    public Calculator() {

    }

    public Calculator(long sumMeters, long costSquareMeter, long sumTaxes, boolean checkBox, long sumAfterCheckBox,
                      long remainsTenRate, long remainsFiveRate, long remainsTwentyRate, long remainsThirtyRate) {
        this.sumMeters = sumMeters;
        this.costSquareMeter = costSquareMeter;
        this.sumTaxes = sumTaxes;
        this.checkBox = checkBox;
        this.sumAfterCheckBox = sumAfterCheckBox;
        this.remainsTenRate = remainsTenRate;
        this.remainsFiveRate = remainsFiveRate;
        this.remainsTwentyRate = remainsTwentyRate;
        this.remainsThirtyRate = remainsThirtyRate;
    }
}
