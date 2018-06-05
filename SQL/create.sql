--[use]
create DATABASE tankmich;
USE tankmich;
create TABLE Stations (
	stationId  varchar(255) PRIMARY KEY,
	stationName varchar(255),
	stationOpen binary,
	stationBrand varchar(255),
	stationPlace varchar(255),
	geoLat float,
	geoLon float,
	street varchar(255),
	houseNr int
	)
	
create TABLE GasType (
	gasTypeId int PRIMARY KEY,
	gasTypeName varchar(64),
	gasTypeNameShort varchar(16)
	)
	
create TABLE GasPrice(
	stationId int,
	FOREIGN KEY stationId REFERENCES Stations(stationId),
	gasTypeId int,
	FOREIGN KEY gasTypeId REFERENCES GasType(gasTypeId)
	price float
	)

create Table UserData(
	userId int PRIMARY KEY,
	userName varchar(16),
	password varchar(32)
	)
	
create Table UserPreferences(
	userId int,
	FOREIGN KEY userId REFERENCES UserData(userId),
	brand varchar(255),
	FOREIGN KEY brand REFERENCES Stations(stationBrand),
	priority int
	)
	
create TABLE UserHomeStation(
	userId int,
	FOREIGN KEY userId REFERENCES UserData(userId),
	stationId varchar(255),
	FOREIGN KEY stationId REFERENCES Stations(stationId)
	)