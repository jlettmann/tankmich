--[use]

create TABLE dbo.Stations (
	stationId int PRIMARY KEY,
	stationName varchar(255),
	stationDesc varchar(255),
	stationInfo varchar(255),
	stationBrand varchar(255),
	stationPlace varchar(255),
	geoLat float,
	geoLon float,
	street varchar(255),
	houseNr int
	)
create TABLE dbo.GasType (
	gasTypeId int PRIMARY KEY,
	gasTypeName varchar(255),
	gasTypeNameShort varchar(255)
	)
create TABLE dbo.GasPrice(
	stationId int,
	gasTypeId int,
	price float,
	FOREIGN KEY stationId REFERENCES Stations(stationId),
	FOREIGN KEY gasTypeId REFERENCES GasType(gasTypeId)
	)
