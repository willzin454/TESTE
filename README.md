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

public String getCor(){             
    return this.cor;
}

public void setCor(String cor){    (set vai sempre retornar um valor)
    this.cor = cor
    
}

// Ctrl + Shift + O = Organiza todos os imports do código.

---Aula 02/05/23---

- private
+ public ()
# protected
~ default


