-- begin CONTACTBASE_REGION
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
)^
-- end CONTACTBASE_REGION
-- begin CONTACTBASE_ACCESS_REQUEST
create table CONTACTBASE_ACCESS_REQUEST (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMAIL varchar(255),
    UNIT integer,
    NAME varchar(255),
    SURNAME varchar(255),
    PERIOD integer,
    --
    primary key (ID)
)^
-- end CONTACTBASE_ACCESS_REQUEST
-- begin CONTACTBASE_ACCESS_REQUEST_REGION_LINK
create table CONTACTBASE_ACCESS_REQUEST_REGION_LINK (
    ACCESS_REQUEST_ID uuid,
    REGION_ID uuid,
    primary key (ACCESS_REQUEST_ID, REGION_ID)
)^
-- end CONTACTBASE_ACCESS_REQUEST_REGION_LINK
