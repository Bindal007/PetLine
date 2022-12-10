-- MySQL dump 10.13  Distrib 8.0.31, for macos12.6 (x86_64)
--
-- Host: localhost    Database: petLine
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `addressId` int NOT NULL AUTO_INCREMENT,
  `street` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL,
  `city` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL,
  `state` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci NOT NULL,
  `zipcode` int NOT NULL,
  `longitude` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  `latitude` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`addressId`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `appointments`
--

DROP TABLE IF EXISTS `appointments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointments` (
  `appointmentId` int NOT NULL AUTO_INCREMENT,
  `personId` int DEFAULT NULL,
  `appointmentDate` date NOT NULL,
  `vetId` int DEFAULT NULL,
  `vitalsId` int DEFAULT NULL,
  PRIMARY KEY (`appointmentId`),
  KEY `personId` (`personId`),
  KEY `vetId` (`vetId`),
  KEY `vitalsId` (`vitalsId`),
  CONSTRAINT `appointments_ibfk_1` FOREIGN KEY (`personId`) REFERENCES `person` (`personId`),
  CONSTRAINT `appointments_ibfk_2` FOREIGN KEY (`vetId`) REFERENCES `vets` (`vetId`),
  CONSTRAINT `appointments_ibfk_3` FOREIGN KEY (`vitalsId`) REFERENCES `vitals` (`vitalsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointments`
--

LOCK TABLES `appointments` WRITE;
/*!40000 ALTER TABLE `appointments` DISABLE KEYS */;
/*!40000 ALTER TABLE `appointments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `billing`
--

DROP TABLE IF EXISTS `billing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `billing` (
  `billNo` int NOT NULL AUTO_INCREMENT,
  `billDate` varchar(40) DEFAULT NULL,
  `personId` int DEFAULT NULL,
  `amount` double NOT NULL,
  PRIMARY KEY (`billNo`),
  KEY `personId` (`personId`),
  CONSTRAINT `billing_ibfk_1` FOREIGN KEY (`personId`) REFERENCES `person` (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billing`
--

LOCK TABLES `billing` WRITE;
/*!40000 ALTER TABLE `billing` DISABLE KEYS */;
/*!40000 ALTER TABLE `billing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `city` (
  `cityName` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES ('Boston'),('New York'),('Florida'),('New Jersey'),('San jose'),('Seattle');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deliveryPartner`
--

DROP TABLE IF EXISTS `deliveryPartner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `deliveryPartner` (
  `partnerId` int NOT NULL AUTO_INCREMENT,
  `personId` int NOT NULL,
  `partnerName` varchar(20) NOT NULL,
  `city` varchar(50) NOT NULL,
  PRIMARY KEY (`partnerId`),
  KEY `personId` (`personId`),
  CONSTRAINT `deliverypartner_ibfk_1` FOREIGN KEY (`personId`) REFERENCES `person` (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deliveryPartner`
--

LOCK TABLES `deliveryPartner` WRITE;
/*!40000 ALTER TABLE `deliveryPartner` DISABLE KEYS */;
/*!40000 ALTER TABLE `deliveryPartner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driver` (
  `driverId` int NOT NULL AUTO_INCREMENT,
  `personId` int DEFAULT NULL,
  `partnerId` int DEFAULT NULL,
  PRIMARY KEY (`driverId`),
  KEY `personId` (`personId`),
  KEY `partnerId` (`partnerId`),
  CONSTRAINT `driver_ibfk_1` FOREIGN KEY (`personId`) REFERENCES `person` (`personId`),
  CONSTRAINT `driver_ibfk_2` FOREIGN KEY (`partnerId`) REFERENCES `deliveryPartner` (`partnerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver`
--

LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver` DISABLE KEYS */;
/*!40000 ALTER TABLE `driver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hospitals`
--

DROP TABLE IF EXISTS `hospitals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hospitals` (
  `hospitalId` int NOT NULL AUTO_INCREMENT,
  `hospitalName` varchar(50) NOT NULL,
  `addressId` int DEFAULT NULL,
  `personId` int DEFAULT NULL,
  `city` varchar(50) NOT NULL,
  PRIMARY KEY (`hospitalId`),
  KEY `addressId` (`addressId`),
  KEY `personId` (`personId`),
  CONSTRAINT `hospitals_ibfk_1` FOREIGN KEY (`addressId`) REFERENCES `address` (`addressId`),
  CONSTRAINT `hospitals_ibfk_2` FOREIGN KEY (`personId`) REFERENCES `person` (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospitals`
--

LOCK TABLES `hospitals` WRITE;
/*!40000 ALTER TABLE `hospitals` DISABLE KEYS */;
/*!40000 ALTER TABLE `hospitals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ngo`
--

DROP TABLE IF EXISTS `ngo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ngo` (
  `ngoId` int NOT NULL AUTO_INCREMENT,
  `ngoName` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `addressId` int NOT NULL,
  `personId` int DEFAULT NULL,
  `ngoDesc` varchar(200) DEFAULT NULL,
  `ngoSize` int DEFAULT NULL,
  PRIMARY KEY (`ngoId`),
  KEY `addressId` (`addressId`),
  KEY `personId` (`personId`),
  CONSTRAINT `ngo_ibfk_1` FOREIGN KEY (`addressId`) REFERENCES `address` (`addressId`),
  CONSTRAINT `ngo_ibfk_2` FOREIGN KEY (`personId`) REFERENCES `person` (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ngo`
--

LOCK TABLES `ngo` WRITE;
/*!40000 ALTER TABLE `ngo` DISABLE KEYS */;
/*!40000 ALTER TABLE `ngo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `orderId` int NOT NULL AUTO_INCREMENT,
  `vendorId` int DEFAULT NULL,
  `personId` int DEFAULT NULL,
  `deliveryStatus` enum('Pending','Delivered') DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  KEY `vendorId` (`vendorId`),
  KEY `personId` (`personId`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`vendorId`) REFERENCES `vendors` (`vendorId`),
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`personId`) REFERENCES `person` (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `personId` int NOT NULL AUTO_INCREMENT,
  `personType` enum('System Administrator','User','Vet','Hospital Manager','Vendor','NGO','Delivery Partner','Delivery Boy') NOT NULL,
  `name` varchar(50) NOT NULL,
  `age` int DEFAULT NULL,
  `ssn` varchar(20) DEFAULT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `addressId` int DEFAULT NULL,
  `profilePic` blob,
  `email` varchar(50) NOT NULL,
  `phoneNo` varchar(20) NOT NULL,
  PRIMARY KEY (`personId`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `phoneNo` (`phoneNo`),
  UNIQUE KEY `ssn` (`ssn`),
  KEY `addressId` (`addressId`),
  CONSTRAINT `person_ibfk_1` FOREIGN KEY (`addressId`) REFERENCES `address` (`addressId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `posts`
--

DROP TABLE IF EXISTS `posts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `posts` (
  `postId` int NOT NULL AUTO_INCREMENT,
  `city` varchar(50) DEFAULT NULL,
  `addressId` int DEFAULT NULL,
  `personId` int DEFAULT NULL,
  `description` varchar(500) NOT NULL,
  `postPic` blob,
  `postTag` enum('Emergency','Helpline','Lost','Found','Fundraiser','Event','Adoptions') NOT NULL,
  PRIMARY KEY (`postId`),
  KEY `addressId` (`addressId`),
  KEY `personId` (`personId`),
  CONSTRAINT `posts_ibfk_1` FOREIGN KEY (`addressId`) REFERENCES `address` (`addressId`),
  CONSTRAINT `posts_ibfk_2` FOREIGN KEY (`personId`) REFERENCES `person` (`personId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `posts`
--

LOCK TABLES `posts` WRITE;
/*!40000 ALTER TABLE `posts` DISABLE KEYS */;
/*!40000 ALTER TABLE `posts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `productId` int NOT NULL AUTO_INCREMENT,
  `productName` varchar(50) NOT NULL,
  `productCat` enum('Food','Medicine','Accessories') NOT NULL,
  `productQty` int DEFAULT NULL,
  `productPrice` double DEFAULT NULL,
  `vendorId` int NOT NULL,
  PRIMARY KEY (`productId`),
  KEY `vendorId` (`vendorId`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`vendorId`) REFERENCES `vendors` (`vendorId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendors`
--

DROP TABLE IF EXISTS `vendors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendors` (
  `vendorId` int NOT NULL AUTO_INCREMENT,
  `addressId` int DEFAULT NULL,
  `vendorName` varchar(50) NOT NULL,
  `phoneNo` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  PRIMARY KEY (`vendorId`),
  UNIQUE KEY `phoneNo` (`phoneNo`),
  UNIQUE KEY `email` (`email`),
  KEY `addressId` (`addressId`),
  CONSTRAINT `vendors_ibfk_1` FOREIGN KEY (`addressId`) REFERENCES `Address` (`addressId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendors`
--

LOCK TABLES `vendors` WRITE;
/*!40000 ALTER TABLE `vendors` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Vets`
--

DROP TABLE IF EXISTS `Vets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Vets` (
  `vetId` int NOT NULL AUTO_INCREMENT,
  `personId` int DEFAULT NULL,
  `hospitalId` int DEFAULT NULL,
  PRIMARY KEY (`vetId`),
  KEY `personId` (`personId`),
  KEY `hospitalId` (`hospitalId`),
  CONSTRAINT `vets_ibfk_1` FOREIGN KEY (`personId`) REFERENCES `Person` (`personId`),
  CONSTRAINT `vets_ibfk_2` FOREIGN KEY (`hospitalId`) REFERENCES `Hospitals` (`hospitalId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Vets`
--

LOCK TABLES `Vets` WRITE;
/*!40000 ALTER TABLE `Vets` DISABLE KEYS */;
/*!40000 ALTER TABLE `Vets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vitals`
--

DROP TABLE IF EXISTS `vitals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vitals` (
  `vitalsId` int NOT NULL AUTO_INCREMENT,
  `respiratoryRate` int DEFAULT NULL,
  `pulseRate` int DEFAULT NULL,
  `bloodPressure` varchar(20) DEFAULT NULL,
  `bodyTemperature` double DEFAULT NULL,
  PRIMARY KEY (`vitalsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vitals`
--

LOCK TABLES `vitals` WRITE;
/*!40000 ALTER TABLE `vitals` DISABLE KEYS */;
/*!40000 ALTER TABLE `vitals` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-10 22:24:24
