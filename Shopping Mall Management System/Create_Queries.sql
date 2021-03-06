create database Shopping_Mall;

use Shopping_Mall;

create table Mall_Owner(
Mall_Owner_Id int primary key,
Mall_Owner_Name varchar(100),
Mall_Owner_Email varchar(100),
Mall_Owner_Contact int,
);

create table Mall(
Mall_Id int primary key,
Mall_Name varchar(100),
Mall_Address varchar(100),
);

create table Shops(
Shop_Id int primary key,
Shop_Name varchar(100),
Shop_Owner varchar(100),
Shop_No int,
);

create table Customer(
Customer_Id int primary key,
Customer_Name varchar(100),
Customer_Email varchar(100),
Customer_Contact int,
Customer_Address varchar(100),
);

create table [Order](
Order_Id int primary key,
Order_Date date,
Order_Status varchar(100),
Price money,
);

create table Item(
Item_Id int primary key,
Item_Name varchar(100),
Quantity int,
Price money,
);

create table Payment(
Payment_Id int primary key,
Payment_Type varchar(100),
Amount money,

);