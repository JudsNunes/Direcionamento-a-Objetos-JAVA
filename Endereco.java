package Projeto;

public class Endereco{

	public enum TipoEndereco {
		RESIDENCIAL,
		ENTREGA,
		TRABALHO}
	
	public Integer codigo;
	public String nome;
	public String endereco;
	public String cpf;
	public String cep;
	public String estado;
	public String bairro;
	//direcionamento ao Objeto
}
