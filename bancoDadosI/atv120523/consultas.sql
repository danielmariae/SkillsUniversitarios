/* CONSULTAS A SEREM REALIZADAS:
1) Obter todos os pacientes.

2) Obter todos os fisioterapeutas.

3) Obter todos os tratamentos e seus detalhes.

4) Obter todas as sessões de um determinado paciente.

5) Obter a quantidade de tratamentos realizados por cada fisioterapeuta.

6) Obter o valor total a receber por cada fisioterapeuta.

7) Obter a média de idade dos pacientes.

8) Obter o paciente mais jovem.

9) Obter o fisioterapeuta com o maior número de tratamentos.

10) Obter as sessões não realizadas.

USANDO SUBCONSULTAS:

11) Obter todos os pacientes que possuem tratamentos em aberto.

12) Obter os fisioterapeutas que realizaram mais sessões do que a média de sessões realizadas por todos os fisioterapeutas.

13) Obter os pacientes que já realizaram todos os tratamentos disponíveis.
Obter o valor total recebido por cada fisioterapeuta, considerando apenas os tratamentos com mais de 5 sessões.
Obter as sessões realizadas pelos pacientes menores de 12 anos.
*/
SELECT * from sessao;
--

-- Questão 01.
SELECT * FROM paciente;

-- Questão 02.
SELECT * FROM fisioterapeuta;

-- Questão 03.
SELECT * FROM tratamento;

-- Questão 04: Selecionando o paciente do id 3.
SELECT sessao.* FROM sessao, tratamento, paciente WHERE sessao.tratamento = tratamento.idtratamento AND tratamento.paciente = paciente.idpaciente AND idpaciente = 3;

-- Questão 05.
SELECT fisioterapeuta.nome, count(tratamento.idtratamento) FROM fisioterapeuta, tratamento WHERE tratamento.fisioterapeuta = fisioterapeuta.idfisioterapeuta GROUP BY fisioterapeuta.idfisioterapeuta;

-- Questão 06: Inserts para fazer a soma.
UPDATE tratamento, sessao SET tratamento.valortotal = 150 WHERE tratamento.idtratamento = 1;
UPDATE tratamento, sessao SET tratamento.valortotal = 210 WHERE tratamento.idtratamento = 2;
SELECT fisioterapeuta.nome, sum(valortotal) FROM tratamento, fisioterapeuta WHERE fisioterapeuta.idfisioterapeuta = tratamento.fisioterapeuta GROUP BY fisioterapeuta;

-- Questão 07: Média de idade.
SELECT avg(paciente.idade) as 'Média de Idade' from paciente;

-- Questão 08: Paciente mais novo.
SELECT paciente.nome, min(paciente.idade) from paciente;

-- Questão 09:
INSERT INTO tratamento VALUES (6, 1, 5, '2023-05-12', 5, 190, 10);
SELECT fisioterapeuta.nome, count(tratamento.idtratamento) FROM fisioterapeuta, tratamento WHERE fisioterapeuta.idfisioterapeuta=tratamento.fisioterapeuta GROUP BY fisioterapeuta.idfisioterapeuta LIMIT 1;

-- Questão 10:
DELETE FROM sessao WHERE sessao.idsessao>=16 AND sessao.idsessao<=18;
INSERT INTO sessao VALUES (16, 6, 120, 'Não realizada', null);
INSERT INTO sessao VALUES (17, 6, 120, 'Não realizada', null);
INSERT INTO sessao VALUES (18, 6, 120, 'Não realizada', null);
SELECT * from sessao WHERE sessao.status='Não realizada';

-- Questão 11: Tratamentos com sessões ainda não realizadas.
SELECT distinct tratamento.* FROM sessao, tratamento WHERE tratamento.idtratamento = sessao.tratamento AND sessao.status='Não realizada';

-- Questão 12: 
SELECT * from ;
SELECT (sum(sessao.idsessao)/count(fisioterapeuta.idfisioterapeuta)) from sessao, fisioterapeuta;
SELECT fisioterapeuta.nome, (sum(sessao.idsessao)/count(fisioterapeuta.idfisioterapeuta)) FROM fisioterapeuta, tratamento, sessao WHERE fisioterapeuta.idfisioterapeuta = tratamento.fisioterapeuta AND tratamento.idtratamento = sessao.tratamento group by fisioterapeuta.idfisioterapeuta;
SELECT distinct fisioterapeuta.nome, avg() FROM fisioterapeuta, tratamento, sessao WHERE fisioterapeuta.idfisioterapeuta = tratamento.fisioterapeuta AND tratamento.idtratamento = sessao.tratamento ;