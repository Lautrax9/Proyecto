-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-11-2025 a las 12:21:52
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `faltas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `licencia`
--

CREATE TABLE `licencia` (
  `cedula` varchar(50) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `licencia` varchar(50) DEFAULT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  `materia` varchar(50) DEFAULT NULL,
  `grupos` varchar(50) DEFAULT NULL,
  `turno` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `licencia`
--

INSERT INTO `licencia` (`cedula`, `nombre`, `licencia`, `fecha`, `materia`, `grupos`, `turno`) VALUES
('Alejo Moreira', 'Literatura', '9/11-15/11', 'Depresion', '1MB', '58788553', 'Mañana'),
('Franco Pereira', 'Videojuegos', '7/11/2025-5/11/2026', 'Maternal', '3MA', '45634567', 'Noche'),
('Lautaro Ocampo', 'Programacion', '7/11-12/11', 'Estudio', '3MA', '57462738', 'Mañana');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `licencia`
--
ALTER TABLE `licencia`
  ADD PRIMARY KEY (`cedula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
