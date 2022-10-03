package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe para objetos do tipo Livro, onde serão contidos, valores e métodos
 * para o mesmo.
 *
 * @author Carlos e Flavio
 *
 */
@Entity
public class Livro implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private long isbn;
    private String titulo;
    private String subtitulo;
    private String edicao;
    private int paginas;
    private String local;
    private String editora;
    private int ano;
    @OneToMany(mappedBy = "livro")
    private List<Citacao> citacaos;

    public Livro() {
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(long id, long isbn, String titulo, String subtitulo, String edicao, int paginas, String local, String editora, int ano) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.edicao = edicao;
        this.paginas = paginas;
        this.local = local;
        this.editora = editora;
        this.ano = ano;
    }

    public Livro(long isbn, String titulo, String subtitulo, String edicao, int paginas, String local, String editora, int ano) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.edicao = edicao;
        this.paginas = paginas;
        this.local = local;
        this.editora = editora;
        this.ano = ano;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (this.isbn ^ (this.isbn >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (this.isbn != other.isbn) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return titulo;
    }

}
