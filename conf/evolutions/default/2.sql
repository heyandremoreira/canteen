# --- !Ups

#CANTEEN_TABLE
INSERT INTO `canteen_app`.`canteen` (`name`, `description`, `address`) VALUES ('Arconia', 'Travel the world sitting on a chair. Taste food from every country', '225 W 86th St, New York, NY 10024, United States');
INSERT INTO `canteen_app`.`canteen` (`name`, `description`, `address`) VALUES ('The Last Drop', 'Eat your favorite barbecue in a warm and peaceful environment', 'The Lame, Zaun, Piltover');
INSERT INTO `canteen_app`.`canteen` (`name`, `description`, `address`) VALUES ('The Leaky Cauldron', 'Rustic and magical atmosphere with traditional Portuguese dishes', 'Diagon Alley, Strand, London WC2N 5HF, United Kingdom');
INSERT INTO `canteen_app`.`canteen` (`name`, `description`, `address`) VALUES ('Waverly Sub Station', 'Setting inspired by a subway station with a specialty in sandwiches', '159 W 10th St, New York, NY 10014, United States');

#MENU_TABLE
INSERT INTO `canteen_app`.`menu` (`id`,`date`, `canteen_id`) VALUES (1,'2023-01-20', '1');
INSERT INTO `canteen_app`. `menu` (`id`,`date`,`canteen_id`) VALUES (2,'2023-01-21', 1);
INSERT INTO `canteen_app`. `menu` (`id`,`date`,`canteen_id`) VALUES (3,'2023-01-21', 2);


#DISH_TABLE
INSERT INTO `canteen_app`.`dish` (`id`,`name`, `description`, `type`, `value`, `menu_id`, `dish_quantity`) VALUES (NULL,'Carbonara', 'Spaghetti with cow meat, bacon and whipping cream', 'Meat', '4.20', 1, 10000);
INSERT INTO `canteen_app`.`dish` (`id`,`name`,`description`,`type`, `value`, `menu_id`, `dish_quantity`) VALUES (NULL,'Bacalhau à Brás','Codfish with straw-potato, egg, parsley','Fish', '4', 1, 10000);
INSERT INTO `canteen_app`.`dish` (`id`,`name`,`description`,`type`, `value`, `menu_id`, `dish_quantity`) VALUES (NULL,'Quiche de Legumes','Broken pasta with spinach, corn, broccoli and cherry tomato','Vegetarian', '5.3', 1, 10000);


#ROLE_TABLE


#TICKET_TABLE