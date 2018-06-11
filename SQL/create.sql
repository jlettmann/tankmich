PRAGMA foreign_keys = ON;
create table Stations (
	stationId  varchar(255) PRIMARY KEY,
	stationName varchar(255),
	stationOpen binary,
	stationBrand varchar(255),
	stationPlace varchar(255),
	geoLat float,
	geoLon float,
	street varchar(255),
	houseNr integer
	);
create table GasType(gasTypeId int, gasTypeName varchar(64), gasTypeNameShort varchar(16),
PRIMARY KEY (gasTypeId)
);
create table GasPrice(
	stationId int,
	gasTypeId int,
	price float,
	FOREIGN KEY (gasTypeId) REFERENCES GasType(gasTypeId),
	FOREIGN KEY (stationId) REFERENCES Stations(stationId)
	);

create table UserData(
	userId int PRIMARY KEY,
	userName varchar(16),
	password varchar(32)
	);
	
create table UserPreferences(
	userId int,
	brand varchar(255),
	priority int,
	FOREIGN KEY (userId) REFERENCES UserData(userId),
	FOREIGN KEY (brand) REFERENCES Stations(stationBrand)
	);
	
create table UserHomeStation(
	userId int,
	stationId varchar(255),
	FOREIGN KEY (stationId) REFERENCES Stations(stationId),
	FOREIGN KEY (userId) REFERENCES UserData(userId)
	);