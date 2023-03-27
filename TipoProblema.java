private class TipoProblema{
    
    private String descripcion;
   
    /*
     * 
     */
    public TipoProblema(){
        descripcion = "";
        
    }
    /*
     * 
     */
    public void leer(){

    }
    /*
     * 
     */
    public void imprimir(){
        
    }
    public TipoProblema(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Métodos de acceso
    public String getDescripcion() {
        return this.descripcion;
    }
}