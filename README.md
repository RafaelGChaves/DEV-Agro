Projeto 02 do primeiro módulo do DevInHouse Senior

O DEV-Agro é uma aplicação desenvolvida em JAVA com Spring utilizando banco de dados PostgreSQL.

Segue roteiro proposto contendo:

- A API deve possibilitar o cadastro de Empresas, Fazendas, Funcionários, Grãos.

- O cadastro de empresas deve possibilitar o registro de nome, CNPJ e endereço.<br />
Cada empresa pode ter uma ou mais propriedades rurais associadas (fazendas).<br />
Cada empresa pode ter um ou mais funcionários associados.<br />
Cada empresa pode ter um ou mais grãos associados.<br />
O CNPJ deve ser validado para estar no formato: XX.XXX.XXX/XXXX-XX.<br />

- O cadastro de fazendas deve possibilitar o registro de nome, endereço, qual grão é produzido naquela propriedade, qual o estoque inicial daquele grão naquela fazenda (em kg), e qual empresa é proprietária da fazenda.<br />
Cada fazenda pode ter apenas um grão associado.<br />
Cada fazenda pode estar associada a apenas uma empresa.<br />
Cada fazenda deve possuir um atributo para guardar a data da última colheita.<br />

- O cadastro de grãos deve possibilitar o registro de nome, empresa e tempo médio de colheita, em quantidade de dias.

- O cadastro de funcionários deve possibilitar o registro de nome, sobrenome, CPF, endereço, telefone, sexo, data de nascimento, data de contratação, e qual empresa o emprega.<br />
O CPF deve ser validado para estar no formato: XXX.XXX.XXX-XX.<br />
O telefone deve ser validado para estar no formato: (XX) XXXXXXXXX.<br />

- Na aplicação devem existir: <br />
Um endpoint para retornar a lista completa de empresas cadastradas.<br />
Um endpoint que retorna a lista de fazendas de uma empresa.<br />
Um endpoint que retorna a quantidade de fazendas de uma empresa.<br />
Um endpoint que retorna uma lista de fazendas de uma empresa, onde cada elemento da lista deve ter 3 atributos: ID da fazenda, nome da fazenda e a data prevista da próxima colheita (considerando a data da última colheita e o tempo médio de colheita do grão associado a essa fazenda).<br />
Um endpoint para registrar colheita em uma fazenda, que aumenta o estoque de grãos daquela fazenda.<br />
Um endpoint para registrar retirada de grãos de uma fazenda, que diminui o estoque de grãos daquela fazenda.<br />
Um endpoint que retorna a lista de grãos de uma empresa.<br />
Um endpoint que retorna a lista de grãos associados a uma empresa, onde cada elemento da lista deve conter: nome do grão e quantidade em estoque, ordenado de menor para maior quantidade em estoque.<br />
Um endpoint que retorna a lista de funcionários de uma empresa.<br />
Um endpoint que retorna a quantidade de funcionários de uma empresa.
