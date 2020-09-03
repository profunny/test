ALTER TABLE `mailnotifier`.`user`
    ADD COLUMN `status` VARCHAR(255) NULL AFTER `email`;