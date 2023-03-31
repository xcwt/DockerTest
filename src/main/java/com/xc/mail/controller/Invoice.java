package com.xc.mail.controller;

import java.math.BigDecimal;
import java.util.List;

public class Invoice {

    /**
     * 发票名称-河北增值税电子普通发票
     */
    private String title;
    /**
     * 机器编号
     */
    private String machineNumber;
    /**
     * 发票代码
     */
    private String code;
    /**
     * 发票号码
     */
    private String number;
    /**
     * 开票日期
     */
    private String date;
    /**
     *校验码
     */
    private String checksum;
    /**
     * 购买方-公司名-上海剑阁信息技术有限公司
     */
    private String buyerName;
    /**
     *购买方-税号
     */
    private String buyerCode;
    /**
     * 购买方-地址，电话
     */
    private String buyerAddress;
    /**
     * 购买方-开户行及账号
     */
    private String buyerAccount;
    /**
     * 密码区
     */
    private String password;
    /**
     * 金额  税额
     */
    private String amount;
    /**
     * 免税额
     */
    private String taxAmount;
    /**
     * 价税合计-大写
     */
    private String totalAmountString;
    /**
     * 价税合计
     */
    private String totalAmount;
    /**
     * 销售方名称
     */
    private String sellerName;
    /**
     * 销售方纳税人识别号
     */
    private String sellerCode;
    /**
     * 销售方地址，电话
     */
    private String sellerAddress;
    /**
     * 销售方开户行及账号
     */
    private String sellerAccount;
    /**
     * 收款人
     */
    private String payee;
    /**
     * 复核
     */
    private String reviewer;
    /**
     * 开票人
     */
    private String drawer;
    /**
     * 发票类型
     */
    private String type;
    /**
     * 备注区
     */
    private String remarks;

    private List<Detail> detailList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerCode() {
        return buyerCode;
    }

    public void setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTotalAmountString() {
        return totalAmountString;
    }

    public void setTotalAmountString(String totalAmountString) {
        this.totalAmountString = totalAmountString;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public String getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getDrawer() {
        return drawer;
    }

    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<Detail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Detail> detailList) {
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "title='" + title + '\'' +
                ", machineNumber='" + machineNumber + '\'' +
                ", code='" + code + '\'' +
                ", number='" + number + '\'' +
                ", date='" + date + '\'' +
                ", checksum='" + checksum + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", buyerCode='" + buyerCode + '\'' +
                ", buyerAddress='" + buyerAddress + '\'' +
                ", buyerAccount='" + buyerAccount + '\'' +
                ", password='" + password + '\'' +
                ", amount='" + amount + '\'' +
                ", taxAmount='" + taxAmount + '\'' +
                ", totalAmountString='" + totalAmountString + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", sellerCode='" + sellerCode + '\'' +
                ", sellerAddress='" + sellerAddress + '\'' +
                ", sellerAccount='" + sellerAccount + '\'' +
                ", payee='" + payee + '\'' +
                ", reviewer='" + reviewer + '\'' +
                ", drawer='" + drawer + '\'' +
                ", type='" + type + '\'' +
                ", remarks='" + remarks + '\'' +
                ", detailList=" + detailList +
                '}';
    }
}
