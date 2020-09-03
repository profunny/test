DROP TABLE `mailnotifier`.`user`;
CREATE TABLE `mailnotifier`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255),
  `email` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`));