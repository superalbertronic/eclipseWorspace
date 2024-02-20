DROP DATABASE IF EXISTS hospitalapp;

CREATE DATABASE hospitalapp;

USE hospitalapp;

CREATE TABLE pacientes (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(30),
apellidos VARCHAR(50),
ciudad VARCHAR(30),
direccion VARCHAR(100),
telefono VARCHAR(15),
edad INT,
historial VARCHAR(100)
);

CREATE TABLE medicos (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(30),
apellidos VARCHAR(50),
especialidad VARCHAR(50)
);

CREATE TABLE citas (
id INT AUTO_INCREMENT PRIMARY KEY,
id_paciente INT,
id_medico INT,
fecha DATE,
hora VARCHAR(10),
FOREIGN KEY (id_paciente) REFERENCES pacientes(id),
FOREIGN KEY (id_medico) REFERENCES medicos(id)
);