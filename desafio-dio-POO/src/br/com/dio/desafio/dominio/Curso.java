package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargahoraria;

	public Curso() {
	}

	public int getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	

	@Override
	public String toString() {
		return "Curso [Carga horária: " + cargahoraria + ", Titulo: " + getTitulo() + ", Descricao: "
				+ getDescricao() + "]";
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO * cargahoraria;
	}

}
