DROP DATABASE IF EXISTS hospital;
CREATE DATABASE hospital;
USE hospital;

CREATE TABLE pacientes(
	id_pacientes INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (50),
    apellidos VARCHAR (80),
    ciudad VARCHAR (50),
    direccion VARCHAR (80),
    telefono VARCHAR (9),
	edad INT,
    historial VARCHAR (200)
);

CREATE TABLE medicos(
	id_medicos INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (50),
    apellidos VARCHAR (80),
    especialidad VARCHAR (200)
);

CREATE TABLE citas(
	id_citas INT AUTO_INCREMENT PRIMARY KEY,
    id_pacientes INT,
    id_medicos INT,
    fecha DATE,
    hora VARCHAR (5),
	FOREIGN KEY (id_pacientes) REFERENCES pacientes(id_pacientes),
    FOREIGN KEY (id_medicos) REFERENCES medicos(id_medicos)
);