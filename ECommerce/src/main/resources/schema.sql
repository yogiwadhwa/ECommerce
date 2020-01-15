DROP TABLE Sub_Category IF EXISTS;
CREATE TABLE Supplier 
  ( 
  SupplierID INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
  SupplierName VARCHAR(30) NOT NULL DEFAULT '', 
  SupplierTag  VARCHAR(30) NOT Null DEFAULT '',
  );

CREATE TABLE Category
    (
    CategoryID INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    CategoryName VARCHAR(30) NOT NULL DEFAULT '',
    CreatedBy VARCHAR(30) NOT NULL DEFAULT '',
    CreatedOn DATETIME NOT NULL,
    );

CREATE TABLE Sub_Category
    (
    SubCategoryID INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    SubCategoryName VARCHAR(30) NOT NULL,
    CategoryID INT NOT NULL , 
    CreatedBy VARCHAR(30) NOT NULL,
    CreatedOn DATETIME NOT NULL
    );

CREATE TABLE Manufacturer
    (
    ManufacturerID INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
    ManufacturerName VARCHAR(30) NOT NULL DEFAULT '',
    SubCategoryID INT NOT NULL
    );

CREATE TABLE Products 
  (
  ProductID INT IDENTITY(1,1) NOT NULL PRIMARY KEY,    
  ProductName   VARCHAR(50) NOT NULL DEFAULT '', 
  CategoryID INT NOT NULL, 
  SubCategoryID INT NOT NULL,
  ManufacturerID INT NOT NULL,
  SIZE INT NOT NULL,
  COLOR VARCHAR(30)
  );

CREATE TABLE ProductSpecs
( 
  RowID INT IDENTITY(1,1) NOT NULL PRIMARY KEY,      
  ProductID INT NOT NULL,
  SubCategoryID INT NOT NULL,
  ProductSpec1 VARCHAR(30),
  ProductSpec2 VARCHAR(30),
  ProductSpec3 VARCHAR(30)
);

CREATE TABLE ProductAvailability
( 
  RowID INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
  ProductID INT NOT NULL,
  SupplierID INT NOT NULL,
  SupplierWEB Varchar(30) NOT NULL,
  ProductPrice decimal(6,2) NOT NULL 
);