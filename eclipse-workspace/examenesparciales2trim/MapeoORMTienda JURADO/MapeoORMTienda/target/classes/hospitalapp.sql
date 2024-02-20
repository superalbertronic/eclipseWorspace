-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-02-2024 a las 11:15:00
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hospotalapp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `id` int(11) NOT NULL,
  `id_paciente` int(11) DEFAULT NULL,
  `id_medico` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`id`, `id_paciente`, `id_medico`, `fecha`, `hora`) VALUES
(8, 19, 16, '2024-02-08', '12:00:00'),
(9, 20, 17, '2024-02-08', '10:00:00'),
(10, 21, 18, '2024-02-10', '11:30:00'),
(11, 22, 19, '2024-02-08', '10:00:00'),
(12, 23, 20, '2024-02-10', '11:30:00'),
(13, 24, 21, '2024-02-08', '10:00:00'),
(14, 25, 22, '2024-02-10', '11:30:00'),
(15, 26, 23, '2024-02-08', '10:00:00'),
(16, 27, 24, '2024-02-10', '11:30:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicos`
--

CREATE TABLE `medicos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `especialidad` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `medicos`
--

INSERT INTO `medicos` (`id`, `nombre`, `apellidos`, `especialidad`) VALUES
(16, 'Paco', 'Nuevos Apellidos', 'Nueva Especialidad'),
(17, 'Dr. Pérez', 'González', 'Cardiología'),
(18, 'Dra. Martínez', 'Fernández', 'Dermatología'),
(19, 'Dr. Pérez', 'González', 'Cardiología'),
(20, 'Dra. Martínez', 'Fernández', 'Dermatología'),
(21, 'Dr. Pérez', 'González', 'Cardiología'),
(22, 'Dra. Martínez', 'Fernández', 'Dermatología'),
(23, 'Dr. Elde', 'González', 'Cardiología'),
(24, 'Dra. Elde', 'Fernández', 'Dermatología');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `historial` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`id`, `nombre`, `apellidos`, `ciudad`, `direccion`, `telefono`, `edad`, `historial`) VALUES
(19, 'Paco', 'Nuevos Apellidos', 'Nueva Ciudad', 'Avenida Diagonal 456', '987654321', 25, 'Historial médico disponible'),
(20, 'Juan', 'García', 'Madrid', 'Calle Mayor 123', '123456789', 30, 'Sin historial'),
(21, 'María', 'López', 'Barcelona', 'Avenida Diagonal 456', '987654321', 25, 'Historial médico disponible'),
(22, 'Juan', 'García', 'Madrid', 'Calle Mayor 123', '123456789', 30, 'Sin historial'),
(23, 'María', 'López', 'Barcelona', 'Avenida Diagonal 456', '987654321', 25, 'Historial médico disponible'),
(24, 'Juan', 'García', 'Madrid', 'Calle Mayor 123', '123456789', 30, 'Sin historial'),
(25, 'María', 'López', 'Barcelona', 'Avenida Diagonal 456', '987654321', 25, 'Historial médico disponible'),
(26, 'Elde', 'García', 'Madrid', 'Calle Mayor 123', '123456789', 30, 'Sin historial'),
(27, 'Elde', 'López', 'Barcelona', 'Avenida Diagonal 456', '987654321', 25, 'Historial médico disponible');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_paciente` (`id_paciente`),
  ADD KEY `id_medico` (`id_medico`);

--
-- Indices de la tabla `medicos`
--
ALTER TABLE `medicos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `medicos`
--
ALTER TABLE `medicos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `citas_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `pacientes` (`id`),
  ADD CONSTRAINT `citas_ibfk_2` FOREIGN KEY (`id_medico`) REFERENCES `medicos` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
