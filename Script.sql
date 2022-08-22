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
VALUES('Laura','Segreda','Elizondo','1','laura.segreda@gmail.com','123','San José','Alajuelita','Concepción','Urb Vista Real');
VALUES('Maria','Perez','Lopez','2','mlopez@gmail.com','123','San José','Aserrí','Poás','Centro');


/*Se llama al mismo método para agregar nuevos clientes o admins*/

CREATE TABLE `restaurante`.`carrito` (`id_carrito` INT NOT NULL AUTO_INCREMENT, `id_cliente` INT NOT NULL, PRIMARY KEY (`id_carrito`),
foreign key fk_carrito_cliente (id_cliente) references cliente(id_cliente) )
ENGINE = innoDB;

