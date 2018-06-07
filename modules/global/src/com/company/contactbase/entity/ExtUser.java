package com.company.contactbase.entity;

import javax.persistence.Entity;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.core.entity.annotation.Extends;

@Extends(User.class)
@Entity(name = "contactbase$ExtUser")
public class ExtUser extends User {
    private static final long serialVersionUID = -6361982969297429959L;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "extUser")
    protected List<RegionPeriod> regions;

    public void setRegions(List<RegionPeriod> regions) {
        this.regions = regions;
    }

    public List<RegionPeriod> getRegions() {
        return regions;
    }


}