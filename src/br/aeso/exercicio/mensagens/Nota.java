package br.aeso.exercicio.mensagens;

import java.util.ArrayList;
import java.util.Date;

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
