
-- SUGESTÃO DE COMO PODEMOS FAZER AS CATEGORIAS E PRODUTOS :)

-- Ecommerces da empresa B2W
INSERT INTO produto (title, image, description, price) VALUES ('Americanas','https://terracoshopping.com.br/wp-content/uploads/2016/08/americanas.png', 'A empresa foi fundada em 1929, pelos americanos John Lee, Glen Matson, James Marshall e Batson Borger que partiram dos Estados Unidos em direção a Buenos Aires com o objetivo de abrir uma loja no estilo Five and Ten Cents (lojas que vendiam mercadorias a 5 e 10 centavos, na moeda americana). A ideia era lançar uma loja com preços baixos, no modelo que já fazia sucesso nos Estados Unidos e na Europa no início do século. No navio em que viajavam, conheceram os brasileiros Aquino Sales e Max Landesman que os convidaram para conhecer o Rio de Janeiro.',10.2);

INSERT INTO produto (title, image, description, price) VALUES ('Submarino', 'https://i.pinimg.com/originals/e8/8a/8b/e88a8b93000440b2e52c1e34d212877e.png', 'Sua história começou quando Antônio Bonchristiano (presidente), Marcelo Ballona (vice-presidente de marketing) e Flávio Jansen (diretor de tecnologia) a idealizaram criando a empresa TBL S.A. Em vez de começar do zero, e como parte do investimento inicial, compraram uma das primeiras e maiores livrarias virtuais da época, a Booknet. Adquiriam, assim, os seus ativos, a marca, o site de domínio da empresa, uma carteira de 50 mil clientes cadastrados e a experiência de trabalho de mais de quatro anos no ramo.', 5);

INSERT INTO produto (title, image, description, price) VALUES ('Shoptime', 'https://3.bp.blogspot.com/-anFbygK0In4/XYfWtSM1YaI/AAAAAAAACAI/XEXJrCYq-QcthzCwbd8Q2zVy7pApbjxhACLcBGAsYHQ/w1200-h630-p-k-no-nu/Screenshot_2019-09-22-16-54-42.png', 'O Shoptime, que está há 26 anos no mercado, é uma empresa brasileira de varejo, a marca mais multicanal do varejo, tendo como plataformas de venda um site, app, TV e catálogo online. É uma empresa brasileira, criada em 1995, como o primeiro canal de home shopping da América Latina, isto é, com foco na venda de produtos para a casa através de um canal de TV.', 5.2);

-- Ecommerces da empresa CNOVA.COM
INSERT INTO produto (title, image, description, price) VALUES ('Extra', 'http://publicoa.com.br/wp-content/uploads/2020/10/Capa-Extra.png', 'descrição...', 3.2);

INSERT INTO produto (title, image, description, price) VALUES ('Casas Bahia', 'https://www.ofertas24horas.com.br/wp-content/uploads/2016/03/Casas-Bahia.jpg', 'Descrição...', 9.2);

INSERT INTO produto (title, image, description, price) VALUES ('Ponto Frio', 'https://logodownload.org/wp-content/uploads/2014/07/pontofrio-logo-0.png', 'Descrição...', 6.4);

-- Ecomerces da empresa Magazine Luiza
INSERT INTO produto (title, image, description, price) VALUES ('Kabum', 'https://mmorpgbr.com.br/wp-content/uploads/2020/10/Kabum.jpg?x10726', 'descrição...', 4);

INSERT INTO produto (title, image, description, price) VALUES ('Magazine Luiza', 'https://fdr.com.br/wp-content/uploads/2020/07/magazine-luiza-2-970x544.jpg', 'descrição', 12);

-- Ecommerces da Empresa Amazon
INSERT INTO produto (title, image, description, price) VALUES ('Amazon', 'https://images.hindustantimes.com/tech/rf/image_size_960x540/HT/p2/2019/04/05/Pictures/books-photo-retail-store-seen-amazon-amazon_16cf7722-578e-11e9-8bc0-bee180be535f.jpg', 'Amazon.com, Inc. é uma empresa multinacional de tecnologia norte-americana com sede em Seattle, Washington. A companhia se concentra no e-commerce, computação em nuvem, streaming e inteligência artificial. É considerada uma das cinco grandes empresas de tecnologia, juntamente com Google, Apple, Microsoft e Facebook.[4] Foi referida como "uma das forças econômicas e culturais mais influentes do mundo".', 20);

-- Ecommerces da Empresa Mercado Livre
INSERT INTO produto (title, image, description, price) VALUES ('Mercado Livre', 'https://finanzero.com.br/images/uploads/2020/11/como-vender-no-mercado-livre-passo-a-passo.jpg', 'O mercado livre é uma empresa argentina de tecnologia que oferece soluções de comércio eletrônico para que pessoas e empresas possam comprar, vender, pagar, anunciar e enviar produtos por meio da internet. Opera em 18 países, tem cerca de 30 mil funcionários e é o site de e-commerce mais popular da América Latina em número de visitantes.[4] A empresa mantém operações na Argentina, Bolívia, Brasil, Chile, Colômbia, Costa Rica, Equador, El Salvador, Guatemala, Honduras, México, Nicarágua, Panamá, Paraguai, Peru, República Dominicana, Uruguai e Venezuela.[5] Até 2016, o MercadoLivre contava com 174,2 milhões de usuários na América Latina.[6]', 9.2);



INSERT INTO categoria (name) VALUES ('B2W');
INSERT INTO categoria (name) VALUES ('Mercado Livre');
INSERT INTO categoria (name) VALUES ('Amazon');
INSERT INTO categoria (name) VALUES ('CNOVA.COM');
INSERT INTO categoria (name) VALUES ('Magazine Luiza');

-- Os valores das empresas são em bilhões de reais

INSERT INTO categoria_produto (categoria_id,produto_id) VALUE (1, 1);
INSERT INTO categoria_produto (categoria_id,produto_id) VALUE (2, 3);
-- Não inseri todos so produtos nas categorias ...