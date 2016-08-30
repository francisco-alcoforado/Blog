package br.aeso.exercicio.mensagens;

import java.util.Date;

public class Mensagem {
	private int codigo;
	private String titulo;
	private String conteudo;
	private Date data;
	private TipoMensagem tipo;
	public Mensagem(int codigo, String titulo, String conteudo, Date data, TipoMensagem tipo) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.data = data;
		this.tipo = tipo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public TipoMensagem getTipo() {
		return tipo;
	}
	public void setTipo(TipoMensagem tipo) {
		this.tipo = tipo;
	}
	
}
