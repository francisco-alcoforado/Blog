package br.aeso.exercicio.mensagens;

public enum TipoMensagem {
	Nota(1), Comentario(2);
	
	public int valorMensagem;
    TipoMensagem(int valor){
		this.valorMensagem = valor;
	} 
}
