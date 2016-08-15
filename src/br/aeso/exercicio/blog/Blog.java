package br.aeso.exercicio.blog;

import java.util.ArrayList;
import java.util.Date;

import br.aeso.exercicio.mensagens.Mensagem;
import br.aeso.exercicio.usuario.Usuario;

public class Blog {
	private Date data;
	private Usuario Dono;
	private String Titulo;
	private ArrayList<Mensagem> mensagens;
	public Blog(Date data, Usuario dono, String titulo) {
		super();
		this.data = data;
		Dono = dono;
		Titulo = titulo;
		this.mensagens = this.listarMensagens();
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Usuario getDono() {
		return Dono;
	}
	public void setDono(Usuario dono) {
		Dono = dono;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	private ArrayList<Mensagem >listarMensagens(){
		return null;
	}
	public ArrayList<Mensagem> getMensagens() {
		return mensagens;
	}
	
	
}
