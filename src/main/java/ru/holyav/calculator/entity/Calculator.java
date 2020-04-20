package ru.holyav.calculator.entity;




public class Calculator {


    private long sumMeters;

    private long costSquareMeter;

    private long sumTaxes;

    private long checkBox;

    private long remainsTenRate;

    private long remainsFiveRate;

    private long remainsTwentyRate;

    private long finishSum;

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

    public long getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(long checkBox) {
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

    public long getFinishSum() {
        return finishSum;
    }

    public void setFinishSum(long finishSum) {
        this.finishSum = finishSum;
    }

    public Calculator() {

    }

    public Calculator(long sumMeters, long costSquareMeter, long sumTaxes, long checkBox, long remainsTenRate,
                      long remainsFiveRate, long remainsTwentyRate, long finishSum) {
        this.sumMeters = sumMeters;
        this.costSquareMeter = costSquareMeter;
        this.sumTaxes = sumTaxes;
        this.checkBox = checkBox;
        this.remainsTenRate = remainsTenRate;
        this.remainsFiveRate = remainsFiveRate;
        this.remainsTwentyRate = remainsTwentyRate;
        this.finishSum = finishSum;
    }
}
