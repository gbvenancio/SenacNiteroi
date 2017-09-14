package model;

import java.io.Serializable;

public class Produto implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String pdrNome;
	private Double pdrPreco;
	private Integer pdrQuantidade;
	private String pdrDescricao;
	private String pdrImg;
	
	
	
	
	public String getPdrNome() {
		return pdrNome;
	}
	public void setPdrNome(String pdrNome) {
		this.pdrNome = pdrNome;
	}
	public Double getPdrPreco() {
		return pdrPreco;
	}
	public void setPdrPreco(Double pdrPreco) {
		this.pdrPreco = pdrPreco;
	}
	public Integer getPdrQuantidade() {
		return pdrQuantidade;
	}
	public void setPdrQuantidade(Integer pdrQuantidade) {
		this.pdrQuantidade = pdrQuantidade;
	}
	public String getPdrDescricao() {
		return pdrDescricao;
	}
	public void setPdrDescricao(String pdrDescricao) {
		this.pdrDescricao = pdrDescricao;
	}
	public String getPdrImg() {
		return pdrImg;
	}
	public void setPdrImg(String pdrImg) {
		this.pdrImg = pdrImg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((pdrNome == null) ? 0 : pdrNome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		if (pdrNome == null) {
			if (other.pdrNome != null)
				return false;
		} else if (!pdrNome.equals(other.pdrNome))
			return false;
		return true;
	}
	
 
	
	                                                                                                                                                                                          
}
																				