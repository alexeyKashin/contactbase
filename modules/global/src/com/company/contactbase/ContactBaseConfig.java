package com.company.contactbase;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;

import java.math.BigDecimal;

@Source(type = SourceType.DATABASE)
public interface ContactBaseConfig extends Config {

    @Property("contactBase.general.pricePerDay")
    BigDecimal getPricePerDay();

    @Property("contactBase.general.pricePerWeek")
    BigDecimal getPricePerWeek();

    @Property("contactBase.general.pricePerMonth")
    BigDecimal getPricePerMonth();

    @Property("contactBase.general.pricePerYear")
    BigDecimal getPricePerYear();
}
