-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 18, 2021 at 01:20 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `Admin_Id` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Contact` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `Customer_Id` int(11) NOT NULL,
  `Customer_Name` varchar(100) NOT NULL,
  `Customer_Address` varchar(100) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Contact` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `Order_Id` int(11) NOT NULL,
  `Order_Date` date DEFAULT NULL,
  `Order_Status` varchar(100) DEFAULT NULL,
  `Price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

CREATE TABLE `payments` (
  `Payment_Id` int(11) NOT NULL,
  `Payment_Type` varchar(100) DEFAULT NULL,
  `Amount` int(11) DEFAULT NULL,
  `Order_Id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `Product_Id` int(11) NOT NULL,
  `Product_Name` varchar(100) NOT NULL,
  `Price` int(11) NOT NULL,
  `In_Stock` int(11) DEFAULT NULL,
  `Shop_Id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`Product_Id`, `Product_Name`, `Price`, `In_Stock`, `Shop_Id`) VALUES
(1, 'Test', 1000, 100, 1),
(2, 'Test2', 200, 1000, 1),
(3, 'Test3', 10, 5000, 1),
(4, 'Test4', 500, 200, 2),
(5, 'Test5', 5000, 10, 2),
(6, '678', 5678, 500, 2),
(7, 'Testing', 1000, 200, 1),
(8, 'TestTest', 200, 5, 1),
(9, 'Test123', 200, 5, 2),
(10, 'Test12345', 200, 5, 2);

-- --------------------------------------------------------

--
-- Table structure for table `products_orders`
--

CREATE TABLE `products_orders` (
  `Product_Id` int(11) DEFAULT NULL,
  `Order_Id` int(11) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `shops`
--

CREATE TABLE `shops` (
  `Shop_Id` int(11) NOT NULL,
  `Shop_Name` varchar(100) NOT NULL,
  `Shop_Owner` varchar(100) NOT NULL,
  `Shop_No` int(11) NOT NULL,
  `Shop_Phone` int(11) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shops`
--

INSERT INTO `shops` (`Shop_Id`, `Shop_Name`, `Shop_Owner`, `Shop_No`, `Shop_Phone`, `Username`, `Password`) VALUES
(1, 'Test', 'Rishi', 123, 1234567890, 'rishi', 'rishi'),
(2, 'Test2', 'Prabesh', 456, 987654321, 'prabesh', 'prabesh');

-- --------------------------------------------------------

--
-- Table structure for table `shop_orders`
--

CREATE TABLE `shop_orders` (
  `Order_Id` int(11) DEFAULT NULL,
  `Shop_Id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Admin_Id`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`Customer_Id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`Order_Id`);

--
-- Indexes for table `payments`
--
ALTER TABLE `payments`
  ADD PRIMARY KEY (`Payment_Id`),
  ADD UNIQUE KEY `Order_Id` (`Order_Id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`Product_Id`),
  ADD KEY `Shop_Id` (`Shop_Id`) USING BTREE;

--
-- Indexes for table `products_orders`
--
ALTER TABLE `products_orders`
  ADD KEY `Product_Id` (`Product_Id`),
  ADD KEY `Order_Id` (`Order_Id`);

--
-- Indexes for table `shops`
--
ALTER TABLE `shops`
  ADD PRIMARY KEY (`Shop_Id`),
  ADD UNIQUE KEY `Shop_No` (`Shop_No`),
  ADD UNIQUE KEY `Username` (`Username`);

--
-- Indexes for table `shop_orders`
--
ALTER TABLE `shop_orders`
  ADD KEY `Order_Id` (`Order_Id`),
  ADD KEY `Shop_Id` (`Shop_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `Admin_Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `Customer_Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `Order_Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `payments`
--
ALTER TABLE `payments`
  MODIFY `Payment_Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `Product_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `shops`
--
ALTER TABLE `shops`
  MODIFY `Shop_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `payments`
--
ALTER TABLE `payments`
  ADD CONSTRAINT `payments_ibfk_1` FOREIGN KEY (`Order_Id`) REFERENCES `orders` (`Order_Id`);

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`Shop_Id`) REFERENCES `shops` (`Shop_Id`);

--
-- Constraints for table `products_orders`
--
ALTER TABLE `products_orders`
  ADD CONSTRAINT `products_orders_ibfk_1` FOREIGN KEY (`Order_Id`) REFERENCES `orders` (`Order_Id`),
  ADD CONSTRAINT `products_orders_ibfk_2` FOREIGN KEY (`Product_Id`) REFERENCES `products` (`Product_Id`),
  ADD CONSTRAINT `products_orders_ibfk_3` FOREIGN KEY (`Order_Id`) REFERENCES `orders` (`Order_Id`);

--
-- Constraints for table `shop_orders`
--
ALTER TABLE `shop_orders`
  ADD CONSTRAINT `shop_orders_ibfk_1` FOREIGN KEY (`Order_Id`) REFERENCES `orders` (`Order_Id`),
  ADD CONSTRAINT `shop_orders_ibfk_2` FOREIGN KEY (`Shop_Id`) REFERENCES `shops` (`Shop_Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
