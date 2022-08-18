DROP table IF EXISTS empleados;

create table empleados(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	trabajo varchar(100),
	sueldo decimal
);

insert into empleados(nombre,apellido,trabajo)values('pepe','pepito','electricista');
insert into empleados(nombre,apellido,trabajo)values('juan','juanito','peon');
insert into empleados(nombre,apellido,trabajo)values('ana','anita','carpintero');
insert into empleados(nombre,apellido,trabajo)values('manolo','manolito','fontanero');
