package com.company.contactbase.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "CONTACTBASE_REGION_PERIOD")
@Entity(name = "contactbase$RegionPeriod")
public class RegionPeriod extends StandardEntity {
    private static final long serialVersionUID = -2875314162190537912L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGION_ID")
    protected Region region;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_")
    protected Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXT_USER_ID")
    protected ExtUser extUser;

    public void setExtUser(ExtUser extUser) {
        this.extUser = extUser;
    }

    public ExtUser getExtUser() {
        return extUser;
    }


    public void setRegion(Region region) {
        this.region = region;
    }

    public Region getRegion() {
        return region;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }


}