package com.njyb.gbdbase.model.datasearch.colombia;
import java.io.Serializable;

@SuppressWarnings("serial")
public class ColombiaExportModel implements Serializable {

	/**
	 * 主键编号
	 */
	private Integer colombiaExportId;

	/**
	 * 日期
	 */
	private String date;

	/**
	 * 日
	 */
	private String day;

	/**
	 * 月
	 */
	private String month;

	/**
	 * 年
	 */
	private String year;

	/**
	 * 编号
	 */
	private String controlId;

	/**
	 * 海关城市
	 */
	private String customs;

	/**
	 * 出口商编号
	 */
	private String exporterId;

	/**
	 * 出口商
	 */
	private String exporter;

	/**
	 * 出口商地址(小范围)
	 */
	private String exporterAddress;

	/**
	 * 出口商地址(大范围:省)
	 */
	private String exporterDepartment;

	/**
	 * 海关编码
	 */
	private String hscode;
	
	/**
	 * 产品描述
	 */
	private String goodsDesc;

	/**
	 * 目的国
	 */
	private String destCountry;

	/**
	 * 运输方式
	 */
	private String transType;

	/**
	 * 支付方式
	 */
	private String payment;

	/**
	 * 净重
	 */
	private Double netWeight;

	/**
	 * 数量
	 */
	private Double quantity;

	/**
	 * 数量单位(UNIT_OF_QUANTITY)
	 */
	private String quantityUnit;

	/**
	 * FOB总价
	 */
	private Double fobValue;

	/**
	 * 运费
	 */
	private Double freight;

	/**
	 * 保险费
	 */
	private Double insurance;

	/**
	 * 进口商
	 */
	private String importer;

	/**
	 * 进口商地址
	 */
	private String importerAddress;

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	private Double num = 1.0;

	public Integer getColombiaExportId() {
		return colombiaExportId;
	}

	public void setColombiaExportId(Integer colombiaExportId) {
		this.colombiaExportId = colombiaExportId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getControlId() {
		return controlId;
	}

	public void setControlId(String controlId) {
		this.controlId = controlId;
	}

	public String getCustoms() {
		return customs;
	}

	public void setCustoms(String customs) {
		this.customs = customs;
	}

	public String getExporterId() {
		return exporterId;
	}

	public void setExporterId(String exporterId) {
		this.exporterId = exporterId;
	}

	public String getExporter() {
		return exporter;
	}

	public void setExporter(String exporter) {
		this.exporter = exporter;
	}

	public String getExporterAddress() {
		return exporterAddress;
	}

	public void setExporterAddress(String exporterAddress) {
		this.exporterAddress = exporterAddress;
	}

	public String getExporterDepartment() {
		return exporterDepartment;
	}

	public void setExporterDepartment(String exporterDepartment) {
		this.exporterDepartment = exporterDepartment;
	}

	public String getHscode() {
		return hscode;
	}

	public void setHscode(String hscode) {
		this.hscode = hscode;
	}

	public String getDestCountry() {
		return destCountry;
	}

	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Double getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(Double netWeight) {
		this.netWeight = netWeight;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public Double getFobValue() {
		return fobValue;
	}

	public void setFobValue(Double fobValue) {
		this.fobValue = fobValue;
	}

	public Double getFreight() {
		return freight;
	}

	public void setFreight(Double freight) {
		this.freight = freight;
	}

	public Double getInsurance() {
		return insurance;
	}

	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}

	public String getImporter() {
		return importer;
	}

	public void setImporter(String importer) {
		this.importer = importer;
	}

	public String getImporterAddress() {
		return importerAddress;
	}

	public void setImporterAddress(String importerAddress) {
		this.importerAddress = importerAddress;
	}

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}
}

