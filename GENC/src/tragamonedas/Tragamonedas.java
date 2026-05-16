package tragamonedas;

class Tragamonedas {
	
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	

    /**
     * post: los 3 Tambores del Tragamonedas están en la posición 1.
     */
    public Tragamonedas() {     	
    	    this.tambor1 = new Tambor();
    	    this.tambor2 = new Tambor();
    	    this.tambor3 = new Tambor();
    	    
    	
    }

    /**
     * post: activa el Tragamonedas haciendo girar
     *       sus 3 Tambores.
     */
    public void activar() {
    	tambor1.girar();
    	tambor2.girar();
    	tambor3.girar();
    	
    }

    /**
     * post: indica si el Tragamonedas entrega un premio
     *       a partir de la posición de sus 3 Tambores.
     */
    public boolean entregaPremio() { 
    	 return tambor1.obtenerPosicion() == tambor2.obtenerPosicion()
    		    && tambor2.obtenerPosicion() == tambor3.obtenerPosicion();
    }

/**
     * post: obtiene la posición del iésimo tambor del Tragamonedas
       pre:  i => 0; i < n (n = cantidad de tambores)
     */
    public int obtenerPosicionDelTambor(int i) { 
    	if (i < 0 || i > 2) {
    		throw new IllegalArgumentException("El metodo solo acepta 0 =< i < 3");
    	}
    	if (i == 0) return tambor1.obtenerPosicion();
    	if (i == 1) return tambor2.obtenerPosicion();
    	return tambor3.obtenerPosicion();
   }
}

