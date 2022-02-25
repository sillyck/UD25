DROP TABLE IF EXISTS Peliculas;
DROP TABLE IF EXISTS Salas;
CREATE TABLE Peliculas(
id INT NOT NULL AUTO_INCREMENT,
nombre NVARCHAR(20),
Clasificacion_Edad INT,
PRIMARY KEY(id)
);

CREATE TABLE Salas(
id INT NOT NULL AUTO_INCREMENT,
nombre NVARCHAR(20),
Pelicula INT,
PRIMARY KEY(id),
CONSTRAINT FK_1 FOREIGN KEY (Pelicula) REFERENCES Peliculas (id)
);

INSERT INTO Peliculas (nombre, Clasificacion_Edad) VALUES ('Nombre1', 2);
INSERT INTO Peliculas (nombre, Clasificacion_Edad) VALUES ('Nombre2', 1);
INSERT INTO Peliculas (nombre, Clasificacion_Edad) VALUES ('Nombre3', 3);
INSERT INTO Salas (nombre, Pelicula) VALUES ('Sala1', 1);
INSERT INTO Salas (nombre, Pelicula) VALUES ('Sala2', 1);
INSERT INTO Salas (nombre, Pelicula) VALUES ('Sala3', 3);