CREATE DATABASE LDNedson;
USE LDNedson;

CREATE TABLE Cliente (
    id_cliente INT PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
    endereco VARCHAR(200) NOT NULL,
    telefone VARCHAR(20) NOT NULL
);

CREATE TABLE TipoMarmita (
    id_tipo_marmita INT PRIMARY KEY NOT NULL,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(200) NOT NULL,
    preco DOUBLE NOT NULL
);

CREATE TABLE Marmita (
    id_marmita INT PRIMARY KEY NOT NULL,
    id_tipo_marmita INT NOT NULL,
    quantidade INT NOT NULL,
    FOREIGN KEY (id_tipo_marmita) REFERENCES TipoMarmita(id_tipo_marmita)
);

CREATE TABLE Pedido (
    id_pedido INT PRIMARY KEY NOT NULL,
    id_cliente INT NOT NULL,
    numero VARCHAR(20) NOT NULL,
    data DATETIME NOT NULL,
    status VARCHAR(20) NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
);

CREATE TABLE PedidoMarmita (
    id_pedido INT NOT NULL,
    id_marmita INT NOT NULL,
    PRIMARY KEY (id_pedido, id_marmita),
    FOREIGN KEY (id_pedido) REFERENCES Pedido(id_pedido),
    FOREIGN KEY (id_marmita) REFERENCES Marmita(id_marmita)
);

CREATE TABLE Entregador (
       id_entregador INT PRIMARY KEY NOT NULL, 
       nome VARCHAR(20) NOT NULL,
       placaVeiculo VARCHAR(20) NOT NULL
);

CREATE TABLE Entrega (
     id_entrega INT PRIMARY KEY NOT NULL,
     id_entregador INT NOT NULL,
     id_pedido INT NOT NULL,
     data DATETIME NOT NULL,
     status VARCHAR(40) NOT NULL,
     FOREIGN KEY (id_pedido) REFERENCES Pedido(id_pedido),
     FOREIGN KEY (id_entregador) REFERENCES Entregador(id_entregador)
);

CREATE TABLE Pagamento (
       id_pagamento INT PRIMARY KEY NOT NULL,
       id_pedido INT NOT NULL,
       formaPagamento VARCHAR(20) NOT NULL, 
       valor DOUBLE NOT NULL, 
       status VARCHAR(20) NOT NULL,
       FOREIGN KEY (id_pedido) REFERENCES Pedido(id_pedido)
);

SELECT * FROM Cliente;
INSERT INTO Cliente (id_cliente, nome, endereco, telefone) VALUES (1, "Joao Amaral", "ARSO 62", "(63)999632459");

SELECT * From TipoMarmita;
INSERT INTO TipoMarmita (id_tipo_marmita, nome, descricao, preco) VALUES (1, "Padrao", "arroz, feijao, bife e ovo", 15.00);
INSERT INTO TipoMarmita (id_tipo_marmita, nome, descricao, preco) VALUES (2, "Plus" ,"arroz, feijao, macarrao, carne e salada", 17.00);
INSERT INTO TipoMarmita (id_tipo_marmita, nome, descricao, preco) VALUES (3, "Light" ,"salada, frango grelhado, peixe e fruta", 17.00);
INSERT INTO TipoMarmita (id_tipo_marmita, nome, descricao, preco) VALUES (4, "Fit" ,"arroz integral, linhaça, carne grelhada e salada", 17.00);

SELECT * From Pedido;
INSERT INTO Pedido (id_pedido, id_cliente, numero, data, status) VALUES (1, 1, "(63)999632459", "2023-03-08", "Em producao");

SELECT * FROM Marmita;
INSERT INTO Marmita (id_marmita, id_tipo_marmita, quantidade) VALUES (1, 1, 2);

SELECT * FROM PedidoMarmita;
INSERT INTO PedidoMarmita (id_pedido, id_marmita) VALUES (1, 1);

SELECT * From Entregador;
INSERT INTO Entregador (id_entregador, nome, placaveiculo) VALUES (1, "Joao da Costa", "OTH-1512");

SELECT * FROM Entrega;
INSERT INTO Entrega (id_entrega, id_pedido, id_entregador, data, status) VALUES (1, 1, 1, "2023-03-08", "Em producao");

SELECT * FROM Pagamento;
INSERT INTO Pagamento (id_pagamento, id_pedido, formaPagamento, valor, status) VALUES (1, 1, "Pix", 30.0, "Pendente");