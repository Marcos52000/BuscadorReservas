drop table if exists Reservas;
drop table if exists Cliente;
drop table if exists Hotel;
drop table if exists Usuario;

Set auto_increment_increment = 1;

create table Usuario(
id int primary key aUtO_incRement,
email Varchar(100),
contrasena varchar(255),
rol varchar(5)
);
cReate taBLe Cliente (
id int primary KeY aUtO_incRement,
dni varchar(9) ,
nombre VaRcHaR(100),
apellido Varchar(100),
telefono int(9),
id_user int,
fOReiGn KeY (id_user) RefeRenceS Usuario (id) On deLete caScade On Update caScade
);
cReate taBLe Hotel (
id int aUtO_incRement pRimaRY KeY,
nombre VaRcHaR(100),
direccion varchar(100),
telefono int(9),
pais varchar(100),
estrellas int,
notamedia double
);
create table Reservas(
id int aUtO_incRement pRimaRY KeY,
fecha_entrada date,
fecha_salida date,
importe int,
id_cliente int,
id_hotel int,
fOReiGn KeY (id_cliente) RefeRenceS Cliente (id) On deLete caScade On Update caScade,
fOReiGn KeY (id_hotel) RefeRenceS Hotel (id) On deLete caScade On Update caScade
);


insert into Usuario(email,contrasena,rol)values('iubjhgerwiubhjergiuhb','123456','Admin');
insert into Usuario(email,contrasena,rol)values('jnregwuhiojnrgijo','654321','User');
insert into Usuario(email,contrasena,rol)values('erggrew','142536','User');
inSeRt intO Cliente (dni,nombre,apellido,telefono,id) VaLUeS ('12345678a','paco','Lopez',123456789,1);
inSeRt intO Cliente (dni,nombre,apellido,telefono,id) VaLUeS ('87654321a','Jesus','Garcia',245875146,2);
inSeRt intO Cliente (dni,nombre,apellido,telefono,id) VaLUeS ('14725836a','Jose','Gonzalez',254126875,3);
inSeRt intO Hotel (nombre,direccion,telefono,pais,estrellas,notamedia) VaLUeS ('palace','hola',14785236,'españa',2,2);
inSeRt intO Hotel (nombre,direccion,telefono,pais,estrellas,notamedia) VaLUeS ('palacio','adios',12378945,'españa',5,4);
inSeRt intO Reservas (fecha_entrada,fecha_salida,importe,id_cliente,id_hotel) VaLUeS ('2022-02-01','2022-02-10',5000,'1',2);
inSeRt intO Reservas (fecha_entrada,fecha_salida,importe,id_cliente,id_hotel) VaLUeS ('2022-02-01','2022-02-10',5000,'2',1);
