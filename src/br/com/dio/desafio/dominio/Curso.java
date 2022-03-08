package br.com.dio.desafio.dominio;

public class Curso {

    private String Titulo;
    private String Descricao;
    private int cargaHoraria;

    public Curso() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + Titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
