package com.xc.mail.controller;

/**
 * 商品详情
 */
public class Detail {

    /**
     * 货物或应税劳务、服务名称
     */
    private String name;
    /**
     * 规格，型号
     */
    private String model;
    /**
     * 单位
     */
    private String unit;
    /**
     * 数量
     */
    private String count;
    /**
     * 单价
     */
    private String price;
    /**
     * 金额
     */
    private String amount;
    /**
     * 税率
     */
    private String taxRate;
    /**
     * 税额
     */
    private String taxAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }


    @Override
    public String toString() {
        return "Detail{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", unit='" + unit + '\'' +
                ", count='" + count + '\'' +
                ", price='" + price + '\'' +
                ", amount='" + amount + '\'' +
                ", taxRate='" + taxRate + '\'' +
                ", taxAmount='" + taxAmount + '\'' +
                '}';
    }
}
