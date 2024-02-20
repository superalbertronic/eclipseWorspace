DROP DATABASE IF EXISTS hospital;
CREATE DATABASE hospital CHARACTER SET utf8mb4;
USE hospital;
CREATE TABLE paciente (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    apellidos VARCHAR(100),
    ciudad VARCHAR(100),
    direccion VARCHAR(100),
    telefono VARCHAR(100), 
    edad VARCHAR(100),
    historial VARCHAR(100)
);
CREATE TABLE medico (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100),
    especialidad VARCHAR(100)
);
CREATE TABLE cita (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    fecha VARCHAR(100) NOT NULL,
    hora VARCHAR(100) NOT NULL,
    id_paciente INT UNSIGNED NOT NULL,
    id_medico INT UNSIGNED NOT NULL,
    FOREIGN KEY (id_paciente) REFERENCES paciente (id),
    FOREIGN KEY (id_medico) REFERENCES medico (id)
);