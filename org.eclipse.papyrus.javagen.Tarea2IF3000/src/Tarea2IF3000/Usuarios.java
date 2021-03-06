// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package Tarea2IF3000;

/************************************************************/
/**
 * 
 */
public abstract class Usuarios {
 
	protected Autor autor; 
    protected Bibliotecario bibliotecario;
    protected Usuario usuario;
  
    public Usuarios(String nombreUnico, String contraseña, String nombre, String tipoIdentificacion, int identificacion) {
    	this.nombreUnico = nombreUnico;
        this.contraseña = contraseña;
        this.nombre=nombre;
        this.tipoIdentificacion=tipoIdentificacion;
        this.identificacion=identificacion;
    	
    	
    }
	 
	public String getNombreUnico() {
		return nombreUnico;
	}
	public void setNombreUnico(String nombreUnico) {
		this.nombreUnico = nombreUnico;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	private String nombreUnico;
	/**
	 * 
	 */
	private String contraseña;
	/**
	 * 
	 */
	private String nombre;
	/**
	 * 
	 */
	private String tipoIdentificacion;
	/**
	 * 
	 */
	private int identificacion;
};
