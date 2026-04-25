import java.util.logging.Logger;
public class Main{
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args){
        logger.info(">> SISTEMA: Módulo de carga inicializado.");
        
        // Simulación de proceso
        try{
            ejecutarCargaCritica();
        } catch(Exception e){
            logger.log(java.util.logging.Level.SEVERE, ">> FALLO CRÍTICO: La carga de datos colapsó.", e);
        }
        
        logger.info(">> SISTEMA: Proceso finalizado o abortado.");
    }
    private static void ejecutarCargaCritica() throws Exception{
        throw new Exception(">> EXCEPCIÓN: Nodo de almacenamiento no responde.");
    }
}
