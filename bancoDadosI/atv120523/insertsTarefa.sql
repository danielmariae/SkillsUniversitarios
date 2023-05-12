
CREATE IF NOT EXISTS DATABASE clinicaFisioterapia;
USE clinicaFisioterapia;
CREATE TABLE `fisioterapeuta` (
  `idfisioterapeuta` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `quanttratamentos` int(11) DEFAULT NULL,
  `valorareceber` float DEFAULT NULL,
  PRIMARY KEY (`idfisioterapeuta`)
) ENGINE=InnoDB;

CREATE TABLE `paciente` (
  `idpaciente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `valorapagar` float DEFAULT NULL,
  PRIMARY KEY (`idpaciente`)
) ;
CREATE TABLE `tratamento` (
  `idtratamento` int(11) NOT NULL AUTO_INCREMENT,
  `fisioterapeuta` int(11) NOT NULL,
  `paciente` int(11) NOT NULL,
  `datainicio` date NOT NULL,
  `quantsessoes` int(11) DEFAULT NULL,
  `valortotal` float DEFAULT NULL,
  `valoremaberto` float DEFAULT NULL,
  PRIMARY KEY (`idtratamento`),
  KEY `ptt_idx` (`paciente`),
  KEY `ftt_idx` (`fisioterapeuta`),
  CONSTRAINT `ftt` FOREIGN KEY (`fisioterapeuta`) REFERENCES `fisioterapeuta` (`idfisioterapeuta`),
  CONSTRAINT `ptt` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`idpaciente`)
) ;
CREATE TABLE `sessao` (
  `idsessao` int(11) NOT NULL AUTO_INCREMENT,
  `tratamento` int(11) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `realizacao` date DEFAULT NULL,
  PRIMARY KEY (`idsessao`),
  KEY `ttt_idx` (`tratamento`),
  CONSTRAINT `ttt` FOREIGN KEY (`tratamento`) REFERENCES `tratamento` (`idtratamento`)
) ;


-- Inserts para a tabela de pacientes
INSERT INTO paciente (nome, cpf, idade, valorapagar) VALUES
  ('João Silva', '11111111111', 30, 0),
  ('Maria Santos', '22222222222', 45, 0),
  ('Pedro Almeida', '33333333333', 55, 0),
  ('Ana Costa', '44444444444', 28, 0),
  ('Lucas Oliveira', '55555555555', 37, 0);

-- Inserts para a tabela de fisioterapeutas
INSERT INTO fisioterapeuta (nome, cpf, quanttratamentos, valorareceber) VALUES
  ('Fernanda Lima', '11111111111', 0, 0),
  ('Carlos Ribeiro', '22222222222', 0, 0),
  ('Mariana Castro', '33333333333', 0, 0),
  ('Ricardo Mendes', '44444444444', 0, 0),
  ('Amanda Souza', '55555555555', 0, 0);

-- Inserts para a tabela de tratamentos
INSERT INTO tratamento (fisioterapeuta, paciente, datainicio, quantsessoes, valortotal, valoremaberto) VALUES
  (1, 1, '2023-01-05', 10, 0, 0),
  (2, 2, '2023-02-10', 8, 0, 0),
  (3, 3, '2023-03-15', 12, 0, 0),
  (4, 4, '2023-04-20', 6, 0, 0),
  (5, 5, '2023-05-25', 4, 0, 0);

-- Inserts para a tabela de sessões
INSERT INTO sessao (tratamento, valor, status, realizacao) VALUES
  (1, 50, 'Realizada', '2023-01-05'),
  (1, 50, 'Realizada', '2023-01-07'),
  (1, 50, 'Realizada', '2023-01-10'),
  (2, 75, 'Realizada', '2023-02-10'),
  (2, 75, 'Realizada', '2023-02-12'),
  (3, 60, 'Realizada', '2023-03-15'),
  (3, 60, 'Realizada', '2023-03-18'),
  (3, 60, 'Realizada', '2023-03-20'),
  (4, 100, 'Realizada', '2023-04-20'),
  (4, 100, 'Realizada', '2023-04-22'),
  (4, 100, 'Realizada', '2023-04-25'),
  (5, 120, 'Realizada', '2023-05-25'),
  (5, 120, 'Realizada', '2023-05-27'),
  (5, 120, 'Realizada', '2023-05-29'),
  (5, 120, 'Realizada', '2023-05-31');

