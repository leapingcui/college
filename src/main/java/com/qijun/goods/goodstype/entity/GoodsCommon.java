package com.qijun.goods.goodstype.entity;

/**
 * 物品总类，（总表），包括设备，试剂，耗材，标准件
 */
public class GoodsCommon {

    private Long gcTypeId;                          //物品种类编号
    private String gcName;                          //物品名称
    private String gcHeadType;                      //物品大类，如设备、试剂、耗材、标准件
    private String gcType;                          //物品类型
    private String gcCountingUnit;                  //物品计数单位
    private String gcIsIntCounting;                 //物品是否是整数计数
    private Float gcStockQuantity;                  //物品库存数量
    private Float gcWarnStockQuantity;               //物品警戒库存数量
    private Float gcHistoryReceiveNum;              //物品历史领用数量

    public GoodsCommon(){}

    public Long getGcTypeId() {
        return gcTypeId;
    }

    public void setGcTypeId(Long gcTypeId) {
        this.gcTypeId = gcTypeId;
    }

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName;
    }

    public String getGcHeadType() {
        return gcHeadType;
    }

    public void setGcHeadType(String gcHeadType) {
        this.gcHeadType = gcHeadType;
    }

    public String getGcType() {
        return gcType;
    }

    public void setGcType(String gcType) {
        this.gcType = gcType;
    }

    public String getGcCountingUnit() {
        return gcCountingUnit;
    }

    public void setGcCountingUnit(String gcCountingUnit) {
        this.gcCountingUnit = gcCountingUnit;
    }

    public String getGcIsIntCounting() {
        return gcIsIntCounting;
    }

    public void setGcIsIntCounting(String gcIsIntCounting) {
        this.gcIsIntCounting = gcIsIntCounting;
    }

    public Float getGcStockQuantity() {
        return gcStockQuantity;
    }

    public void setGcStockQuantity(Float gcStockQuantity) {
        this.gcStockQuantity = gcStockQuantity;
    }

    public Float getGcWarnStockQuantity() {
        return gcWarnStockQuantity;
    }

    public void setGcWarnStockQuantity(Float gcWarnStockQuantity) {
        this.gcWarnStockQuantity = gcWarnStockQuantity;
    }

    public Float getGcHistoryReceiveNum() {
        return gcHistoryReceiveNum;
    }

    public void setGcHistoryReceiveNum(Float gcHistoryReceiveNum) {
        this.gcHistoryReceiveNum = gcHistoryReceiveNum;
    }

    @Override
    public String toString() {
        return "GoodsCommon{" +
                "gcTypeId=" + gcTypeId +
                ", gcName='" + gcName + '\'' +
                ", gcHeadType='" + gcHeadType + '\'' +
                ", gcType='" + gcType + '\'' +
                ", gcCountingUnit='" + gcCountingUnit + '\'' +
                ", gcIsIntCounting='" + gcIsIntCounting + '\'' +
                ", gcStockQuantity=" + gcStockQuantity +
                ", gcWarnStockQuantity=" + gcWarnStockQuantity +
                ", gcHistoryReceiveNum=" + gcHistoryReceiveNum +
                '}';
    }
}
