-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               10.4.24-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for real_estate
DROP DATABASE IF EXISTS `real_estate`;
CREATE DATABASE IF NOT EXISTS `real_estate` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `real_estate`;

-- Dumping structure for table real_estate.real_estate
DROP TABLE IF EXISTS `real_estate`;
CREATE TABLE IF NOT EXISTS `real_estate` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `category` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `advert_type` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `title` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `location` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `image_path` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_registered` tinyint(1) DEFAULT 0,
  `is_on_a_lot` tinyint(1) DEFAULT 0,
  `is_permitted` tinyint(1) DEFAULT 0,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `price` double DEFAULT NULL,
  `quadrature` double DEFAULT NULL,
  `num_of_rooms` int(11) DEFAULT NULL,
  `heating` tinyint(1) DEFAULT 0,
  `num_of_floor` int(11) DEFAULT NULL,
  `has_elevator` tinyint(1) DEFAULT 0,
  `has_terrace` tinyint(1) DEFAULT 0,
  `has_parking` tinyint(1) DEFAULT 0,
  `has_cable_tv` tinyint(1) DEFAULT 0,
  `has_internet` tinyint(1) DEFAULT 0,
  `has_phone` tinyint(1) DEFAULT 0,
  `has_intercom` tinyint(1) DEFAULT 0,
  `created_by` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `createdBy` (`created_by`) USING BTREE,
  CONSTRAINT `FK_real_estate_user` FOREIGN KEY (`created_by`) REFERENCES `user` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Dumping data for table real_estate.real_estate: ~11 rows (approximately)
INSERT INTO `real_estate` (`id`, `category`, `advert_type`, `title`, `location`, `description`, `image_path`, `is_registered`, `is_on_a_lot`, `is_permitted`, `created_at`, `price`, `quadrature`, `num_of_rooms`, `heating`, `num_of_floor`, `has_elevator`, `has_terrace`, `has_parking`, `has_cable_tv`, `has_internet`, `has_phone`, `has_intercom`, `created_by`) VALUES
	(3, 'Stracara', 'Prodaja', 'Prelepa kuća na prodaju', 'Karaburma', 'Kuća u samom centru Karaburme', NULL, 0, 1, 0, '2023-06-05 18:59:51', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
	(5, 'Stan', 'Prodaja', 'Stan novogradnja na prodaju', 'Vračar', 'Stan u blizini Kalenićeve pijace', NULL, 1, 1, 1, '2023-06-05 19:05:11', 100000, 50, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 2),
	(8, 'Stan', 'Izdavanje', 'Garsonjera na izdavanje', 'Novi Beograd', 'Stan u blizini Immo Centra ', NULL, 1, 1, 1, '2023-06-05 19:06:47', 130000, 70, 3, 1, 8, 1, 1, 1, 1, 1, 1, 1, 3),
	(11, 'Stan', 'Prodaja', 'Prelep stan', 'Vracar', 'Stan u centru grada', NULL, 1, 1, 0, '2023-06-19 17:29:17', 60000, 30, 2, 1, 3, 0, 1, 1, 1, 1, 0, 0, 1),
	(13, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, '2023-06-20 17:20:59', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
	(14, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, '2023-06-20 17:23:57', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
	(15, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, '2023-06-20 17:27:24', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
	(16, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, '2023-06-20 17:30:40', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
	(17, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, '2023-06-20 17:34:09', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
	(18, 'Vila', 'Izdavanje', 'Prelepa vila na prodaju', 'Karaburma', 'Kuća u samom centru Karaburme', NULL, 0, 0, 0, '2023-06-05 18:59:51', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
	(19, 'Kuca', 'Izdavanje', 'Kuca za izdavanje', 'Karaburma', 'Kuća u samom centru Karaburme', NULL, 0, 0, 0, '2023-06-05 18:59:51', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4),
	(20, 'Kuca', 'Izdavanje', 'Kuca za izdavanje', 'Karaburma', 'Kuća u samom centru Karaburme', NULL, 0, 0, 0, '2023-06-05 18:59:51', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4),
	(21, 'Kuca', 'Izdavanje', 'Kuca za izdavanje', 'Karaburma', 'Kuća u samom centru Karaburme', NULL, 0, 0, 0, '2023-06-05 18:59:51', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4);

-- Dumping structure for table real_estate.user
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(256) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `surname` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `number` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Dumping data for table real_estate.user: ~10 rows (approximately)
INSERT INTO `user` (`id`, `email`, `password`, `name`, `surname`, `address`, `number`) VALUES
	(1, 'promenjen@mica.com', 'pekapeka', 'Petar', 'lukic', 'Dostojevskog 6', '+381600702334'),
	(2, 'atrifkovic@gmail.com', 'atrif555', 'Ana', 'Trifković', 'Jurija Gagarina 666', '+38164555678'),
	(3, 'bojanb@gmail.com', 'bbb666', 'Bojan', 'Bajagić', 'Petrinjska 4', '+38169335672'),
	(4, 'pperic@email.com', 'ppera', 'Petar', 'Petrovic', 'Decanska 5', '06005070696'),
	(5, 'mica@gmail.com', 'pppp', 'pera', 'peric', 'bggdtdt 24', '06276262'),
	(7, 'ppekic@gmail.com', 'pekapeka', 'Petar', 'pekic', 'Dostojevskog 6', '+381600702334'),
	(9, 'promenjen@mica.com', 'pekapeka', 'Petar', 'pekic', 'Dostojevskog 6', '+381600702334'),
	(10, 'promenjen@mica.com', 'BozaBoza', 'Petar', 'lukic', 'Dostojevskog 6', '+381600702334'),
	(11, 'jovanjovanovic@gmail.com', 'jjjjj', 'Jovan', 'Jovanovic', 'Beogradska 18', '0667876542');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
