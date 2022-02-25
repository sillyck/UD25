
DROP table IF EXISTS fabricantes;


create table fabricantes(
	`id` int auto_increment,
	`Nombre` nvarchar(100),
  	PRIMARY KEY (`id`)
);


DROP table IF EXISTS articulos;

create table articulos(
	`id` int auto_increment,
	`Nombre` nvarchar(100),
	`Precio` int,
	`Fabricante` int,
  	PRIMARY KEY (`id`),
      FOREIGN KEY (`Fabricante`) REFERENCES `fabricantes` (`id`)
);

insert into fabricantes (Nombre) values ('Nvidia');
insert into fabricantes (Nombre) values ('AMD');
insert into fabricantes (Nombre) values ('Intel');
insert into fabricantes (Nombre) values ('NewSkill');
insert into fabricantes (Nombre) values ('Nfortec');


insert into articulos (Nombre, Precio, Fabricante) values ('RTX 2070', 565, 1);
insert into articulos (Nombre, Precio, Fabricante) values ('i7-8700K', 465, 3);
insert into articulos (Nombre, Precio, Fabricante) values ('Kit Liquida 240', 75, 5);
insert into articulos (Nombre, Precio, Fabricante) values ('Radeon 580', 165, 2);
insert into articulos (Nombre, Precio, Fabricante) values ('Tempest', 35, 4);