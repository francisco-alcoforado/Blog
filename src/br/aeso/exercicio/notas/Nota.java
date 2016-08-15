package br.aeso.exercicio.notas;

import java.util.ArrayList;
import java.util.Date;

import br.aeso.exercicio.mensagens.Mensagem;
import br.aeso.exericio.comentarios.Comentario;

public class Nota extends Mensagem{
	private ArrayList<Comentario> listaComentarios;


    public Nota(int codigo, String titulo, String conteudo, Date data) {
		super(codigo, titulo, conteudo, data);
		this.listaComentarios = listarComentarios();
		// TODO Auto-generated constructor stub
	}
	private ArrayList<Comentario> listarComentarios(){
    	return null;
    }
	public ArrayList<Comentario> getListaComentarios() {
		return listaComentarios;
	}
    
}
