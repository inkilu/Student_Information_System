-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: sis
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendance` (
  `att_id` int NOT NULL AUTO_INCREMENT,
  `jun` int DEFAULT NULL,
  `jul` int DEFAULT NULL,
  `aug` int DEFAULT NULL,
  `sept` int DEFAULT NULL,
  `oct` int DEFAULT NULL,
  `nov` int DEFAULT NULL,
  `dece` int DEFAULT NULL,
  `jan` int DEFAULT NULL,
  `feb` int DEFAULT NULL,
  `mar` int DEFAULT NULL,
  `sid` int DEFAULT NULL,
  PRIMARY KEY (`att_id`),
  KEY `sid` (`sid`),
  CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `student_info` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
INSERT INTO `attendance` VALUES (101,23,23,45,11,54,54,54,54,54,23,1),(103,32,12,2,2,2,2,2,2,2,2,7),(104,3,4,5,2,16,43,32,55,30,11,8),(105,12,22,33,87,42,44,44,78,11,76,9),(106,0,0,0,0,0,12,0,0,0,0,10),(107,10,33,78,99,99,76,11,3,42,55,11),(108,0,0,0,0,0,0,0,0,0,0,12);
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `login_id` int NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'admin','admin');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marks` (
  `mid` int NOT NULL AUTO_INCREMENT,
  `eng` varchar(45) DEFAULT NULL,
  `sci` varchar(45) DEFAULT NULL,
  `ss` varchar(45) DEFAULT NULL,
  `math` varchar(45) DEFAULT NULL,
  `mal` varchar(45) DEFAULT NULL,
  `grade` varchar(45) DEFAULT NULL,
  `sid` int DEFAULT NULL,
  `eng_t2` varchar(45) DEFAULT NULL,
  `sci_t2` varchar(45) DEFAULT NULL,
  `ss_t2` varchar(45) DEFAULT NULL,
  `math_t2` varchar(45) DEFAULT NULL,
  `mal_t2` varchar(45) DEFAULT NULL,
  `grade_t2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mid`),
  KEY `sid_idx` (`sid`),
  CONSTRAINT `sid` FOREIGN KEY (`sid`) REFERENCES `student_info` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=203 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marks`
--

LOCK TABLES `marks` WRITE;
/*!40000 ALTER TABLE `marks` DISABLE KEYS */;
INSERT INTO `marks` VALUES (201,'21','23','43','23','32','B',3,NULL,NULL,NULL,NULL,NULL,NULL),(202,'44','33','22','23','43','C',1,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `marks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_info`
--

DROP TABLE IF EXISTS `student_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_info` (
  `sid` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `class` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phno` varchar(20) DEFAULT NULL,
  `dob` varchar(45) DEFAULT NULL,
  `Gname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_info`
--

LOCK TABLES `student_info` WRITE;
/*!40000 ALTER TABLE `student_info` DISABLE KEYS */;
INSERT INTO `student_info` VALUES (1,'babu','12',NULL,'263638',NULL,NULL),(2,'lal','12','kochi','12-12-2995','9474834848','mohan'),(3,'Ganesh','LKG','Ganesh Bhavan','12-01-2000','9898767654','Babu'),(7,'Appu','11','Kottayam','12-10-2000','9876878987','Chan'),(8,'Loki','3','Kochu House','11-03-2039','456567654','Babu'),(9,'Yedu','10','Kannapi house','31-02-2000','987876547','TY'),(10,'Robert Pattinson','5','America 123Hs','12-03-2000','9878675678','Hamburger'),(11,'Daniel','12th','Africa','11/01/2000','1234224422','Smuchets'),(12,'s','adasda','dasdas','da','dada','da');
/*!40000 ALTER TABLE `student_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `student_info_AFTER_INSERT` AFTER INSERT ON `student_info` FOR EACH ROW BEGIN
INSERT INTO `sis`.`attendance`
(`jun`,`jul`,`aug`,`sept`,`oct`,`nov`,`dece`,`jan`,`feb`,`mar`,`sid`)VALUES
(0,0,0,0,0,0,0,0,0,0,new.sid);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `time_table`
--

DROP TABLE IF EXISTS `time_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `time_table` (
  `t_id` int NOT NULL,
  `h1` varchar(45) NOT NULL,
  `h2` varchar(45) NOT NULL,
  `h3` varchar(45) NOT NULL,
  `h4` varchar(45) NOT NULL,
  `h5` varchar(45) NOT NULL,
  `h6` varchar(45) NOT NULL,
  `h7` varchar(45) NOT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `time_table`
--

LOCK TABLES `time_table` WRITE;
/*!40000 ALTER TABLE `time_table` DISABLE KEYS */;
INSERT INTO `time_table` VALUES (101,'Physics','English','Mal','Eng','Sci','SS','P.T'),(102,'English','Maths','SS','P.T','Sci','Mal','SS'),(103,'Maths','SS','Maths','Sci','Mal','Maths','English'),(104,'English','Sci','Mal','SS','Sci','P.T','P.T'),(105,'Mal','Eng','SS','Maths','Sci','P.T','Maths');
/*!40000 ALTER TABLE `time_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'sis'
--

--
-- Dumping routines for database 'sis'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-10 23:45:42
