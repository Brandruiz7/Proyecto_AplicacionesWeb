CREATE SCHEMA `Restaurante`;
/* Crear un usuario */
CREATE USER 'Usuario' @'%' IDENTIFIED BY 'palabra_clave';

USE `Restaurante`;

/* Se asignan los priviliegios */
GRANT ALL PRIVILEGES ON Restaurante.* to 'Usuario';
flush privileges;

CREATE TABLE `Restaurante`.`Cliente` (`id_cliente` INT NOT NULL AUTO_INCREMENT, `nombre` VARCHAR(30) NOT NULL, `apellidos` VARCHAR(30) NOT NULL,
`correo` VARCHAR(30) NOT NULL , `telefono` VARCHAR(30) NOT NULL ,PRIMARY KEY (`id_cliente`))
ENGINE = innoDB;


INSERT INTO `Restaurante`.`Cliente` (`nombre`, `apellidos`, `correo`, `telefono`)
	VALUES ('Brandon', 'Ruiz', 'correo@correo.com', '2222-2222');

INSERT INTO `Restaurante`.`Cliente`  (`nombre`, `apellidos`, `correo`, `telefono`)
	VALUES ('Laura', 'Segreda', 'correo@correo.com', '2222-2222');
    
INSERT INTO `Restaurante`.`Cliente`  (`nombre`, `apellidos`, `correo`, `telefono`)
	VALUES ('Camila', 'Luna', 'correo@correo.com', '2222-2222');
    
INSERT INTO `Restaurante`.`Cliente`  (`nombre`, `apellidos`, `correo`, `telefono`)
	VALUES ('Sandy', 'Mejía', 'correo@correo.com', '2222-2222');

CREATE TABLE `restaurante`.`rol` (`id_rol` INT NOT NULL AUTO_INCREMENT, `nombre` VARCHAR(50) NOT NULL, PRIMARY KEY (`id_rol`))
ENGINE = innoDB;

INSERT INTO `restaurante`.`rol` (`id_rol`, `nombre`) VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `restaurante`.`rol` (`id_rol`, `nombre`) VALUES ('2', 'ROLE_CLIENTE');

DROP TABLE `usuario`;

CREATE TABLE `usuario` (
	id_usuario INT NOT NULL AUTO_INCREMENT, 
	username VARCHAR(50) NOT NULL,
	apellido_P VARCHAR(50) NOT NULL,
    apellido_M VARCHAR(50) NOT NULL,
	id_rol INT NOT NULL,
    correo VARCHAR(50) NOT NULL,
    password VARCHAR(10) NOT NULL,
    provincia VARCHAR(20) NOT NULL,
    canton VARCHAR(20) NOT NULL,
    distrito VARCHAR(20) NOT NULL,
    otras_Senias VARCHAR(50) NOT NULL,
	PRIMARY KEY (id_usuario), 
	foreign key fk_usuario_rol (id_rol) references rol(id_rol))
ENGINE = innoDB;

INSERT INTO `usuario` (username,apellido_P,apellido_M,id_rol,correo,password,provincia,canton,distrito,otras_Senias)
VALUES('Brandon','Ruiz','Miranda','1','brandruiz7@gmail.com','123','Cartago','La Unión','Dulce Nombre','Casa Verde');
INSERT INTO `usuario` (username,apellido_P,apellido_M,id_rol,correo,password,provincia,canton,distrito,otras_Senias)
VALUES('Laura','Segreda','Elizondo','1','laura.segreda@gmail.com','123','San José','Alajuelita','Concepción','Urb Vista Real');
INSERT INTO `usuario` (username,apellido_P,apellido_M,id_rol,correo,password,provincia,canton,distrito,otras_Senias)
VALUES('Maria','Perez','Lopez','2','mlopez@gmail.com','123','San José','Aserrí','Poás','Centro');


/*Se llama al mismo método para agregar nuevos clientes o admins*/

CREATE TABLE `restaurante`.`carrito` (`id_carrito` INT NOT NULL AUTO_INCREMENT, `id_cliente` INT NOT NULL, PRIMARY KEY (`id_carrito`),
foreign key fk_carrito_cliente (id_cliente) references cliente(id_cliente) )
ENGINE = innoDB;

CREATE TABLE `restaurante`.`menu` 
(
  id_platillo INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(70) NOT NULL,  
  categoria VARCHAR(30) NOT NULL,
  precio double,
  PRIMARY KEY (id_platillo)
)
ENGINE = InnoDB;

INSERT INTO restaurante.menu(descripcion, categoria, precio)
VALUES 
('Trio de Ceviches', 'Entradas', '6950'),
('Ceviche de Pescado', 'Entradas', '4700'),
('Ceviche Costeño', 'Entradas', '5390'),
('Ceviche de Camarón', 'Entradas', '5250'),
('Ceviche Mixto', 'Entradas', '4300'),
('Canasta de Patacones', 'Entradas', '3900'),
('Entrada de la Casa', 'Entradas', '3900'),
('Carpaccio de Res', 'Entradas', '8900'),
('Carpaccio de Salmón', 'Entradas', '11900'),
('Ensalada Especial del Chef', 'Entradas', '4600'),
('Ensalada con Salmón', 'Entradas', '5300'),
('Sopa de Pollo', 'Entradas', '5990'),
('Sopa de Mariscos', 'Entradas', '6600'),
('Olla de Carne pequeña', 'Entradas', '5200'),
('Parrillada Campesina (2 Personas)', 'Principal', '21900'),
('Parrillada campesina (4 personas)', 'Principal', '39900'),
('Parrillada Campesina Delux (4 personas)', 'Principal', '49900'),
('Surtido Criollo (2 personas)', 'Principal', '21900'),
('Surtido Criollo (4 personas)', 'Principal', '39900'),
('Parrillada de Mariscos (2 personas)', 'Principal', '21900'),
('Parrillada de Mariscos (4 personas)', 'Principal', '39900'),
('Canasta de chicharrones', 'Principal', '27900'),
('Mar y Tierra', 'Principal', '15400'),
('Lomito de Res', 'Principal', '13250'),
('Rib Eye', 'Principal', '15800'),
('Churrasco', 'Principal', '16900'),
('T-Bone', 'Principal', '17900'),
('Filet a la Calipso', 'Principal', '14900'),
('Salmón Grillado', 'Principal', '13400'),
('Pescado Entero Frito', 'Principal', '10600'),
('Pulpo Caribeño', 'Principal', '13900'),
('Arroz con Camarones', 'Principal', '6900'),
('Arroz con Pollo', 'Principal', '6200'),
('Rice ans Beans', 'Principal', '6900'),
('Casado Típico', 'Principal', '6400'),
('Chifrijo', 'Principal', '6750'),
('Meringatta de Frutos Rojos', 'Postres', '4100'),
('Torta de Crema Italiana', 'Postres', '4500'),
('Tiramisú', 'Postres', '3900'),
('Cazuela de Galleta', 'Postres', '4800'),
('Torta Capresse', 'Postres', '4500'),
('Refresco Natural', 'Bebidas', '2500'),
('Gaseosos', 'Bebidas', '1500'),
('Botella de Agua', 'Bebidas', '1000'),
('Cervezas', 'Bebidas', '2500'),
('Cocteles', 'Bebidas', '4500'),
('Nuggets con papas', 'Infantil', '3500'),
('Hamburguesa con papas', 'Infantil', '4500'),
('Pizza personal', 'Infantil', '5500');

