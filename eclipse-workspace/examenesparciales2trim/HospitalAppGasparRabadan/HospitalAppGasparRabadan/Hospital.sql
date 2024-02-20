-- Eliminar la base de datos si existe
DROP DATABASE IF EXISTS hospital;

-- Crear la base de datos
CREATE DATABASE hospital;

-- Usar la base de datos creada
USE hospital;

-- Crear la tabla pacientes
CREATE TABLE pacientes (
    id_paciente INT AUTO_INCREMENT PRIMARY KEY,
    nombre_paciente VARCHAR(50),
    apellidos VARCHAR(50),
    ciudad VARCHAR(50),	
    direccion VARCHAR(50),	
    telefono VARCHAR(50),
    edad INT, 
    historial VARCHAR(50)
);

-- Crear la tabla medicos
CREATE TABLE medicos (
    id_medico INT AUTO_INCREMENT PRIMARY KEY,
    nombre_medico VARCHAR(50),
    apellidos VARCHAR(50),
    especialidad VARCHAR(50),
    id_paciente INT, 
    FOREIGN KEY (id_paciente) REFERENCES pacientes(id_paciente)
);

-- Crear la tabla citas que relacionará los campos
CREATE TABLE citas (
    id_cita INT AUTO_INCREMENT PRIMARY KEY,
    id_paciente INT,
    id_medico INT,
    fecha DATE,
    hora TIME,
    FOREIGN KEY (id_paciente) REFERENCES pacientes(id_paciente),
    FOREIGN KEY (id_medico) REFERENCES medicos(id_medico)
);

