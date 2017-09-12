DROP TABLE professor_turmas IF EXISTS;
DROP TABLE professores IF EXISTS;
DROP TABLE turmas IF EXISTS;
DROP TABLE disciplinas IF EXISTS;
DROP TABLE curriculos IF EXISTS;
DROP TABLE types IF EXISTS;
DROP TABLE cursos IF EXISTS;



CREATE TABLE professores (
  id         INTEGER IDENTITY PRIMARY KEY,
  first_name VARCHAR(30),
  habilitacao  VARCHAR(30)
);
CREATE INDEX professores_habilitacao ON professores (habilitacao);

CREATE TABLE turmas (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(80)
);
CREATE INDEX turmas_name ON turmas (name);

CREATE TABLE professor_turmas (
  professor_id       INTEGER NOT NULL,
  turma_id INTEGER NOT NULL
);
ALTER TABLE professor_turmas ADD CONSTRAINT fk_professor_turmas_professores FOREIGN KEY (professor_id) REFERENCES professores (id);
ALTER TABLE professor_turmas ADD CONSTRAINT fk_professor_turmas_turmas FOREIGN KEY (turma_id) REFERENCES turmas (id);

CREATE TABLE types (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(80)
);
CREATE INDEX types_name ON types (name);

CREATE TABLE cursos (
  id         INTEGER IDENTITY PRIMARY KEY,
  tipo VARCHAR(30),
  name  VARCHAR_IGNORECASE(80),
  habilitacao    VARCHAR(80),
  descricao       CLOB,
  periodos  INTEGER
);
CREATE INDEX cursos_name ON cursos (name);

CREATE TABLE curriculos (
  id         INTEGER IDENTITY PRIMARY KEY,
  name       VARCHAR(30),
  vigencia_date DATE,
  type_id    INTEGER NOT NULL,
  curso_id   INTEGER NOT NULL
);
ALTER TABLE curriculos ADD CONSTRAINT fk_curriculos_cursos FOREIGN KEY (curso_id) REFERENCES cursos (id);
ALTER TABLE curriculos ADD CONSTRAINT fk_curriculos_types FOREIGN KEY (type_id) REFERENCES types (id);
CREATE INDEX curriculos_name ON curriculos (name);


CREATE TABLE disciplinas (
  id          INTEGER IDENTITY PRIMARY KEY,
  curriculo_id      INTEGER NOT NULL,
  disciplina_date  DATE,
  description VARCHAR(255)
);
ALTER TABLE disciplinas ADD CONSTRAINT fk_disciplinas_curriculos FOREIGN KEY (curriculo_id) REFERENCES curriculos (id);
CREATE INDEX disciplinas_curriculo_id ON disciplinas (curriculo_id);
