/**
 * 
 */
package com.topaiebiz.payment.order.moble.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.nebulapaas.data.mybatis.common.BaseBizEntity;

import java.util.Date;

/**  
 * Description： 店铺订单详情
 * 
 * 
 * Author hxpeng 
 *    
 * Date 2017年10月24日 下午5:09:00 
 * 
 * Copyright Cognieon technology group co.LTD. All rights reserved.
 * 
 * Notice 本内容仅限于授权后使用，禁止非授权传阅以及私自用于其他商业目的。
 */

@TableName("t_tsa_store_order_detail")
public class StoreOrderDetailEntity extends BaseBizEntity<Long> {

	private static final long serialVersionUID = -8740404629498831659L;

	/**
	 * 订单编号
	 */
	private Long orderId;
	
	/**
	 * 商品编码
	 */
	private Long goodsId;

	/**
	 * 商品名称
	 */
	private String name;

	/**
	 * 商品属性集合以键值对形式存放。key:value,key1:value1。
	 */
	private String fieldValue;

	/**
	 * 商品图片
	 */
	private String goodsImage;

	/**
	 * 商品原单价
	 */
	private double unitPrice;

	/**
	 * 商品数量
	 */
	private Long goodsNum;

	/**
	 * 商品原总价
	 */
	private double totalPrice;

	/**
	 * 所使用的营销活动
	 */
	private Long usedPromotion;

	/**
	 * 优惠金额
	 */
	private double deduction;

	/**
	 * 优惠后价格
	 */
	private double salePrice;

	/**
	 * 总运费
	 */
	private double totalFreight;

	/**
	 * 状态
	 */
	private Integer state;

	/**
	 * 物流类型
	 */
	private String logisticsType;

	/**
	 * 单种商品的物流编号，如果分批次发可记录多个 。
	 */
	private String logisticsNo;

	/**
	 * 备注
	 */
	private String memo;

	/** 发货时间 */
	private Date shipmentsTime;

	/** 收货时间 */
	private Date takeTime;

	/**
	 * 售后状态
	 */
	private Integer refundState;

	/**
	 * 是否已评论
	 */
	private Integer isComment;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Long getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Long goodsNum) {
		this.goodsNum = goodsNum;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Long getUsedPromotion() {
		return usedPromotion;
	}

	public void setUsedPromotion(Long usedPromotion) {
		this.usedPromotion = usedPromotion;
	}

	public double getDeduction() {
		return deduction;
	}

	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public double getTotalFreight() {
		return totalFreight;
	}

	public void setTotalFreight(double totalFreight) {
		this.totalFreight = totalFreight;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getLogisticsType() {
		return logisticsType;
	}

	public void setLogisticsType(String logisticsType) {
		this.logisticsType = logisticsType;
	}

	public String getLogisticsNo() {
		return logisticsNo;
	}

	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getShipmentsTime() {
		return shipmentsTime;
	}

	public void setShipmentsTime(Date shipmentsTime) {
		this.shipmentsTime = shipmentsTime;
	}

	public Date getTakeTime() {
		return takeTime;
	}

	public void setTakeTime(Date takeTime) {
		this.takeTime = takeTime;
	}

	public Integer getRefundState() {
		return refundState;
	}

	public void setRefundState(Integer refundState) {
		this.refundState = refundState;
	}

	public Integer getIsComment() {
		return isComment;
	}

	public void setIsComment(Integer isComment) {
		this.isComment = isComment;
	}
}
