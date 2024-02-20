DROP DATABASE IF EXISTS hospital;
CREATE DATABASE hospital;
USE hospital;

CREATE TABLE pacientes(
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(30),
apellidos VARCHAR(50),
ciudad VARCHAR(20),
direccion VARCHAR(50),
telefono INT,
edad INT, 
historial VARCHAR(100));


CREATE TABLE medicos(
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(30),
apellidos VARCHAR(50),
especialidad VARCHAR(30));

CREATE TABLE citas(
id INT AUTO_INCREMENT PRIMAhospitalRY KEY,
id_paciente INT,
id_medico INT,
fecha DATE, 
hora DOUBLE,
FOREIGN KEY (id_paciente) REFERENCES pacientes(id),
FOREIGN KEY (id_medico) REFERENCES medicos(id));

