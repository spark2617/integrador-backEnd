<<<<<<< HEAD
-- AQUI TEMOS O SEEDING DE DADOS

INSERT INTO categoria (nome, email, cpf, datacadastro) VALUES ('java', 'sugando meu sabado', 'cansei', 'quero viver');

INSERT INTO produto (rua, numero, bairro, cidade, cep, estado) VALUES ('agora', 'foi', 'preciso', 'ser', 'felix', 'bye');

INSERT INTO paciente_endereco (paciente_id, endereco_id) VALUES (1, 1);
=======
-- PI DE BACKEND
INSERT INTO produtos (title, image, description, price) VALUES ('SmarTv Samsung 50', '', 'Tv smart de 50 polegadas, 4K', 2399.99);
INSERT INTO produtos (title, image, description, price) VALUES ('SmarTv LG 55', '', 'Tv smart de 55 polegadas, 4K', 2878.99);
INSERT INTO produtos (title, image, description, price) VALUES ('SmarTv Samsung 55', '', 'Tv smart de 55 polegadas, 4K', 2999.99);
INSERT INTO produtos (title, image, description, price) VALUES ('SmarTv LG 50', '', 'Tv smart de 50 polegadas, 4K', 2199.99);
INSERT INTO produtos (title, image, description, price) VALUES ('SmarTv TCL 50', '', 'Tv smart de 50 polegadas, 4K', 1999.99);

INSERT INTO produtos (title, image, description, price) VALUES ('Samsung Galaxy S22 Ultra', '', 'Android 12 MIUI 4.0, Quadcamera com 100mpx...', 7999.99);
INSERT INTO produtos (title, image, description, price) VALUES ('Iphone 13 Pro Max', '', 'IOS 15, touchId, Quadcamera com 100mpx...', 8999.99);
INSERT INTO produtos (title, image, description, price) VALUES ('Samsung Galaxy S21 Ultra', '', 'Android 12 MIUI 4.0, Quadcamera com 80mpx...', 5999.99);
INSERT INTO produtos (title, image, description, price) VALUES ('Iphone 13 Pro Max', '', 'IOS 15, touchId, Quadcamera com 100mpx...', 6099.99);
INSERT INTO produtos (title, image, description, price) VALUES ('Xiaomi 12S Ultra', '', 'Android 12 MIUI 13, camera principal de 50,7mpx...', 4999.99);

INSERT INTO produtos (title, image, description, price) VALUES ('O homem mais rico da Babilônia ', '', 'O livro é baseado nas antigas práticas de sucesso dos babilônicos…', 16.89);
INSERT INTO produtos (title, image, description, price) VALUES ('Watchmen – Edição Definitiva', '', 'Uma edição primorosa que não pode faltar na estante de nenhum…', 99.90);
INSERT INTO produtos (title, image, description, price) VALUES ('É Assim que Acaba', '', 'O romance mais pessoal da carreira de Colleen Hoover, É assim que…', 31.90);
INSERT INTO produtos (title, image, description, price) VALUES ('Mulheres que correm com os lobos', '', 'A analista junguiana Clarissa Pinkola Estés acredita que na nossa…', 39.90);
INSERT INTO produtos (title, image, description, price) VALUES ('A garota do lago', '', 'Summit Lake, uma pequena cidade entre montanhas, é esse tipo de lugar, bucólico e com encantadoras casas dispostas à beira de um longo trecho de água intocada...', 9.90);

INSERT INTO produtos (title, image, description, price) VALUES ('Elden Ring – Bandai Namco', '', ' Em Elden Ring, o jogador incorpora um Maculado, guerreiro guiado pela força da Graça para portar o poder do Anel Prístino e torna-se um Lorde ...', 249.99);
INSERT INTO produtos (title, image, description, price) VALUES ('Pokémon Legends: Arceus – Nintendo', '', 'Faz parte da oitava geração da série de jogos eletrônicos Pokémon e serve como uma prequela para os jogos eletrônicos de RPG do Nintendo DS, Pokémon Diamond e Pearl, de 2006. ', 399.90);
INSERT INTO produtos (title, image, description, price) VALUES ('Horizon II: Forbidden West – Sony (Corp);', '', 'Horizon Forbidden West é um jogo eletrônico de RPG de ação com uma perspectiva em terceira pessoa. Os jogadores controlam Aloy, uma caçadora em um mundo governado por máquinas. O jogo apresenta um mundo aberto ambientado numa Califórnia pós-apocalíptica.', 240.99);
INSERT INTO produtos (title, image, description, price) VALUES ('Gran Turismo 7 – Sony (Corp);', '', 'Gran Turismo 7 é um jogo eletrônico de corrida desenvolvido pela Polyphony Digital e publicado pela Sony Interactive Entertainment. É o oitavo título da linha principal da série Gran Turismo. ', 193.50);
INSERT INTO produtos (title, image, description, price) VALUES ('Call of Duty: Vanguard – Activision Blizzard ( Corp);', '', 'A história de Call of Duty: Vanguard acompanha as operações de um grupo especializado chamado Força-Tarefa Um, ou Vanguard, em uma missão secreta para impedir um plano dos nazistas que poderia levá-los à vitória.', 374.89);

INSERT INTO categoria (name) VALUES ('SmarTv');
INSERT INTO categoria (name) VALUES ('SmartPhone');
INSERT INTO categoria (name) VALUES ('Livros');
INSERT INTO categoria (name) VALUES ('Games');

INSERT INTO category_products (category_id, products_id) VALUES (1, 1);
INSERT INTO category_products (category_id, products_id) VALUES (1, 2);
INSERT INTO category_products (category_id, products_id) VALUES (1, 3);
INSERT INTO category_products (category_id, products_id) VALUES (1, 4);
INSERT INTO category_products (category_id, products_id) VALUES (1, 5);

INSERT INTO category_products (category_id, products_id) VALUES (2, 6);
INSERT INTO category_products (category_id, products_id) VALUES (2, 7);
INSERT INTO category_products (category_id, products_id) VALUES (2, 8);
INSERT INTO category_products (category_id, products_id) VALUES (2, 9);
INSERT INTO category_products (category_id, products_id) VALUES (2, 10);

INSERT INTO category_products (category_id, products_id) VALUES (3, 11);
INSERT INTO category_products (category_id, products_id) VALUES (3, 12);
INSERT INTO category_products (category_id, products_id) VALUES (3, 13);
INSERT INTO category_products (category_id, products_id) VALUES (3, 14);
INSERT INTO category_products (category_id, products_id) VALUES (3, 15);

INSERT INTO category_products (category_id, products_id) VALUES (4, 16);
INSERT INTO category_products (category_id, products_id) VALUES (4, 17);
INSERT INTO category_products (category_id, products_id) VALUES (4, 18);
INSERT INTO category_products (category_id, products_id) VALUES (4, 19);
INSERT INTO category_products (category_id, products_id) VALUES (4, 20);
>>>>>>> b0242ab37230f273e8ef81e70e039736d29b094f
