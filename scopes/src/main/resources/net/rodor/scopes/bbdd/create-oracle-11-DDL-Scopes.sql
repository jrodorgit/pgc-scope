CREATE TABLE ZZScopes(
app VARCHAR2(20) NOT NULL ,
parentcode VARCHAR2(20) NULL ,
code VARCHAR2(20) NOT NULL ,
description VARCHAR2(80) NOT NULL ,
descriptionXL VARCHAR2(256) NOT NULL ,
descriptionXS VARCHAR2(30) NOT NULL ,
startdate TIMESTAMP NOT NULL ,
enddate TIMESTAMP NOT NULL 
) 
LOGGING;
COMMENT ON TABLE ZZScopes IS 'Ambitos';
COMMENT ON COLUMN ZZScopes.app IS 'Aplicacion a la que pertenece el ambito';
COMMENT ON COLUMN ZZScopes.code IS 'Codigo ambito';
COMMENT ON COLUMN ZZScopes.parentcode IS 'Codigo del ambito padre';
COMMENT ON COLUMN ZZScopes.description IS 'Descripcion del ambito';
COMMENT ON COLUMN ZZScopes.descriptionXL IS 'Descripcion larga del ambito';
COMMENT ON COLUMN ZZScopes.descriptionXS IS 'Descripcion corta del ambito';
COMMENT ON COLUMN ZZScopes.startdate IS 'fecha de inicio de validez del ambito';
COMMENT ON COLUMN ZZScopes.enddate IS 'fecha de fin de validez del ambito';


--REM INSERTING into ZZScopes
Insert into ZZScopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL',null,'001','AMBITO RAIZ','AMBITO RAIZ','AMBITO RAIZ',to_timestamp('01/01/17 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('31/12/00 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'));
Insert into ZZScopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001','001001','AMBITO AMERICA NORTE','AMBITO AMERICA NORTE','AMBITO AMERICA NORTE',to_timestamp('01/01/17 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('31/12/00 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'));
Insert into ZZScopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001','001002','AMBITO EUROPA','AMBITO EUROPA','AMBITO EUROPA',to_timestamp('01/01/17 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('31/12/00 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'));
Insert into ZZScopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002','001002001','AMBITO ESPA�A','AMBITO ESPA�A','AMBITO ESPA�A',to_timestamp('01/01/17 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('31/12/00 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'));
Insert into ZZScopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002001','001002001001','AMBITO GALICIA','AMBITO GALICIA','AMBITO GALICIA',to_timestamp('01/01/17 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('31/12/00 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'));
Insert into ZZScopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002001','001002001002','AMBITO MADRID','AMBITO MADRID','AMBITO MADRID',to_timestamp('01/01/17 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('31/12/00 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'));
Insert into ZZScopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002001002','001002001002001','AMBITO MOSTOLES','AMBITO MOSTOLES','AMBITO MOSTOLES',to_timestamp('01/01/17 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('31/12/00 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'));
Insert into ZZScopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002001002','001002001002002','AMBITO CIEMPOZUELOS','AMBITO CIEMPOZUELOS','AMBITO MOSTOLES',to_timestamp('01/01/17 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('31/12/00 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'));
Insert into ZZScopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002','001002002','AMBITO FRANCIA','AMBITO FRANCIA','AMBITO FRANCIA',to_timestamp('01/01/17 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'),to_timestamp('31/12/00 00:00:00,000000000','DD/MM/RR HH24:MI:SSXFF'));

COMMIT;