package entidades;

public class Singleton {
    private static Singleton singleton;
    
    private Singleton() {         
          System.out.println("Mensagem do construtor Singleton foi criado");
    }       
    
    public static Singleton getSingletonInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }
    public void abrirConexao() {
    	// <<Exemplo>>
    	// <<Insira o código de conexão aqui>>
    }   
    
}
