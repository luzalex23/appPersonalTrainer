create table tb_endereco(
	id serial constraint pk_id_endereco primary key,
	estado varchar(12),
	cidade varchar(50),
	bairro varchar(50),
	logradouro varchar(100),
	cep varchar(10)
);
create table tb_personal(
	id serial constraint pk_id_personal primary key,
	endereco bigint,
	nome varchar(100),
	email varchar(100),
	telefone varchar(15),
	foreign key (endereco) references tb_endereco (id)	
);
