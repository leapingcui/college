package com.qijun.goods.goodstype.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 具体的物品类（是设备，试剂，耗材，标准件中的一个）
 */
public class Goods {

    private Long gsId;                      //物品编号，流水号

//    private Long gsTypeId;                  //物品种类编号，指向goods_common的gc_type_id
    private GoodsCommon goodsCommon;        //在表中字段gs_type_id
                                            //在表goods中通过gs_type_id,指向goods_common的gc_type_id

    private String gsTrueId;                //物品id
    private String gsSpeci;                 //物品规格specification

    private Float gsTotalQuantity ;          //总数量
    private Float gsLeftQuantity;           //剩余数量
    private String gsBatchNum;              //批次号

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date gsProduceDate;             //生产日期

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date gsBuyDate;                 //购买日期

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date gsCheckDate;               //验收日期
    private Float gsPurchasePrice;          //购买价
    private Float gsDepreciationPrice;      //折旧价
    private String gsManufacturer;          //制造商
    private String gsSupplier;              //供应商
    private String gsDepartment;            //所属部门，指向部门表
    private String gsReceivePersonId;       //领用人编号，指向员工表

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date gsReceiveDate;             //领用日期
    private String gsAdminId;               //管理人编号，指向员工表
    private Integer gsCalibrationCycle;         //校准周期
    private String gsWarrantyPeriod;        //保修期，比如一年
    private String gsStorePosition;         //保存位置

    public Goods(){}

    public Long getGsId() {
        return gsId;
    }

    public void setGsId(Long gsId) {
        this.gsId = gsId;
    }

    public GoodsCommon getGoodsCommon() {
        return goodsCommon;
    }

    public void setGoodsCommon(GoodsCommon goodsCommon) {
        this.goodsCommon = goodsCommon;
    }

    public String getGsTrueId() {
        return gsTrueId;
    }

    public void setGsTrueId(String gsTrueId) {
        this.gsTrueId = gsTrueId;
    }

    public String getGsSpeci() {
        return gsSpeci;
    }

    public void setGsSpeci(String gsSpeci) {
        this.gsSpeci = gsSpeci;
    }

    public Float getGsTotalQuantity() {
        return gsTotalQuantity;
    }

    public void setGsTotalQuantity(Float gsTotalQuantity) {
        this.gsTotalQuantity = gsTotalQuantity;
    }

    public Float getGsLeftQuantity() {
        return gsLeftQuantity;
    }

    public void setGsLeftQuantity(Float gsLeftQuantity) {
        this.gsLeftQuantity = gsLeftQuantity;
    }

    public String getGsBatchNum() {
        return gsBatchNum;
    }

    public void setGsBatchNum(String gsBatchNum) {
        this.gsBatchNum = gsBatchNum;
    }

    public Date getGsProduceDate() {
        return gsProduceDate;
    }

    public void setGsProduceDate(Date gsProduceDate) {
        this.gsProduceDate = gsProduceDate;
    }

    public Date getGsBuyDate() {
        return gsBuyDate;
    }

    public void setGsBuyDate(Date gsBuyDate) {
        this.gsBuyDate = gsBuyDate;
    }

    public Date getGsCheckDate() {
        return gsCheckDate;
    }

    public void setGsCheckDate(Date gsCheckDate) {
        this.gsCheckDate = gsCheckDate;
    }

    public Float getGsPurchasePrice() {
        return gsPurchasePrice;
    }

    public void setGsPurchasePrice(Float gsPurchasePrice) {
        this.gsPurchasePrice = gsPurchasePrice;
    }

    public Float getGsDepreciationPrice() {
        return gsDepreciationPrice;
    }

    public void setGsDepreciationPrice(Float gsDepreciationPrice) {
        this.gsDepreciationPrice = gsDepreciationPrice;
    }

    public String getGsManufacturer() {
        return gsManufacturer;
    }

    public void setGsManufacturer(String gsManufacturer) {
        this.gsManufacturer = gsManufacturer;
    }

    public String getGsSupplier() {
        return gsSupplier;
    }

    public void setGsSupplier(String gsSupplier) {
        this.gsSupplier = gsSupplier;
    }

    public String getGsDepartment() {
        return gsDepartment;
    }

    public void setGsDepartment(String gsDepartment) {
        this.gsDepartment = gsDepartment;
    }

    public String getGsReceivePersonId() {
        return gsReceivePersonId;
    }

    public void setGsReceivePersonId(String gsReceivePersonId) {
        this.gsReceivePersonId = gsReceivePersonId;
    }

    public Date getGsReceiveDate() {
        return gsReceiveDate;
    }

    public void setGsReceiveDate(Date gsReceiveDate) {
        this.gsReceiveDate = gsReceiveDate;
    }

    public String getGsAdminId() {
        return gsAdminId;
    }

    public void setGsAdminId(String gsAdminId) {
        this.gsAdminId = gsAdminId;
    }

    public Integer getGsCalibrationCycle() {
        return gsCalibrationCycle;
    }

    public void setGsCalibrationCycle(Integer gsCalibrationCycle) {
        this.gsCalibrationCycle = gsCalibrationCycle;
    }

    public String getGsWarrantyPeriod() {
        return gsWarrantyPeriod;
    }

    public void setGsWarrantyPeriod(String gsWarrantyPeriod) {
        this.gsWarrantyPeriod = gsWarrantyPeriod;
    }

    public String getGsStorePosition() {
        return gsStorePosition;
    }

    public void setGsStorePosition(String gsStorePosition) {
        this.gsStorePosition = gsStorePosition;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gsId=" + gsId +
                ", goodsCommon=" + goodsCommon +
                ", gsTrueId='" + gsTrueId + '\'' +
                ", gsSpeci='" + gsSpeci + '\'' +
                ", gsTotalQuantity=" + gsTotalQuantity +
                ", gsLeftQuantity=" + gsLeftQuantity +
                ", gsBatchNum='" + gsBatchNum + '\'' +
                ", gsProduceDate=" + gsProduceDate +
                ", gsBuyDate=" + gsBuyDate +
                ", gsCheckDate=" + gsCheckDate +
                ", gsPurchasePrice=" + gsPurchasePrice +
                ", gsDepreciationPrice=" + gsDepreciationPrice +
                ", gsManufacturer='" + gsManufacturer + '\'' +
                ", gsSupplier='" + gsSupplier + '\'' +
                ", gsDepartment='" + gsDepartment + '\'' +
                ", gsReceivePersonId='" + gsReceivePersonId + '\'' +
                ", gsReceiveDate=" + gsReceiveDate +
                ", gsAdminId='" + gsAdminId + '\'' +
                ", gsCalibrationCycle=" + gsCalibrationCycle +
                ", gsWarrantyPeriod='" + gsWarrantyPeriod + '\'' +
                ", gsStorePosition='" + gsStorePosition + '\'' +
                '}';
    }
}
