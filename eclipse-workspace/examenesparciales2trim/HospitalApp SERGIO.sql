DROP DATABASE hospitalapp;

CREATE DATABASE IF NOT EXISTS hospitalapp;

USE hospitalapp;

-- Crear la tabla "pacientes"
CREATE TABLE pacientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    apellidos VARCHAR(255),
    ciudad VARCHAR(255),
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    edad INT,
    historial TEXT
);

-- Crear la tabla "medicos"
CREATE TABLE medicos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    apellidos VARCHAR(255),
    especialidad VARCHAR(255)
);

-- Crear la tabla "citas"
CREATE TABLE citas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_paciente INT,
    id_medico INT,
    fecha VARCHAR(10),
    hora VARCHAR(5),
    FOREIGN KEY (id_paciente) REFERENCES pacientes(id),
    FOREIGN KEY (id_medico) REFERENCES medicos(id)
);
