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