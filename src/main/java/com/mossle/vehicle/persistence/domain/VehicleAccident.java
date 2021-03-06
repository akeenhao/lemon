package com.mossle.vehicle.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VehicleAccident 车辆事故.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "VEHICLE_ACCIDENT")
public class VehicleAccident implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** 主键. */
    private Long id;

    /** null. */
    private VehicleInfo vehicleInfo;

    /** null. */
    private VehicleDriver vehicleDriver;

    /** 事故时间. */
    private Date createTime;

    /** 事故地点. */
    private String location;

    /** 事故确认人. */
    private String confirmer;

    /** 保险理赔金额. */
    private Integer price;

    /** 对方姓名. */
    private String otherName;

    /** 对方住址. */
    private String otherAddress;

    /** 对方电话. */
    private String otherMobile;

    /** 公司暂付金额. */
    private Integer companyPrice;

    /** 本人负担金额. */
    private Integer personPrice;

    /** 对方车牌号码. */
    private String otherCode;

    /** 事故概要. */
    private String summary;

    /** 和解内容. */
    private String reconciliation;

    /** 状态. */
    private String status;

    /** 备注. */
    private String description;

    /** 租户. */
    private String tenantId;

    public VehicleAccident() {
    }

    public VehicleAccident(Long id) {
        this.id = id;
    }

    public VehicleAccident(Long id, VehicleInfo vehicleInfo,
            VehicleDriver vehicleDriver, Date createTime, String location,
            String confirmer, Integer price, String otherName,
            String otherAddress, String otherMobile, Integer companyPrice,
            Integer personPrice, String otherCode, String summary,
            String reconciliation, String status, String description,
            String tenantId) {
        this.id = id;
        this.vehicleInfo = vehicleInfo;
        this.vehicleDriver = vehicleDriver;
        this.createTime = createTime;
        this.location = location;
        this.confirmer = confirmer;
        this.price = price;
        this.otherName = otherName;
        this.otherAddress = otherAddress;
        this.otherMobile = otherMobile;
        this.companyPrice = companyPrice;
        this.personPrice = personPrice;
        this.otherCode = otherCode;
        this.summary = summary;
        this.reconciliation = reconciliation;
        this.status = status;
        this.description = description;
        this.tenantId = tenantId;
    }

    /** @return 主键. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            主键.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INFO_ID")
    public VehicleInfo getVehicleInfo() {
        return this.vehicleInfo;
    }

    /**
     * @param vehicleInfo
     *            null.
     */
    public void setVehicleInfo(VehicleInfo vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DRIVER_ID")
    public VehicleDriver getVehicleDriver() {
        return this.vehicleDriver;
    }

    /**
     * @param vehicleDriver
     *            null.
     */
    public void setVehicleDriver(VehicleDriver vehicleDriver) {
        this.vehicleDriver = vehicleDriver;
    }

    /** @return 事故时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            事故时间.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return 事故地点. */
    @Column(name = "LOCATION", length = 200)
    public String getLocation() {
        return this.location;
    }

    /**
     * @param location
     *            事故地点.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /** @return 事故确认人. */
    @Column(name = "CONFIRMER", length = 50)
    public String getConfirmer() {
        return this.confirmer;
    }

    /**
     * @param confirmer
     *            事故确认人.
     */
    public void setConfirmer(String confirmer) {
        this.confirmer = confirmer;
    }

    /** @return 保险理赔金额. */
    @Column(name = "PRICE")
    public Integer getPrice() {
        return this.price;
    }

    /**
     * @param price
     *            保险理赔金额.
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /** @return 对方姓名. */
    @Column(name = "OTHER_NAME", length = 50)
    public String getOtherName() {
        return this.otherName;
    }

    /**
     * @param otherName
     *            对方姓名.
     */
    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    /** @return 对方住址. */
    @Column(name = "OTHER_ADDRESS", length = 200)
    public String getOtherAddress() {
        return this.otherAddress;
    }

    /**
     * @param otherAddress
     *            对方住址.
     */
    public void setOtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
    }

    /** @return 对方电话. */
    @Column(name = "OTHER_MOBILE", length = 50)
    public String getOtherMobile() {
        return this.otherMobile;
    }

    /**
     * @param otherMobile
     *            对方电话.
     */
    public void setOtherMobile(String otherMobile) {
        this.otherMobile = otherMobile;
    }

    /** @return 公司暂付金额. */
    @Column(name = "COMPANY_PRICE")
    public Integer getCompanyPrice() {
        return this.companyPrice;
    }

    /**
     * @param companyPrice
     *            公司暂付金额.
     */
    public void setCompanyPrice(Integer companyPrice) {
        this.companyPrice = companyPrice;
    }

    /** @return 本人负担金额. */
    @Column(name = "PERSON_PRICE")
    public Integer getPersonPrice() {
        return this.personPrice;
    }

    /**
     * @param personPrice
     *            本人负担金额.
     */
    public void setPersonPrice(Integer personPrice) {
        this.personPrice = personPrice;
    }

    /** @return 对方车牌号码. */
    @Column(name = "OTHER_CODE", length = 50)
    public String getOtherCode() {
        return this.otherCode;
    }

    /**
     * @param otherCode
     *            对方车牌号码.
     */
    public void setOtherCode(String otherCode) {
        this.otherCode = otherCode;
    }

    /** @return 事故概要. */
    @Column(name = "SUMMARY", length = 200)
    public String getSummary() {
        return this.summary;
    }

    /**
     * @param summary
     *            事故概要.
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /** @return 和解内容. */
    @Column(name = "RECONCILIATION", length = 200)
    public String getReconciliation() {
        return this.reconciliation;
    }

    /**
     * @param reconciliation
     *            和解内容.
     */
    public void setReconciliation(String reconciliation) {
        this.reconciliation = reconciliation;
    }

    /** @return 状态. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            状态.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return 备注. */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            备注.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return 租户. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            租户.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
