package br.aeso.exercicio.mensagens;

import java.util.Date;

import br.aeso.exercicio.usuario.Usuario;

public class Comentario extends Mensagem{
    private Usuario usuario;

	public Comentario(int codigo, String titulo, String conteudo, Date data) {
		super(codigo, titulo, conteudo, data);
		// TODO Auto-generated constructor stub
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
