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
);
