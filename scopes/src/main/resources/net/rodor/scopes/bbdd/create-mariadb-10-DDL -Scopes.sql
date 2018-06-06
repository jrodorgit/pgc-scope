CREATE TABLE Scopes(
app char(20) NOT NULL  COMMENT 'Aplicacion a la que pertenece el ambito' ,
parentcode char(20)  NULL COMMENT 'Codigo del ambito padre' ,
code char(20) NOT NULL COMMENT 'Codigo ambito' ,
description varchar(80) NOT NULL COMMENT 'Descripcion del ambito' ,
descriptionXL varchar(256) NOT NULL COMMENT 'Descripcion larga del ambito' ,
descriptionXS varchar(30) NOT NULL COMMENT 'Descripcion corta del ambito' ,
startdate datetime NOT NULL COMMENT 'fecha de inicio de validez del ambito' ,
enddate datetime NOT NULL COMMENT 'fecha de fin de validez del ambito' 
);

--REM INSERTING into Scopes
Insert into Scopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL',null,'001','AMBITO RAIZ','AMBITO RAIZ','AMBITO RAIZ',"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");
Insert into Scopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001','001001','AMBITO AMERICA NORTE','AMBITO AMERICA NORTE','AMBITO AMERICA NORTE',"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");
Insert into Scopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001','001002','AMBITO EUROPA','AMBITO EUROPA','AMBITO EUROPA',"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");
Insert into Scopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002','001002001','AMBITO ESPA�A','AMBITO ESPA�A','AMBITO ESPA�A',"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");
Insert into Scopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002001','001002001001','AMBITO GALICIA','AMBITO GALICIA','AMBITO GALICIA',"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");
Insert into Scopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002001','001002001002','AMBITO MADRID','AMBITO MADRID','AMBITO MADRID',"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");
Insert into Scopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002001002','001002001002001','AMBITO MOSTOLES','AMBITO MOSTOLES','AMBITO MOSTOLES',"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");
Insert into Scopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002001002','001002001002002','AMBITO CIEMPOZUELOS','AMBITO CIEMPOZUELOS','AMBITO MOSTOLES',"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");
Insert into Scopes (app,PARENTCODE,CODE,DESCRIPTION,DESCRIPTIONXL,DESCRIPTIONXS,STARTDATE,ENDDATE) values ('ALL','001002','001002002','AMBITO FRANCIA','AMBITO FRANCIA','AMBITO FRANCIA',"2017/01/01 00:00:00.000000000","2018/12/31 00:00:00.000000000");

COMMIT;