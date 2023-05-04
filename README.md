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

---Aula 03/05/23---

//Exemlo de um exercicio completo.

// Classe base Jogador
class Jogador {
    private String nome;
    private int idade;
    private double altura;
    private String posicao;
    private int numeroCamisa;

    // Construtor
    public Jogador(String nome, int idade, double altura, String posicao, int numeroCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    // Getters e Setters
    // ...
}

// Classes filhas que herdam de Jogador
class JogadorDeAtaque extends Jogador {
    private int ataquesConvertidos;

    // Construtor
    public JogadorDeAtaque(String nome, int idade, double altura, String posicao, int numeroCamisa, int ataquesConvertidos) {
        super(nome, idade, altura, posicao, numeroCamisa);
        this.ataquesConvertidos = ataquesConvertidos;
    }

    // Getters e Setters
    // ...
}

class JogadorDeBloqueio extends Jogador {
    private int bloqueiosEfetuados;

    // Construtor
    public JogadorDeBloqueio(String nome, int idade, double altura, String posicao, int numeroCamisa, int bloqueiosEfetuados) {
        super(nome, idade, altura, posicao, numeroCamisa);
        this.bloqueiosEfetuados = bloqueiosEfetuados;
    }

    // Getters e Setters
    // ...
}

class JogadorDeDefesa extends Jogador {
    private int defesasEfetuadas;

    // Construtor
    public JogadorDeDefesa(String nome, int idade, double altura, String posicao, int numeroCamisa, int defesasEfetuadas) {
        super(nome, idade, altura, posicao, numeroCamisa);
        this.defesasEfetuadas = defesasEfetuadas;
    }

    // Getters e Setters
    // ...
}

// Classe Time
class Time {
    private String nome;
    private ArrayList<Jogador> jogadores;

    // Construtor
    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    // Método para adicionar jogador ao time
    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    // Método para remover jogador do time
    public void removerJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }

    // Outros métodos para gerenciar jogadores e realizar ações relacionadas a partidas de vôlei
    // ...
}

// Classe principal do programa
public class Main {

    public static void main(String[] args) {

        // Criação de jogadores
        Jogador jogador1 = new JogadorDeAtaque("João", 25, 10);
        Jogador jogador2 = new JogadorDeBloqueio("Maria", 28, 5);
        Jogador jogador3 = new JogadorDeDefesa("Pedro", 23, 7);

        // Criação de instâncias de time
        Time time1 = new Time("Time A");
        Time time2 = new Time("Time B");

        // Adicionar jogadores aos times
        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);
        time2.adicionarJogador(jogador3);

        // Realizar ações relacionadas a partidas de vôlei
        // ...

        // Exemplo de acesso a informações dos jogadores
        System.out.println("Nome do jogador 1: " + jogador1.getNome());
        System.out.println("Idade do jogador 2: " + jogador2.getIdade());
        System.out.println("Número de camisa do jogador 3: " + jogador3.getNumeroCamisa());

        // Exemplo de acesso a informações dos times
        System.out.println("Nome do time 1: " + time1.getNome());
        System.out.println("Quantidade de jogadores no time 2: " + time2.getJogadores().size());
    }
}
