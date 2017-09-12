INSERT INTO professores VALUES (1, 'Aline', 'Mestre');
INSERT INTO professores VALUES (2, 'Augusto', 'Doutor');
INSERT INTO professores VALUES (3, 'Marcus', 'Especialista');
INSERT INTO professores VALUES (4, 'Mauricio', 'Bacharel');
INSERT INTO professores VALUES (5, 'Nayara', 'Mestre');
INSERT INTO professores VALUES (6, 'José', 'Doutor');

INSERT INTO turmas VALUES (1, 'T101');
INSERT INTO turmas VALUES (2, 'T102');
INSERT INTO turmas VALUES (3, 'T103');

INSERT INTO professor_turmas VALUES (2, 1);
INSERT INTO professor_turmas VALUES (3, 2);
INSERT INTO professor_turmas VALUES (3, 3);
INSERT INTO professor_turmas VALUES (4, 2);
INSERT INTO professor_turmas VALUES (5, 1);

INSERT INTO types VALUES (1, 'Presencial');
INSERT INTO types VALUES (2, 'À Distância');


INSERT INTO cursos VALUES (1, 'Graduação', 'Sistemas de Informação', 'Bacharel em Sistemas de Informação', 'O Curso de Sistemas de Informação tem por objetivo formar um bacharel capaz de compreender, desenvolver, utilizar e adaptar tecnologias da informação, atuando de maneira ética, social e humana. Ele irá assegurar às organizações as informações e os sistemas necessários para prover suporte às operações e obter vantagem competitiva. Estará ainda apto a inovar, planejar e gerenciar a infraestrutura de tecnologia da informação em organizações, bem como desenvolver e evoluir sistemas de informação para uso em processos organizacionais, departamentais e/ou individuais.', '8');
INSERT INTO cursos VALUES (2, 'Tecnólogo', 'Logística', 'Tecnólogo em Logística', 'Durante a formação, o estudante irá adquirir embasamento teórico nas áreas administrativa e gerencial, com foco em organizações empresariais no setor de logística. Além disso, terá acesso a conhecimentos específicos nas áreas de gestão de estoques, suprimentos e distribuição e de logística integrada. Na disciplina Projetos de Pesquisa em Logística, os alunos desenvolverão projetos em organizações, buscando observar e discutir as práticas de logística, abordando situações reais e uma visão integrada da cadeia de suprimento.', '4');
INSERT INTO cursos VALUES (3, 'Mestrado', 'Informática', 'Mestre em Informática', 'O objetivo é formar profissionais qualificados, capazes de contribuir para o desenvolvimento da área de Tecnologia da Informação em Minas Gerais e no Brasil, bem como atuar como docentes em instituições de ensino superior ou prosseguir seus estudos em cursos de doutorado.', '4');
INSERT INTO cursos VALUES (4, 'Doutorado', 'Direito', 'Doutor em Direito', 'Investigar o sentido, o significado e as implicações do Estado Democrático de Direito no Brasil.', '6');
INSERT INTO cursos VALUES (5, 'MBA', 'Gestão de Pessoas', 'Especialista em Gestão de Pessoas', 'A Gestão de Pessoas vem sendo reconhecida como uma das principais fontes de vantagem competitiva das organizações. Tal reconhecimento é decorrente de uma percepção cada vez mais completa e integrada acerca do que consiste, de fato, a natureza e, por decorrência, os processos necessários, da “gestão” das organizações. Atuando num mercado em constante mudança e alta competição, as organizações precisam se preparar para consolidar seus diferenciais frente à concorrência. A crescente complexidade do conhecimento, as novas configurações organizacionais e as modificações das relações entre as empresas e os trabalhadores têm demandado dos gestores novos papéis, processos e posturas além de novas competências. ', '3');
INSERT INTO cursos VALUES (6, 'Especialização', 'Arquitetura de Software Distribuído', 'Especialista em Arquitetura de Software Distribuído', 'O curso foi concebido de modo a buscar o preenchimento de uma lacuna na formação avançada dos profissionais de informática que atuam na concepção, construção e implantação de sistemas de informação que usam aspectos de arquitetura de software distribuído. O curso justifica-se pela crescente adoção de tecnologias e padrões baseados na Internet, pela demanda por aplicações em dispositivos móveis bem como pela necessidade de armazenamento, processamento e integração de grandes volumes de informação que têm incentivado a proliferação de sistemas de informação desenvolvidos em arquiteturas distribuídas. Em particular, destacam-se o crescimento da demanda por aplicações móveis, o fenômeno da computação em nuvem (cloud computing), o uso da Arquitetura Orientada a Microsserviços, as diversas alternativas para integração de aplicações e novas arquiteturas para tratamento do conceito de Big Data.', '3');
INSERT INTO cursos VALUES (7, 'Graduação', 'Administração', 'Bacharel em Administração', 'No Curso de Administração, você se prepara para resolver problemas organizacionais com capacidade técnica, gerenciando recursos, processos e informações e coordenando equipes multidisciplinares, para a adequada gestão dos negócios e desenvolvimento das organizações. Destacam-se no curso palestras, empresa júnior e laboratório de mercado de capitais; empresa simulada; estágio curricular supervisionado e trabalho de conclusão de curso; projetos de pesquisa e projetos de extensão.', '8');
INSERT INTO cursos VALUES (8, 'Tecnólogo', 'Gestão Financeira', 'Tecnólogo em Gestão Financeira', 'O Curso de Graduação Tecnológica em Gestão Financeira, com duração de dois anos, permite ao aluno adquirir embasamento teórico nas áreas administrativa e gerencial, com foco em organizações empresariais. Aborda conhecimentos específicos na área de finanças e disciplinas aplicadas, nas quais os alunos desenvolverão projetos práticos de finanças em organizações, buscando observar e discutir situações reais e desenvolver uma visão integrada e holística.', '4');
INSERT INTO cursos VALUES (9, 'MBA', 'Gestão de Projetos', 'Especialista em Gestão de Projetos', 'Com a redução do ciclo de vida dos produtos e dos serviços, aumenta-se a complexidade e o volume dos projetos das organizações, o que tem gerado uma grande demanda por profissionais que dominem técnicas e ferramentas de gerenciamento aplicadas a projetos. São essas novas competências desenvolvidas por esses profissionais, que apoiadas em filosofias de trabalho adequadas, garantirão níveis de excelência na administração de custos, níveis de desempenho elevados, equipes de alta-performance integradas. ', '3');
INSERT INTO cursos VALUES (10, 'Graduação', 'Engenharia Civil', 'Bacharel em Engenharia Civil', 'O Curso de Engenharia Civil fornece ao bacharel uma formação em conteúdos básicos e técnicos, associados também a conhecimentos das áreas sociais e econômicas. Essa combinação torna-o capaz de se inserir num mercado de trabalho cada vez mais competitivo e globalizado. O conteúdo do curso contempla ainda as várias áreas de atuação do engenheiro civil, que projeta e constrói edifícios, rodovias, ferrovias, pontes, viadutos, túneis, aeroportos, portos, canais, barragens, além de obras de captação e abastecimento, drenagem, irrigação, saneamento urbano e rural. Os destaques do curso são os laboratórios, os programas de iniciação científica, incluindo o PET Civil, as visitas técnicas e os projetos de extensão.', '10');

INSERT INTO curriculos VALUES (1, 'Curriculo I', '2012-07-01', 1, 1);
INSERT INTO curriculos VALUES (2, 'Curriculo I', '2012-08-06', 2, 2);
INSERT INTO curriculos VALUES (3, 'Curriculo II', '2011-04-17', 1, 2);
INSERT INTO curriculos VALUES (4, 'Curriculo I', '2010-03-07', 1, 3);
INSERT INTO curriculos VALUES (5, 'Curriculo I', '2010-11-30', 1, 4);
INSERT INTO curriculos VALUES (6, 'Curriculo I', '2010-01-20', 2, 5);
INSERT INTO curriculos VALUES (7, 'Curriculo I', '2012-09-04', 1, 6);
INSERT INTO curriculos VALUES (8, 'Curriculo II', '2012-09-04', 2, 6);
INSERT INTO curriculos VALUES (9, 'Curriculo I', '2011-08-06', 1, 7);
INSERT INTO curriculos VALUES (10, 'Curriculo I', '2010-02-24', 1, 8);
INSERT INTO curriculos VALUES (11, 'Curriculo I', '2010-03-09', 1, 9);
INSERT INTO curriculos VALUES (12, 'Curriculo II', '2010-06-24', 2, 9);
INSERT INTO curriculos VALUES (13, 'Curriculo I', '2012-06-08', 1, 10);

INSERT INTO disciplinas VALUES (1, 1, '2012-07-01', 'ALGORITMOS E TÉCNICAS DE PROGRAMAÇÃO');
INSERT INTO disciplinas VALUES (2, 1, '2012-07-01', 'FUNDAMENTOS MATEMÁTICOS PARA COMPUTAÇÃO');
INSERT INTO disciplinas VALUES (3, 1, '2012-07-01', 'INTRODUÇÃO À COMPUTAÇÃO');
INSERT INTO disciplinas VALUES (4, 1, '2012-07-01', 'LABORATÓRIO DE ALGORITMOS E TÉCNICAS DE PROGRAMAÇÃO');

INSERT INTO disciplinas VALUES (5, 2, '2012-08-06', 'GESTÃO DE PROCESSOS E PROJETOS');
INSERT INTO disciplinas VALUES (6, 2, '2012-08-06', 'INTERPRETAÇÃO E ANÁLISE DE DADOS');
INSERT INTO disciplinas VALUES (7, 2, '2012-08-06', 'INTRODUÇÃO À LOGÍSTICA EMPRESARIAL');
INSERT INTO disciplinas VALUES (8, 2, '2012-08-06', 'MODELOS DE GESTÃO');

INSERT INTO disciplinas VALUES (9, 3, '2011-04-17', 'ECONOMIA');
INSERT INTO disciplinas VALUES (10, 3, '2011-04-17', 'INTERPRETAÇÃO E ANÁLISE DE DADOS');
INSERT INTO disciplinas VALUES (11, 3, '2011-04-17', 'GESTÃO DE CUSTOS');
INSERT INTO disciplinas VALUES (12, 3, '2011-04-17', 'MODELOS DE GESTÃO');

INSERT INTO disciplinas VALUES (13, 4, '2010-03-07', 'FUNDAMENTOS TÉORICOS DA COMPUTAÇÃO');
INSERT INTO disciplinas VALUES (14, 4, '2010-03-07', 'ARQUITETURA DE COMPUTADORES');
INSERT INTO disciplinas VALUES (15, 4, '2010-03-07', 'PROJETO E ANALISE DE ALGORITIMOS');
INSERT INTO disciplinas VALUES (16, 4, '2010-03-07', 'MÉTODOS QUANTITATIVOS DA CIÊNCIA DA COMPUTAÇÃO');

INSERT INTO disciplinas VALUES (17, 5, '2010-11-30', 'CRIMINOLOGIA CRÍTICA');
INSERT INTO disciplinas VALUES (18, 5, '2010-11-30', 'DIREITO DE FAMÍLIA E PSICANÁLISE');
INSERT INTO disciplinas VALUES (19, 5, '2010-11-30', 'DIREITO PENAL E POLÍTICAS PÚBLICAS');
INSERT INTO disciplinas VALUES (20, 5, '2010-11-30', 'FILOSOFIA DO DIREITO');

INSERT INTO disciplinas VALUES (21, 6, '2010-01-20', 'CUSTOS EM GESTÃO DE PESSOAS');
INSERT INTO disciplinas VALUES (22, 6, '2010-01-20', 'GESTÃO DE PROCESSOS');
INSERT INTO disciplinas VALUES (23, 6, '2010-01-20', 'GESTÃO DE PESSOAS E ESTRATÉGIAS COMPETITIVAS');
INSERT INTO disciplinas VALUES (24, 6, '2010-01-20', 'INDICADORES EM GESTÃO DE PESSOAS');

INSERT INTO disciplinas VALUES (25, 7, '2012-09-04', 'PRINCÍPIOS DE ARQUITETURA DE SOFTWARE');
INSERT INTO disciplinas VALUES (26, 7, '2012-09-04', 'ARQUITETURA DE SOFTWARE JEE');
INSERT INTO disciplinas VALUES (27, 7, '2012-09-04', 'ARQUITETURA DE FRONT-END');
INSERT INTO disciplinas VALUES (28, 7, '2012-09-04', 'ARQUITETURA DE BACK-END');

INSERT INTO disciplinas VALUES (29, 8, '2012-09-04', 'PRINCÍPIOS DE ARQUITETURA DE SOFTWARE');
INSERT INTO disciplinas VALUES (30, 8, '2012-09-04', 'ARQUITETURA DE SOFTWARE .NET');
INSERT INTO disciplinas VALUES (31, 8, '2012-09-04', 'ARQUITETURA DE COMPUTAÇÃO NA NUVEM');
INSERT INTO disciplinas VALUES (32, 8, '2012-09-04', 'ARQUITETURA PARA BIG DATA');

INSERT INTO disciplinas VALUES (33, 9, '2011-08-06', 'INTRODUÇÃO À ADMINISTRAÇÃO');
INSERT INTO disciplinas VALUES (34, 9, '2011-08-06', 'INTRODUÇÃO A MACROECONOMIA');
INSERT INTO disciplinas VALUES (35, 9, '2011-08-06', 'TEORIAS DA ADMINISTRAÇÃO');
INSERT INTO disciplinas VALUES (36, 9, '2011-08-06', 'GESTÃO DE CUSTOS');

INSERT INTO disciplinas VALUES (37, 10, '2010-02-24', 'CONTABILIDADE');
INSERT INTO disciplinas VALUES (38, 10, '2010-02-24', 'INTERPRETAÇÃO E ANÁLISE DE DADOS');
INSERT INTO disciplinas VALUES (39, 10, '2010-02-24', 'ANÁLISE DAS DEMONSTRAÇÕES FINANCEIRAS');
INSERT INTO disciplinas VALUES (40, 10, '2010-02-24', 'ECONOMIA');

INSERT INTO disciplinas VALUES (41, 11, '2010-03-09', 'DESENVOLVIMENTO DE COMPETÊNCIAS GERENCIAIS');
INSERT INTO disciplinas VALUES (42, 11, '2010-03-09', 'GERENCIAMENTO DE ESCOPO');
INSERT INTO disciplinas VALUES (43, 11, '2010-03-09', 'GERENCIAMENTO DE CUSTO');
INSERT INTO disciplinas VALUES (44, 11, '2010-03-09', 'GERENCIAMENTO DE RISCOS');

INSERT INTO disciplinas VALUES (45, 12, '2010-06-24', 'FUDAMENTOS DE GERECIMENTO DE PROJETOS');
INSERT INTO disciplinas VALUES (46, 12, '2010-06-24', 'GERENCIAMENTO DE TEMPO');
INSERT INTO disciplinas VALUES (47, 12, '2010-06-24', 'ESCRITÓRIO DE PROJETOS');
INSERT INTO disciplinas VALUES (48, 12, '2010-06-24', 'GESTÃO INTEGRADA DE UM PROJETO');

INSERT INTO disciplinas VALUES (49, 13, '2012-06-08', 'CÁLCULO');
INSERT INTO disciplinas VALUES (50, 13, '2012-06-08', 'DESENHO AUXILIADO POR COMPUTADOR');
INSERT INTO disciplinas VALUES (51, 13, '2012-06-08', 'ESTRUTURAS DE CONCRETO');
INSERT INTO disciplinas VALUES (52, 13, '2012-06-08', 'PONTES');