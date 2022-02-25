DROP TABLE IF EXISTS Departamentos;
DROP TABLE IF EXISTS Empleados;

CREATE TABLE Departamentos(
id int AUTO_INCREMENT,
nombre nvarchar(100),
presupuesto int,
PRIMARY KEY(id)
);

CREATE TABLE Empleados(
id int AUTO_INCREMENT,
dni varchar(9) NOT NULL UNIQUE,
nombre nvarchar(100),
apellidos nvarchar(255),
Departamento long,
PRIMARY KEY (id),
CONSTRAINT FK_1 FOREIGN KEY (Departamento) REFERENCES Departamentos (id)
);


INSERT INTO Departamentos (nombre, presupuesto) VALUES ('Dep2', 260);
INSERT INTO Departamentos (nombre, presupuesto) VALUES ('Dep3', 550);
INSERT INTO Departamentos (nombre, presupuesto) VALUES ('Dep4', 300);

INSERT INTO Empleados (dni, nombre, apellidos, Departamento) VALUES('23456789L', 'Eloy', 'Altozano', 1);
INSERT INTO Empleados (dni, nombre, apellidos, Departamento) VALUES('66666666H', 'Jordi', 'Ribellas', 2);