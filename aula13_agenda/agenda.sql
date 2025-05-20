JDBC ==> Java DataBase Connectivity

[Driver]

Novo Projeto --> Agenda

Contatos
	id : int
nome : String
email : String
telefone : String 
dt_nasc : LocalDate

BD Relacional (MySQL, Postgres, Oracle, SQL Server ...)

- tabela (linhas x colunas)

CRUD 
  CREATE (INSERT)
  READ   (SELECT)
  UPDATE (UPDATE)
  DELETE (DELETE)

1- Conectar no mysql
2- Criar um banco de dados

  CREATE DATABASE agenda;

3- Conectar no banco de dados agenda
  CONNECT agenda;

4- Criar a tabela contato

  CREATE TABLE contato(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL UNIQUE,
	telefone VARCHAR(11) NOT NULL,
	dt_nasc DATE
  );
  
5- Verificar a estrutura da tabela contato
 DESC contato;

6- Operações de CRUD
 GRAVAR UM CONTATO
 
INSERT INTO contato 
(nome, email, telefone, dt_nasc) VALUES
('Juca', 'juca@email.com', '11123456789', '2025/05/20');

INSERT INTO contato 
(nome, email, telefone, dt_nasc) VALUES
('ana', 'ana@email.com', '11123456789', '2000/05/20');

INSERT INTO contato 
(nome, email, telefone, dt_nasc) VALUES
('pedro', 'pedro@email.com', '11123456789', '2025/05/20');

INSERT INTO contato 
(nome, email, telefone, dt_nasc) VALUES
('pedro', 'pedroca@email.com', '11123456789', '2025/05/20');


FORMATO PARA DATAS ==> YYYY/MM/DD

CONSULTAR UM CONTATO
SELECT * FROM contato;
SELECT nome, email FROM contato;

SELECT * FROM contato WHERE nome = 'Ana';

SELECT nome, email FROM contato 
WHERE nome = 'Juca' OR nome = 'Ana';

******APAGAR UM contato*******
DELETE FROM contato;

DELETE FROM contato WHERE nome = 'pedro';

DELETE FROM contato WHERE nome = 'pedro@email.com';

ALTERAR UM CONTATO
UPDATE contato
SET nome = 'Pedro Albuquerque'
WHERE id = 10;

UPDATE contato
SET email = 'ana@email.com'
WHERE id = 10;