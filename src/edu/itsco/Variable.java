package edu.itsco;


public class Variable {
	private String id;
	private String tipo;
	
	public Variable(String id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Variable) {
			Variable v = (Variable) obj;
			return this.id.equals(v.getId());
		}
		return false;
	}
}
