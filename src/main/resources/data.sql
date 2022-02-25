DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;

create TABLE almacenes(
	id int auto_increment,
	capacidad int,
	nombre varchar(100),
	PRIMARY KEY (id)
);

create table cajas(
	id int auto_increment,
	valor int,
	contenido varchar(100),
	almacen int,
	PRIMARY KEY (id),
	FOREIGN KEY (almacen) REFERENCES almacenes (id)
);

INSERT INTO almacenes (capacidad, nombre) values (100,'agua');
INSERT INTO almacenes (capacidad, nombre) values (200,'cuchillos');
INSERT INTO almacenes (capacidad, nombre) values (200,'tenedores');
INSERT INTO almacenes (capacidad, nombre) values (200,'cuchara');
INSERT INTO almacenes (capacidad, nombre) values (50,'pan');

INSERT INTO cajas (valor, contenido, almacen) values (10,'agua',1);
INSERT INTO cajas (valor, contenido, almacen) values (11,'cuchillos',2);
INSERT INTO cajas (valor, contenido, almacen) values (12,'tenedores',3);
INSERT INTO cajas (valor, contenido, almacen) values (13,'cuchara',4);
INSERT INTO cajas (valor, contenido, almacen) values (14,'pan',5);