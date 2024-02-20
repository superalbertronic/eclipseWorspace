drop database if exists hospital;
create database if not exists hospital;
use hospital;

create table if not exists Paciente(
id int auto_increment primary key not null,
nombre varchar(50) not null,
apellidos varchar(50) not null,
ciudad varchar(50) not null,
direccion varchar(75) not null,
edad int not null,
telefono int not null,
historial varchar(500) not null
);

create table if not exists Medico(
id int auto_increment primary key not null,
nombre varchar(50) not null,
apellidos varchar(50) not null,
especialidad varchar(50) not null
);

create table if not exists Cita(
id int auto_increment primary key not null,
fecha date not null,
hora varchar(50) not null
);