create database agenda;

create table contatos(

id int not null auto_increment primary key,
nome varchar (40),
email varchar(50),
telefone int,
endereco  varchar(40),
dataNascimento date)