create table categoria (id integer not null auto_increment, cpf varchar(255), datacadastro date, email varchar(255), nome varchar(255), primary key (id)) engine=InnoDB;
create table categoria_produto (categoria_id integer not null, produto_id integer not null, primary key (categoria_id, produto_id)) engine=InnoDB;
create table produto (id integer not null auto_increment, bairro varchar(255), cep varchar(255), cidade varchar(255), estado varchar(255), numero varchar(255), rua varchar(255), primary key (id)) engine=InnoDB;
alter table categoria_produto add constraint FK3ew6ukf9clnmigm07tvtx4b6o foreign key (produto_id) references produto (id);
alter table categoria_produto add constraint FKhs0w91lfxf2oyx2602gvhlu88 foreign key (categoria_id) references categoria (id);
INSERT INTO categoria (nome, email, cpf, datacadastro) VALUES ('java', 'sugando meu sabado', 'cansei', 'quero viver');
INSERT INTO produto (rua, numero, bairro, cidade, cep, estado) VALUES ('agora', 'foi', 'preciso', 'ser', 'felix', 'bye');
INSERT INTO paciente_endereco (paciente_id, endereco_id) VALUES (1, 1);
