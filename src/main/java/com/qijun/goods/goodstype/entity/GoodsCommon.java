package com.qijun.goods.goodstype.entity;

/**
 * 物品总类，（总表），包括设备，试剂，耗材，标准件
 */
public class GoodsCommon {

    private long gcTypeId;                          //物品种类编号
    private String gcName;                          //物品名称
    private String gcHeadType;                      //物品大类，如设备、试剂、耗材、标准件
    private String gcType;                          //物品类型
    private String gcCountingUnit;                  //物品计数单位
    private String gcIsIntCounting;                 //物品是否是整数计数
    private float gcStockQuantity;                  //物品库存数量
    private float gcWarnStockQuantity;               //物品警戒库存数量
    private float gcHistoryReceiveNum;              //物品历史领用数量

    public GoodsCommon(){}

    public GoodsCommon(long gcTypeId, String gcName, String gcHeadType, String gcType, String gcCountingUnit,
                       String gcIsIntCounting, float gcStockQuantity, float gcWarnStockQuantity, float gcHistoryReceiveNum) {
        this.gcTypeId = gcTypeId;
        this.gcName = gcName;
        this.gcHeadType = gcHeadType;
        this.gcType = gcType;
        this.gcCountingUnit = gcCountingUnit;
        this.gcIsIntCounting = gcIsIntCounting;
        this.gcStockQuantity = gcStockQuantity;
        this.gcWarnStockQuantity = gcWarnStockQuantity;
        this.gcHistoryReceiveNum = gcHistoryReceiveNum;
    }

    public long getGcTypeId() {
        return gcTypeId;
    }

    public void setGcTypeId(long gcTypeId) {
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

    public float getGcStockQuantity() {
        return gcStockQuantity;
    }

    public void setGcStockQuantity(float gcStockQuantity) {
        this.gcStockQuantity = gcStockQuantity;
    }

    public float getGcWarnStockQuantity() {
        return gcWarnStockQuantity;
    }

    public void setGcWarnStockQuantity(float gcWarnStockQuantity) {
        this.gcWarnStockQuantity = gcWarnStockQuantity;
    }

    public float getGcHistoryReceiveNum() {
        return gcHistoryReceiveNum;
    }

    public void setGcHistoryReceiveNum(float gcHistoryReceiveNum) {
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
