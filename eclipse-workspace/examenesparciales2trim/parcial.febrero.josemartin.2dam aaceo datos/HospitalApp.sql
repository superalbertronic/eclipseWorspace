-- CREATE DATABASE HospitalApp;
USE HospitalApp;
-- Crear tabla "pacientes"
CREATE TABLE pacientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    apellidos VARCHAR(255),
    ciudad VARCHAR(100),
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    edad INT,
    historial TEXT
);

-- Crear tabla "medicos"
CREATE TABLE medicos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255),
    apellidos VARCHAR(255),
    especialidad VARCHAR(100)
);

-- Crear tabla "citas"
CREATE TABLE citas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_paciente INT,
    id_medico INT,
    fecha DATE,
    hora TIME,
    FOREIGN KEY (id_paciente) REFERENCES pacientes(id),
    FOREIGN KEY (id_medico) REFERENCES medicos(id)
);
