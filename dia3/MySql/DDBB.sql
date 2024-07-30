show databases;
create database hospital;
use hospital;
create table persona(
id int primary key auto_increment,
nombre varchar(50),
apellido1 varchar(50),
apellido2 varchar(50),
fechaNacimiento varchar(30),
direccion varchar(100),
fechaIngreso varchar(30),
identificacion varchar(20),
salario double(10,2),
edad int
);
create table pabellon(
id int primary key auto_increment,
idMedicos varchar(20),
idOficios varchar(20),
idPaciente varchar(20),
nombre varchar(30),
medicoEnfermeroCount int,
oficioVariosCount int,
pacientesCount int
);
