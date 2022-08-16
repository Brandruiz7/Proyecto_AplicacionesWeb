CREATE SCHEMA `Restaurante`;
/* Crear un usuario */
CREATE USER 'Usuario' @'%' IDENTIFIED BY 'palabra_clave';

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

CREATE TABLE `restaurante`.`usuario` (`id_usuario` INT NOT NULL AUTO_INCREMENT, `username` VARCHAR(50) NOT NULL, `password` VARCHAR(50) NOT NULL,
`id_cliente` INT NULL, `id_rol` INT NOT NULL, PRIMARY KEY (`id_usuario`), 
foreign key fk_usuario_rol (id_rol) references rol(id_rol)  )
ENGINE = innoDB;

INSERT INTO `restaurante`.`usuario` (`username`, `password`, `id_rol`) VALUES ('Brandon Ruiz', '123', '1');
INSERT INTO `restaurante`.`usuario` (`username`, `password`, `id_cliente`, `id_rol`) VALUES ('Laura Segreda', '123', '1', '1');
INSERT INTO `restaurante`.`usuario` (`username`, `password`, `id_cliente`, `id_rol`) VALUES ('Brandon Vindas', '123', '2', '2');


CREATE TABLE `restaurante`.`carrito` (`id_carrito` INT NOT NULL AUTO_INCREMENT, `id_cliente` INT NOT NULL, PRIMARY KEY (`id_carrito`),
foreign key fk_carrito_cliente (id_cliente) references cliente(id_cliente) )
ENGINE = innoDB;