/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  SENA
 * Created: 27/03/2026
 */

-- 1. Eliminar la BD si existe

DROP DATABASE IF EXISTS usuarios_db;

-- 2. Crear la base de datos

CREATE DATABASE usuarios_db;

-- 3. Usar la BD

USE usuarios_db;

-- 4. Crear la tabla de usuarios

CREATE TABLE usuarios
(
    identificacion VARCHAR(20) PRIMARY KEY, 
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    indiceCargo INT NOT NULL,
    textoCargo VARCHAR(100) NOT NULL,
    esAdministrador BOOLEAN NOT NULL
);