CREATE DATABASE IF NOT EXISTS auctiondb CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS 'auctionadmin'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON `auctiondb`.* TO `auctionadmin`@`localhost`;