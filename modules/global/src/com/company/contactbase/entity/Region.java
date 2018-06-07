package com.company.contactbase.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|name")
@Table(name = "CONTACTBASE_REGION")
@Entity(name = "contactbase$Region")
public class Region extends StandardEntity {
    private static final long serialVersionUID = -7960857609686951504L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "CODE")
    protected String code;

    @Column(name = "PRICE_PER_DAY")
    protected BigDecimal pricePerDay;

    @Column(name = "PRICE_PER_WEEK")
    protected BigDecimal pricePerWeek;

    @Column(name = "PRICE_PER_MONTH")
    protected BigDecimal pricePerMonth;

    @Column(name = "PRICE_PER_YEAR")
    protected BigDecimal pricePerYear;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerWeek(BigDecimal pricePerWeek) {
        this.pricePerWeek = pricePerWeek;
    }

    public BigDecimal getPricePerWeek() {
        return pricePerWeek;
    }

    public void setPricePerMonth(BigDecimal pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    public BigDecimal getPricePerMonth() {
        return pricePerMonth;
    }

    public void setPricePerYear(BigDecimal pricePerYear) {
        this.pricePerYear = pricePerYear;
    }

    public BigDecimal getPricePerYear() {
        return pricePerYear;
    }


}