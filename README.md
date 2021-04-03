# Singleton
CLASSE SINGLETON
getSingletonInstance
Método estático ("static") é um método que pode
ser invocado sem a necessidade de criar um objeto  

Por que a classe é final?  => Para evitar herança 
Por que o construtor é private? => para evitar criação de objetos (com "new")
Por que criar o método getSingletonInstance()? => Para criar o objeto na própria classe

CLASSE PROGRAMA

Por que, no exemplo, foram criados "sing1" e "sing2"?
=> para verificar que está devolvendo o mesmo objeto

Qual é a relação entre o Singleton e o princípio da Responsabilidade Única (SRP)?
=> O singleton viola esse princípio porque ele nunca está sozinho ...
