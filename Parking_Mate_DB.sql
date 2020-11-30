--
-- File generated with SQLiteStudio v3.2.1 on Mon Nov 23 23:08:42 2020
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: Admin
CREATE TABLE Admin (ID INTEGER PRIMARY KEY, Name STRING (32) NOT NULL, Password STRING (32) NOT NULL, Email STRING (32), phone STRING (14));
INSERT INTO Admin (ID, Name, Password, Email, phone) VALUES (1, 'lina', 123456, 'lina@hotmail.com', '966+ 558555702');

-- Table: Credit_Card
CREATE TABLE Credit_Card (ID INTEGER PRIMARY KEY UNIQUE NOT NULL, Number INTEGER (14) UNIQUE NOT NULL, Expiary_Date DATE, CVV INTEGER (3));

-- Table: Duration
CREATE TABLE Duration (ID INTEGER PRIMARY KEY NOT NULL UNIQUE, Reservation INTEGER REFERENCES Reservations (ID) ON DELETE CASCADE ON UPDATE CASCADE NOT NULL, ArrivalTime DATETIME NOT NULL UNIQUE, LeaveTime DATETIME UNIQUE NOT NULL);

-- Table: Member
CREATE TABLE Member (ID INTEGER PRIMARY KEY NOT NULL UNIQUE ON CONFLICT ROLLBACK, Name STRING (32) NOT NULL, Password STRING (32) NOT NULL, Phone STRING (14), Email STRING (32), Credit_Card_num INTEGER (16) REFERENCES Credit_Card (ID) ON DELETE CASCADE ON UPDATE CASCADE MATCH SIMPLE);

-- Table: Parking_Area
CREATE TABLE Parking_Area (ID INTEGER PRIMARY KEY, name STRING NOT NULL, Location STRING NOT NULL);

-- Table: Parking_Spot
CREATE TABLE Parking_Spot (ID STRING PRIMARY KEY ASC ON CONFLICT ROLLBACK NOT NULL UNIQUE, Area INTEGER REFERENCES Parking_Area (ID) ON DELETE CASCADE ON UPDATE CASCADE NOT NULL UNIQUE, Availability BOOLEAN DEFAULT (true) NOT NULL);

-- Table: Reservations
CREATE TABLE Reservations (ID INTEGER PRIMARY KEY NOT NULL UNIQUE, Date DATE, Time TIME, Duration STRING, Area STRING, Spot STRING, confirmation BOOLEAN, Member INTEGER REFERENCES Member (ID) ON DELETE CASCADE ON UPDATE CASCADE);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
