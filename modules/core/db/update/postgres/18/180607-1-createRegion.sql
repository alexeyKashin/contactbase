create table CONTACTBASE_REGION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CODE varchar(255),
    PRICE_PER_DAY decimal(19, 2),
    PRICE_PER_WEEK decimal(19, 2),
    PRICE_PER_MONTH decimal(19, 2),
    PRICE_PER_YEAR decimal(19, 2),
    --
    primary key (ID)
);
