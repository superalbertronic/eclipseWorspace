create database hospital_app;
use hospital_app;

CREATE TABLE pacientes(
id int auto_increment PRIMARY KEY,
nombre varchar(40),
apellidos varchar(40),
ciudad varchar(60),
direccion varchar(60),
telefono int(9),
edad int(3),
historial varchar(60)
);

CREATE TABLE medicos(
id int auto_increment PRIMARY KEY,
nombre varchar(40),
apellidos varchar(40),
especialidad varchar(40)
);

CREATE TABLE citas(
id int auto_increment PRIMARY KEY,
id_paciente int,
id_medico int,
fecha varchar(15),
hora varchar(6)
);

-- DROP DATABASE hospital_app;
