-- Seeding de dados
INSERT INTO produto (title, image, description, price) VALUES ('Amazon', '', 'Milhões de produtos com ótimos preços. Ofertas em Livros, Eletrônicos, Moda, Games e mais. Frete Grátis com Prime.', 9.99);
INSERT INTO produto (title, image, description, price) VALUES ('Mercado Livre', '', 'Descontaço no Mercado Livre ➞ Encontre as ✓ MELHORES OFERTAS ✓ em smartphones, moda, beleza e muito mais!', 79);
INSERT INTO produto (title, image, description, price) VALUES ('Shopee', '', 'Descubra a plataforma de compras on-line Shopee. Compre em menos de 30 segundos: a qualquer hora e em qualquer lugar. Garantia Shopee | Ofertas Relâmpago.', 0.00);
INSERT INTO produto (title, image, description, price) VALUES ('KaBum', '', 'Encontre as melhores ofertas em Tecnologia e Games aqui no KaBuM!. Confira nossa linha de Hardware, Smartphones, Computadores, Eletrônicos e mais. Acesse!', 56.77);
INSERT INTO produto (title, image, description, price) VALUES ('Pichau', '', 'Os Melhores Preços do Brasil é na Pichau! Conheça nossa linha de Computadores Gamer, Cadeiras, Monitores, Placas de Vídeo, Processadores e Muito Mais.', 954.23);

INSERT INTO categoria (name) VALUES ('Loja da boa');
INSERT INTO categoria (name) VALUES ('Gamer');
INSERT INTO categoria (name) VALUES ('De Drop');
INSERT INTO categoria (name) VALUES ('Mercadola Web');
INSERT INTO categoria (name) VALUES ('Tipo Magalu');
INSERT INTO categoria (name) VALUES ('Pique o Brás');


INSERT INTO categoria_produto (categoria_id,produto_id) VALUE (1, 1);
INSERT INTO categoria_produto (categoria_id,produto_id) VALUE (2, 1);
INSERT INTO categoria_produto (categoria_id,produto_id) VALUE (3, 2);
INSERT INTO categoria_produto (categoria_id,produto_id) VALUE (4, 3);
INSERT INTO categoria_produto (categoria_id,produto_id) VALUE (5, 4);
INSERT INTO categoria_produto (categoria_id,produto_id) VALUE (6, 4);

