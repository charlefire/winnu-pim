
# -----------------------------------------------------------------------
# User
# -----------------------------------------------------------------------
drop table if exists User;

CREATE TABLE User
(
		            userId INTEGER (5) NOT NULL AUTO_INCREMENT,
		            username VARCHAR (20) NOT NULL,
		            password VARCHAR (20) NOT NULL,
		            firstName VARCHAR (30) NOT NULL,
		            middleName VARCHAR (30) NOT NULL,
		            lastName VARCHAR (30) NOT NULL,
		            position VARCHAR (20) NOT NULL,
		            address VARCHAR (100),
		            contactNo VARCHAR (50),
		            type VARCHAR (20) NOT NULL,
		            deleted INTEGER (5) NOT NULL,
    PRIMARY KEY(userId),
    UNIQUE (username)
);

# -----------------------------------------------------------------------
# Sale
# -----------------------------------------------------------------------
drop table if exists Sale;

CREATE TABLE Sale
(
		            saleId INTEGER (5) NOT NULL AUTO_INCREMENT,
		            customerName VARCHAR (30),
		            saleDate VARCHAR (20) NOT NULL,
		            totalCost FLOAT (20) NOT NULL,
		            userId INTEGER (5) NOT NULL,
    PRIMARY KEY(saleId),
    FOREIGN KEY (userId) REFERENCES User (userId)
    
);

# -----------------------------------------------------------------------
# Supplier
# -----------------------------------------------------------------------
drop table if exists Supplier;

CREATE TABLE Supplier
(
		            supplierId INTEGER (5) NOT NULL AUTO_INCREMENT,
		            supplierName VARCHAR (30) NOT NULL,
		            address VARCHAR (100),
		            contactNo VARCHAR (20),
    PRIMARY KEY(supplierId),
    UNIQUE (supplierName)
);

# -----------------------------------------------------------------------
# Item
# -----------------------------------------------------------------------
drop table if exists Item;

CREATE TABLE Item
(
		            itemId INTEGER (5) NOT NULL AUTO_INCREMENT,
		            genericName VARCHAR (30) NOT NULL,
		            brandName VARCHAR (30) NOT NULL,
		            classification VARCHAR (30) NOT NULL,
		            type VARCHAR (30) NOT NULL,
		            minimumSuppyLimit INTEGER (30) NOT NULL,
		            userId INTEGER (5) NOT NULL,
		            nextBatch INTEGER (20) NOT NULL,
    PRIMARY KEY(itemId),
    FOREIGN KEY (userId) REFERENCES User (userId)
    ,
    UNIQUE (brandName)
);

# -----------------------------------------------------------------------
# ItemBatch
# -----------------------------------------------------------------------
drop table if exists ItemBatch;

CREATE TABLE ItemBatch
(
		            itemBatchId INTEGER (5) NOT NULL AUTO_INCREMENT,
		            batchNo INTEGER (5) NOT NULL,
		            expirationDate VARCHAR (50) NOT NULL,
		            supplierId INTEGER (5) NOT NULL,
		            itemId INTEGER (5) NOT NULL,
		            acquisitionCost FLOAT (20) NOT NULL,
    PRIMARY KEY(itemBatchId),
    FOREIGN KEY (supplierId) REFERENCES Supplier (supplierId)
    ,
    FOREIGN KEY (itemId) REFERENCES Item (itemId)
    
);

# -----------------------------------------------------------------------
# StockedItem
# -----------------------------------------------------------------------
drop table if exists StockedItem;

CREATE TABLE StockedItem
(
		            stockedItemId INTEGER (5) NOT NULL AUTO_INCREMENT,
		            currentPrice FLOAT (20) NOT NULL,
		            quantity INTEGER (5) NOT NULL,
		            itemBatchId INTEGER (5) NOT NULL,
    PRIMARY KEY(stockedItemId),
    FOREIGN KEY (itemBatchId) REFERENCES ItemBatch (itemBatchId)
    
);

# -----------------------------------------------------------------------
# Doctor
# -----------------------------------------------------------------------
drop table if exists Doctor;

CREATE TABLE Doctor
(
		            doctorId INTEGER (5) NOT NULL AUTO_INCREMENT,
		            doctorName VARCHAR (30) NOT NULL,
		            licenseNo INTEGER (20) NOT NULL,
		            s2No INTEGER (20) NOT NULL,
    PRIMARY KEY(doctorId),
    UNIQUE (licenseNo),
    UNIQUE (s2No)
);

# -----------------------------------------------------------------------
# WithdrawnItem
# -----------------------------------------------------------------------
drop table if exists WithdrawnItem;

CREATE TABLE WithdrawnItem
(
		            withdrawnItemId INTEGER (5) NOT NULL AUTO_INCREMENT,
		            sellingPrice FLOAT (20) NOT NULL,
		            dateWithdrawn VARCHAR (30) NOT NULL,
		            reason VARCHAR (200) NOT NULL,
		            quantity INTEGER (5) NOT NULL,
		            doctorId INTEGER (5) NOT NULL,
		            saleId INTEGER (5) NOT NULL,
		            itemBatchId INTEGER (5) NOT NULL,
		            userId INTEGER (5) NOT NULL,
    PRIMARY KEY(withdrawnItemId),
    FOREIGN KEY (doctorId) REFERENCES Doctor (doctorId)
    ,
    FOREIGN KEY (saleId) REFERENCES Sale (saleId)
    ,
    FOREIGN KEY (itemBatchId) REFERENCES ItemBatch (itemBatchId)
    ,
    FOREIGN KEY (userId) REFERENCES User (userId)
    
);
  
  
  
  
  
  
  
  
