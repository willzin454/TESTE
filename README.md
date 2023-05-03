---Aula 30/03/23---

MVC = model view controller (arquitetura).

    visão - controle - modelo
      |        |         |
    front    back  banco de dados


Classes Entidades

    POJO = representa banco de dados  |  Banco de dados
    public class Pessoa{              |      Tb_pessoa(
        string nome;                  |          nome VARCHAR(255)
    }                                 |          )


Metodos e atributos static não funcionam sem uma instancia.

O "this" é usado quando quer usar uma variavel da mesma Java Class.

    -VISIBILIDADES-

volei jogador(){
    public cor = todos podem acessar
    private cpf = so autorizado (padrão)
    protected nome = somente da mesma familia
}

public String gat cor(){    (get )
    return this.cor;
}

public void set cor(String cor){    (set vai sermpre retornar um valor)
    this.cor = cor
}

- private
+ public
# protected
~ default
