###      Desafio-dio.me - Programação Orientada a Objetos


![Java-poo](https://gabrielaugusto.me/wp-content/uploads/2021/06/Java_Logo.png);


Esse repositório apresenta alterações realizadas no código original do desafio proposto pela Dio.me (link do repositório base: https://github.com/cami-la/desafio-poo-dio) 

### As propostas de alterações realizadas no código: 

**1°**  retirar o atributo em comum nome das classes Dev e Bootcamp e realocá-lo na classe abstrata Conteudo.
  
**2°** criação do método mostrarEvolução na classe abstrata Conteudo, sendo utilizada nas classes Dev, Bootcamp, Mentoria e Curso com a proposta de Polimorfismo de método nestas classes.


    
 :computer: Na classe Dev o método mostrarEvolução irá ser acionada em função do método progredir; sendo assim, confere a evolução em XP do aluno do   bootcamp conforme vai progredindo no curso; </br>
 :computer:  Na classe Bootcamp o método mostrarEvolução mostra se há a inserção de devs inscritos no Bootcamp; </br>
 :computer: Na classe Curso o método mostrarEvolução mostra a evolução da instância de um curso em relação a inserção de uma carga horária não nula. </br>
 :computer: Na classe Mentoria o método mostrarEvolução garante que os atributos título e descrição sejam instânciados não nulos.



