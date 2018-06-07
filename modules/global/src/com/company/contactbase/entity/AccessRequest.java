package com.company.contactbase.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@NamePattern("%s %s|name,surname")
@Table(name = "CONTACTBASE_ACCESS_REQUEST")
@Entity(name = "contactbase$AccessRequest")
public class AccessRequest extends StandardEntity {
    private static final long serialVersionUID = 598221065030551825L;

    @Column(name = "EMAIL")
    protected String email;

    @JoinTable(name = "CONTACTBASE_ACCESS_REQUEST_REGION_LINK",
        joinColumns = @JoinColumn(name = "ACCESS_REQUEST_ID"),
        inverseJoinColumns = @JoinColumn(name = "REGION_ID"))
    @ManyToMany
    protected List<Region> regions;

    @Column(name = "UNIT")
    protected Integer unit;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "SURNAME")
    protected String surname;

    @Column(name = "PERIOD")
    protected Integer period;

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public List<Region> getRegions() {
        return regions;
    }


    public void setUnit(Unit unit) {
        this.unit = unit == null ? null : unit.getId();
    }

    public Unit getUnit() {
        return unit == null ? null : Unit.fromId(unit);
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getPeriod() {
        return period;
    }


}