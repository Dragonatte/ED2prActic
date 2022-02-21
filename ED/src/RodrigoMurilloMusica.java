public class RodrigoMurilloMusica {
	public String titulo;
	public int nMinutos;
	public String nombreHobby;
	
	public RodrigoMurilloMusica(String titulo, int nMinutos, String nombreHobby) {
		super();
		this.titulo=titulo;
		this.nMinutos=nMinutos;
		this.nombreHobby=nombreHobby;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public  String getTitulo() {
		return titulo;
	}
	
	public void setNMinutos(int nMinutos) {
		this.nMinutos=nMinutos;
	}
	
	public int getNMinutos() {
		return nMinutos;
	}
	
	public void setNombreHobby(String nombreHobby) {
		this.nombreHobby=nombreHobby;
	}
	
	public String getNombreHobby() {
		return nombreHobby;
	}
	
	private void printer() {
		for(int i=0; i<1000; i++) {
			System.out.println(nombreHobby);
		}
	}
}
