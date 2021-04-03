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
    	// Permitir por exemplo uma �nica conex�o de banco
    	// pode ser um exemplo do uso de Singleton
    	// <<Insira o c�digo de conex�o aqui>>
    }   
    
}
