CREATE DATABASE `inventory` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category_name` varchar(45) NOT NULL,
  `created_on` datetime NOT NULL,
  `created_by` varchar(45) NOT NULL,
  `modified_on` datetime DEFAULT NULL,
  `modified_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `inventory`.`category`
(`id`,
`category_name`,
`created_on`,
`created_by`,
`modified_on`,
`modified_by`)
VALUES
(<{id: }>,
<{category_name: }>,
<{created_on: }>,
<{created_by: }>,
<{modified_on: }>,
<{modified_by: }>);
CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(45) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone` varchar(45) NOT NULL,
  `gstNo` varchar(45) DEFAULT NULL,
  `created_on` datetime NOT NULL,
  `modified_on` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `inventory`.`customer`
(`id`,
`customer_name`,
`address`,
`phone`,
`gstNo`,
`created_on`,
`modified_on`)
VALUES
(<{id: }>,
<{customer_name: }>,
<{address: }>,
<{phone: }>,
<{gstNo: }>,
<{created_on: }>,
<{modified_on: }>);
CREATE TABLE `product` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `quantity` int NOT NULL,
  `selling_price` decimal(10,0) NOT NULL,
  `cost_price` decimal(10,0) NOT NULL,
  `profit` decimal(10,0) DEFAULT NULL,
  `gst_rate` int NOT NULL,
  `category_id` int DEFAULT NULL,
  `supplier_id` int DEFAULT NULL,
  `created_on` datetime NOT NULL,
  `created_by` varchar(45) NOT NULL,
  `modified_on` datetime DEFAULT NULL,
  `modified_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  UNIQUE KEY `product_id_UNIQUE` (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6800 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `inventory`.`product`
(`product_id`,
`product_name`,
`description`,
`quantity`,
`selling_price`,
`cost_price`,
`profit`,
`gst_rate`,
`category_id`,
`supplier_id`,
`created_on`,
`created_by`,
`modified_on`,
`modified_by`)
VALUES
(<{product_id: }>,
<{product_name: }>,
<{description: }>,
<{quantity: }>,
<{selling_price: }>,
<{cost_price: }>,
<{profit: }>,
<{gst_rate: }>,
<{category_id: }>,
<{supplier_id: }>,
<{created_on: }>,
<{created_by: }>,
<{modified_on: }>,
<{modified_by: }>);
CREATE TABLE `supplier` (
  `id` int NOT NULL,
  `companyname` varchar(45) NOT NULL,
  `lastdatesupplied` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `inventory`.`supplier`
(`id`,
`companyname`,
`lastdatesupplied`)
VALUES
(<{id: }>,
<{companyname: }>,
<{lastdatesupplied: }>);
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `created_on` datetime NOT NULL,
  `created_by` varchar(45) NOT NULL,
  `modified_on` varchar(45) DEFAULT NULL,
  `modified_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `inventory`.`user`
(`user_id`,
`user_name`,
`password`,
`created_on`,
`created_by`,
`modified_on`,
`modified_by`)
VALUES
(<{user_id: }>,
<{user_name: }>,
<{password: }>,
<{created_on: }>,
<{created_by: }>,
<{modified_on: }>,
<{modified_by: }>);
