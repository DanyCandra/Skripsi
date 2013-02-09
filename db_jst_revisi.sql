-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.1.41 - Source distribution
-- Server OS:                    Win32
-- HeidiSQL version:             7.0.0.4053
-- Date/time:                    2013-02-08 22:36:44
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;

-- Dumping database structure for db_jst_revisi
DROP DATABASE IF EXISTS `db_jst_revisi`;
CREATE DATABASE IF NOT EXISTS `db_jst_revisi` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `db_jst_revisi`;


-- Dumping structure for table db_jst_revisi.bias_hidden_akhir
DROP TABLE IF EXISTS `bias_hidden_akhir`;
CREATE TABLE IF NOT EXISTS `bias_hidden_akhir` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `v01` double DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.bias_hidden_akhir: 4 rows
/*!40000 ALTER TABLE `bias_hidden_akhir` DISABLE KEYS */;
REPLACE INTO `bias_hidden_akhir` (`id`, `v01`) VALUES
	(1, 0),
	(2, 0),
	(3, 0),
	(4, 0);
/*!40000 ALTER TABLE `bias_hidden_akhir` ENABLE KEYS */;


-- Dumping structure for table db_jst_revisi.bias_hidden_awal
DROP TABLE IF EXISTS `bias_hidden_awal`;
CREATE TABLE IF NOT EXISTS `bias_hidden_awal` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `v01` double DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.bias_hidden_awal: 4 rows
/*!40000 ALTER TABLE `bias_hidden_awal` DISABLE KEYS */;
REPLACE INTO `bias_hidden_awal` (`id`, `v01`) VALUES
	(1, 0),
	(2, 0),
	(3, 0),
	(4, 0);
/*!40000 ALTER TABLE `bias_hidden_awal` ENABLE KEYS */;


-- Dumping structure for table db_jst_revisi.bias_ouput_akhir
DROP TABLE IF EXISTS `bias_ouput_akhir`;
CREATE TABLE IF NOT EXISTS `bias_ouput_akhir` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `w0` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.bias_ouput_akhir: 1 rows
/*!40000 ALTER TABLE `bias_ouput_akhir` DISABLE KEYS */;
REPLACE INTO `bias_ouput_akhir` (`id`, `w0`) VALUES
	(1, 0);
/*!40000 ALTER TABLE `bias_ouput_akhir` ENABLE KEYS */;


-- Dumping structure for table db_jst_revisi.bias_ouput_awal
DROP TABLE IF EXISTS `bias_ouput_awal`;
CREATE TABLE IF NOT EXISTS `bias_ouput_awal` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `w0` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.bias_ouput_awal: 1 rows
/*!40000 ALTER TABLE `bias_ouput_awal` DISABLE KEYS */;
REPLACE INTO `bias_ouput_awal` (`id`, `w0`) VALUES
	(1, 0);
/*!40000 ALTER TABLE `bias_ouput_awal` ENABLE KEYS */;


-- Dumping structure for table db_jst_revisi.bobot_hiden_output_akhir
DROP TABLE IF EXISTS `bobot_hiden_output_akhir`;
CREATE TABLE IF NOT EXISTS `bobot_hiden_output_akhir` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `w1` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.bobot_hiden_output_akhir: 4 rows
/*!40000 ALTER TABLE `bobot_hiden_output_akhir` DISABLE KEYS */;
REPLACE INTO `bobot_hiden_output_akhir` (`id`, `w1`) VALUES
	(2, 0),
	(1, 0),
	(3, 0),
	(4, 0);
/*!40000 ALTER TABLE `bobot_hiden_output_akhir` ENABLE KEYS */;


-- Dumping structure for table db_jst_revisi.bobot_hiden_output_awal
DROP TABLE IF EXISTS `bobot_hiden_output_awal`;
CREATE TABLE IF NOT EXISTS `bobot_hiden_output_awal` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `w1` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.bobot_hiden_output_awal: 4 rows
/*!40000 ALTER TABLE `bobot_hiden_output_awal` DISABLE KEYS */;
REPLACE INTO `bobot_hiden_output_awal` (`id`, `w1`) VALUES
	(2, 0),
	(1, 0),
	(3, 0),
	(4, 0);
/*!40000 ALTER TABLE `bobot_hiden_output_awal` ENABLE KEYS */;


-- Dumping structure for table db_jst_revisi.bobot_input_hidden_akhir
DROP TABLE IF EXISTS `bobot_input_hidden_akhir`;
CREATE TABLE IF NOT EXISTS `bobot_input_hidden_akhir` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `v1` double DEFAULT '0',
  `v2` double DEFAULT '0',
  `v3` double DEFAULT '0',
  `v4` double DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.bobot_input_hidden_akhir: 3 rows
/*!40000 ALTER TABLE `bobot_input_hidden_akhir` DISABLE KEYS */;
REPLACE INTO `bobot_input_hidden_akhir` (`id`, `v1`, `v2`, `v3`, `v4`) VALUES
	(1, 0, 0, 0, 0),
	(2, 0, 0, 0, 0),
	(3, 0, 0, 0, 0);
/*!40000 ALTER TABLE `bobot_input_hidden_akhir` ENABLE KEYS */;


-- Dumping structure for table db_jst_revisi.bobot_input_hidden_awal
DROP TABLE IF EXISTS `bobot_input_hidden_awal`;
CREATE TABLE IF NOT EXISTS `bobot_input_hidden_awal` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `v1` double DEFAULT '0',
  `v2` double DEFAULT '0',
  `v3` double DEFAULT '0',
  `v4` double DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.bobot_input_hidden_awal: 3 rows
/*!40000 ALTER TABLE `bobot_input_hidden_awal` DISABLE KEYS */;
REPLACE INTO `bobot_input_hidden_awal` (`id`, `v1`, `v2`, `v3`, `v4`) VALUES
	(1, 0, 0, 0, 0),
	(2, 0, 0, 0, 0),
	(3, 0, 0, 0, 0);
/*!40000 ALTER TABLE `bobot_input_hidden_awal` ENABLE KEYS */;


-- Dumping structure for table db_jst_revisi.data_rule
DROP TABLE IF EXISTS `data_rule`;
CREATE TABLE IF NOT EXISTS `data_rule` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `rule_raport` double DEFAULT NULL,
  `rule_un` double DEFAULT NULL,
  `rule_wawancara` double DEFAULT NULL,
  `target` int(4) DEFAULT NULL,
  `output` int(4) DEFAULT NULL,
  `hasil` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=95 DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.data_rule: 0 rows
/*!40000 ALTER TABLE `data_rule` DISABLE KEYS */;
REPLACE INTO `data_rule` (`id`, `rule_raport`, `rule_un`, `rule_wawancara`, `target`, `output`, `hasil`) VALUES
	(1, 0, 0, 0, 0, 0, 'Belum diuji'),
	(2, 0, 0, 0.33, 0, 0, 'Belum diuji'),
	(3, 0, 0, 0.67, 0, 0, 'Belum diuji'),
	(4, 0, 0, 1, 0, 0, 'Belum diuji'),
	(5, 0, 0.33, 0, 0, 0, 'Belum diuji'),
	(6, 0, 0.67, 0, 0, 0, 'Belum diuji'),
	(7, 0, 1, 0, 0, 0, 'Belum diuji'),
	(8, 0, 0.33, 0.33, 0, 0, 'Belum diuji'),
	(9, 0, 0.33, 0.67, 0, 0, 'Belum diuji'),
	(10, 0, 0.33, 1, 0, 0, 'Belum diuji'),
	(11, 0, 0.67, 0.33, 0, 0, 'Belum diuji'),
	(12, 0, 0.67, 0.67, 0, 0, 'Belum diuji'),
	(13, 0, 0.67, 1, 0, 0, 'Belum diuji'),
	(14, 0, 1, 0.33, 0, 0, 'Belum diuji'),
	(15, 0, 1, 0.67, 0, 0, 'Belum diuji'),
	(16, 0, 1, 1, 1, 0, 'Belum diuji'),
	(17, 0.33, 0.33, 0, 0, 0, 'Belum diuji'),
	(18, 0.33, 0.33, 0.33, 0, 0, 'Belum diuji'),
	(19, 0.33, 0.33, 0.67, 0, 0, 'Belum diuji'),
	(20, 0.33, 0.33, 1, 0, 0, 'Belum diuji'),
	(21, 0.33, 0, 0.33, 0, 0, 'Belum diuji'),
	(22, 0.33, 0.67, 0.33, 0, 0, 'Belum diuji'),
	(23, 0.33, 1, 0.33, 0, 0, 'Belum diuji'),
	(24, 0.33, 0, 0, 0, 0, 'Belum diuji'),
	(25, 0.33, 0, 0.67, 0, 0, 'Belum diuji'),
	(26, 0.33, 0, 1, 0, 0, 'Belum diuji'),
	(27, 0.33, 0.67, 0, 0, 0, 'Belum diuji'),
	(28, 0.33, 0.67, 0.67, 0, 0, 'Belum diuji'),
	(29, 0.33, 0.67, 1, 1, 0, 'Belum diuji'),
	(30, 0.33, 1, 0, 0, 0, 'Belum diuji'),
	(31, 0.33, 1, 0.67, 1, 0, 'Belum diuji'),
	(33, 0.67, 0.67, 0, 0, 0, 'Belum diuji'),
	(34, 0.67, 0.67, 0.33, 0, 0, 'Belum diuji'),
	(35, 0.67, 0.67, 0.67, 1, 0, 'Belum diuji'),
	(36, 0.67, 0.67, 1, 1, 0, 'Belum diuji'),
	(37, 0.67, 0, 0.67, 0, 0, 'Belum diuji'),
	(38, 0.67, 0.33, 0.67, 0, 0, 'Belum diuji'),
	(39, 0.67, 1, 0.67, 1, 0, 'Belum diuji'),
	(40, 0.67, 0, 0, 0, 0, 'Belum diuji'),
	(41, 0.67, 0, 0.33, 0, 0, 'Belum diuji'),
	(42, 0.67, 0, 1, 0, 0, 'Belum diuji'),
	(43, 0.67, 0.33, 0, 0, 0, 'Belum diuji'),
	(44, 0.67, 0.33, 0.33, 0, 0, 'Belum diuji'),
	(45, 0.67, 0.33, 1, 1, 0, 'Belum diuji'),
	(46, 0.67, 1, 0, 0, 0, 'Belum diuji'),
	(47, 0.67, 1, 0.33, 1, 0, 'Belum diuji'),
	(48, 0.67, 1, 1, 1, 0, 'Belum diuji'),
	(49, 1, 1, 0, 1, 0, 'Belum diuji'),
	(50, 1, 1, 0.33, 1, 0, 'Belum diuji'),
	(51, 1, 1, 0.67, 1, 0, 'Belum diuji'),
	(52, 1, 0, 1, 1, 0, 'Belum diuji'),
	(53, 1, 0.33, 1, 1, 0, 'Belum diuji'),
	(54, 1, 0.67, 1, 1, 0, 'Belum diuji'),
	(55, 1, 0, 0, 0, 0, 'Belum diuji'),
	(56, 1, 0, 0.33, 0, 0, 'Belum diuji'),
	(57, 1, 0, 0.67, 0, 0, 'Belum diuji'),
	(58, 1, 0.33, 0, 0, 0, 'Belum diuji'),
	(59, 1, 0.33, 0.33, 0, 0, 'Belum diuji'),
	(60, 1, 0.33, 0.67, 1, 0, 'Belum diuji'),
	(61, 1, 0.67, 0, 0, 0, 'Belum diuji'),
	(62, 1, 0.67, 0.33, 1, 0, 'Belum diuji'),
	(63, 1, 0.67, 0.67, 1, 0, 'Belum diuji'),
	(64, 1, 1, 1, 1, 0, 'Belum diuji'),
	(32, 0.33, 1, 1, 1, 0, 'Belum diuji');
/*!40000 ALTER TABLE `data_rule` ENABLE KEYS */;


-- Dumping structure for table db_jst_revisi.data_sample
DROP TABLE IF EXISTS `data_sample`;
CREATE TABLE IF NOT EXISTS `data_sample` (
  `id_koresponden` varchar(20) NOT NULL,
  `nilai_raport` double(5,2) DEFAULT '0.00',
  `nilai_un` double(3,2) DEFAULT '0.00',
  `nilai_wawancara` double(3,2) DEFAULT '0.00',
  `nilai_akhir` double(15,2) DEFAULT '0.00',
  `sigmoid_raport` double(3,2) DEFAULT '0.00',
  `sigmoid_un` double(3,2) DEFAULT '0.00',
  `sigmoid_wawancara` double(3,2) DEFAULT '0.00',
  `output` int(4) DEFAULT '0',
  `hasil` varchar(50) DEFAULT '',
  PRIMARY KEY (`id_koresponden`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.data_sample: 100 rows
/*!40000 ALTER TABLE `data_sample` DISABLE KEYS */;
REPLACE INTO `data_sample` (`id_koresponden`, `nilai_raport`, `nilai_un`, `nilai_wawancara`, `nilai_akhir`, `sigmoid_raport`, `sigmoid_un`, `sigmoid_wawancara`, `output`, `hasil`) VALUES
	('1358947582506', 8.44, 8.36, 8.00, 8.27, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947591947', 8.33, 8.01, 8.00, 8.11, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947602627', 8.36, 8.40, 8.00, 8.25, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947617826', 8.21, 8.35, 8.00, 8.19, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947627069', 8.24, 8.36, 8.00, 8.20, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947640429', 7.78, 7.68, 8.00, 7.82, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947671192', 7.86, 7.66, 8.00, 7.84, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947685081', 7.65, 7.36, 8.00, 7.67, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947693707', 7.35, 7.36, 8.00, 7.57, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947705017', 7.36, 7.44, 8.00, 7.60, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947745168', 7.68, 7.66, 7.80, 7.71, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947779278', 7.36, 7.46, 7.80, 7.54, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947788587', 7.66, 7.34, 7.80, 7.60, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947798492', 7.33, 7.69, 7.80, 7.61, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947822466', 7.36, 7.86, 7.80, 7.67, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947864107', 7.35, 7.33, 7.80, 7.49, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947872298', 7.21, 7.23, 7.80, 7.41, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947882019', 7.23, 7.65, 7.80, 7.56, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947893682', 7.36, 7.24, 7.80, 7.47, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947905207', 7.02, 7.03, 7.80, 7.28, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358947930982', 6.78, 6.45, 7.80, 7.01, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948164176', 7.35, 7.64, 7.50, 7.50, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948175097', 7.30, 7.90, 7.60, 7.60, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948193896', 6.80, 6.75, 7.50, 7.02, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948214047', 6.80, 6.75, 7.50, 7.02, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948222233', 6.66, 6.89, 7.50, 7.02, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948253361', 6.75, 6.89, 7.50, 7.05, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948299650', 6.50, 6.80, 8.00, 7.10, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948316956', 6.50, 6.90, 7.80, 7.07, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948353156', 6.33, 6.89, 7.80, 7.01, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948389008', 6.66, 6.78, 7.80, 7.08, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948403038', 6.66, 6.78, 7.80, 7.08, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948426321', 7.33, 7.45, 7.50, 7.43, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948434969', 7.66, 7.34, 7.50, 7.50, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948443713', 7.36, 7.33, 7.50, 7.40, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948452394', 7.36, 7.86, 7.80, 7.67, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948461024', 7.36, 7.59, 7.80, 7.58, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948471023', 7.36, 7.66, 7.80, 7.61, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948503213', 7.33, 7.34, 7.50, 7.39, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948513261', 7.68, 7.34, 7.50, 7.51, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948529002', 7.54, 6.98, 7.80, 7.44, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948562830', 7.68, 7.45, 7.50, 7.54, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948579928', 7.60, 6.84, 7.50, 7.31, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948593112', 7.36, 7.34, 7.50, 7.40, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948615316', 7.33, 7.34, 7.50, 7.39, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948622558', 7.36, 7.45, 8.00, 7.60, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948629957', 7.36, 7.50, 8.00, 7.62, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948639639', 6.90, 7.30, 8.00, 7.40, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948647497', 7.33, 6.80, 8.00, 7.38, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948655941', 7.30, 7.32, 7.50, 7.37, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948695257', 6.21, 6.21, 7.50, 6.64, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948711847', 6.58, 6.00, 7.00, 6.52, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948736178', 6.33, 6.46, 7.00, 6.60, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948759324', 6.34, 6.00, 7.50, 6.61, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948786421', 6.23, 6.33, 7.00, 6.52, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948799766', 6.66, 5.78, 7.00, 6.48, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948814669', 6.80, 6.00, 7.00, 6.66, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948826672', 6.35, 6.12, 7.50, 6.62, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948846008', 6.34, 6.21, 7.50, 6.68, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948891892', 6.34, 6.21, 7.50, 6.68, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948903593', 6.34, 6.21, 7.00, 6.52, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948912897', 6.36, 6.45, 7.00, 6.60, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948936672', 6.21, 5.90, 7.00, 6.37, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948948622', 6.50, 6.21, 7.00, 6.57, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948955586', 6.66, 5.90, 7.00, 6.52, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948965088', 6.67, 6.66, 7.00, 6.78, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948973022', 6.35, 6.35, 7.00, 6.57, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948981303', 6.66, 6.35, 7.00, 6.67, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358948989668', 6.31, 6.24, 7.50, 6.68, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949006218', 6.34, 6.24, 7.00, 6.53, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949054027', 6.34, 6.21, 7.00, 6.52, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949062659', 6.33, 6.21, 7.50, 6.68, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949083281', 6.31, 6.34, 7.00, 6.55, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949093183', 6.20, 5.80, 7.80, 6.60, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949103294', 5.80, 5.90, 7.00, 6.23, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949114975', 6.00, 5.98, 7.00, 6.33, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949151031', 6.33, 6.00, 7.00, 6.44, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949157735', 6.34, 6.21, 7.00, 6.52, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949175690', 6.34, 5.80, 7.00, 6.38, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949184998', 6.60, 5.90, 7.00, 6.50, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949194168', 6.34, 6.35, 7.00, 6.56, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949204458', 6.24, 5.90, 7.00, 6.38, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949217010', 6.04, 6.08, 7.00, 6.37, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949223906', 6.34, 6.35, 7.00, 6.56, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949231625', 6.21, 6.20, 7.00, 6.47, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949243493', 6.25, 5.80, 7.00, 6.35, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949252978', 6.23, 5.68, 7.00, 6.30, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949264255', 6.21, 5.60, 7.00, 6.27, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949278988', 6.21, 5.89, 7.00, 6.37, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949291571', 6.31, 6.24, 7.00, 6.52, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949329869', 6.21, 6.24, 7.00, 6.48, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949336650', 6.25, 6.21, 7.00, 6.49, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949343708', 6.30, 6.58, 7.00, 6.63, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949351326', 6.34, 6.34, 7.00, 6.56, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949358151', 6.21, 6.35, 7.00, 6.52, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949372334', 6.24, 6.38, 7.00, 6.54, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949381626', 6.23, 5.90, 7.00, 6.38, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949390834', 6.21, 6.58, 7.00, 6.60, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949400234', 6.50, 6.50, 7.00, 6.67, 0.00, 0.00, 0.00, 0, 'Belum diuji'),
	('1358949407411', 6.34, 6.50, 7.00, 6.61, 0.00, 0.00, 0.00, 0, 'Belum diuji');
/*!40000 ALTER TABLE `data_sample` ENABLE KEYS */;


-- Dumping structure for table db_jst_revisi.data_uji_coba
DROP TABLE IF EXISTS `data_uji_coba`;
CREATE TABLE IF NOT EXISTS `data_uji_coba` (
  `id_koresponden` varchar(20) NOT NULL,
  `nilai_raport` double(5,2) DEFAULT '0.00',
  `nilai_un` double(3,2) DEFAULT '0.00',
  `nilai_wawancara` double(3,2) DEFAULT '0.00',
  `nilai_akhir` double(15,2) DEFAULT '0.00',
  `sigmoid_raport` double(3,2) DEFAULT '0.00',
  `sigmoid_un` double(3,2) DEFAULT '0.00',
  `sigmoid_wawancara` double(3,2) DEFAULT '0.00',
  `output` tinyint(4) DEFAULT '0',
  `hasil` varchar(50) DEFAULT 'belum di uji',
  PRIMARY KEY (`id_koresponden`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.data_uji_coba: 0 rows
/*!40000 ALTER TABLE `data_uji_coba` DISABLE KEYS */;
REPLACE INTO `data_uji_coba` (`id_koresponden`, `nilai_raport`, `nilai_un`, `nilai_wawancara`, `nilai_akhir`, `sigmoid_raport`, `sigmoid_un`, `sigmoid_wawancara`, `output`, `hasil`) VALUES
	('1360336440334', 8.00, 8.00, 8.00, 8.00, 1.00, 1.00, 1.00, 1, 'Tinggi'),
	('1360336447231', 9.00, 8.00, 9.00, 8.67, 1.00, 1.00, 1.00, 1, 'Tinggi'),
	('1360336454225', 7.65, 7.68, 7.60, 7.64, 0.97, 0.98, 0.92, 1, 'Tinggi'),
	('1360336462466', 9.00, 9.00, 6.00, 8.00, 1.00, 1.00, 0.00, 1, 'Tinggi'),
	('1360336470964', 5.00, 9.00, 9.00, 7.67, 0.00, 1.00, 1.00, 1, 'Tinggi'),
	('1360336477888', 9.00, 5.00, 9.00, 7.67, 1.00, 0.04, 1.00, 1, 'Tinggi'),
	('1360336486755', 8.00, 5.00, 8.00, 7.00, 1.00, 0.04, 1.00, 1, 'Tinggi'),
	('1360336495716', 7.90, 5.00, 8.00, 6.97, 1.00, 0.04, 1.00, 1, 'Tinggi');
/*!40000 ALTER TABLE `data_uji_coba` ENABLE KEYS */;


-- Dumping structure for table db_jst_revisi.paramter
DROP TABLE IF EXISTS `paramter`;
CREATE TABLE IF NOT EXISTS `paramter` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `mak_epoh` int(10) DEFAULT NULL,
  `iterasi` int(10) DEFAULT NULL,
  `learning_rate` double DEFAULT NULL,
  `target_error` double DEFAULT NULL,
  `mse` double DEFAULT NULL,
  `akurasi` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table db_jst_revisi.paramter: 1 rows
/*!40000 ALTER TABLE `paramter` DISABLE KEYS */;
REPLACE INTO `paramter` (`id`, `mak_epoh`, `iterasi`, `learning_rate`, `target_error`, `mse`, `akurasi`) VALUES
	(1, 20000, 0, 0.5, 0.001, 0, 0);
/*!40000 ALTER TABLE `paramter` ENABLE KEYS */;
/*!40014 SET FOREIGN_KEY_CHECKS=1 */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
