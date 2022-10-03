package Modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * Classe para objetos do tipo Citação, onde serão contidos, valores e métodos
 * para o mesmo.
 *
 * @author Carlos e Flavio
 *
 */
@Entity
public class Citacao implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    @Cascade(CascadeType.ALL)
    private Livro livro;
    @OneToOne
    @Cascade(CascadeType.ALL)
    private Autor autor;
    @Column(length = 500)
    private String texto;

    public Citacao() {
    }

    public Citacao(long id, Livro livro, Autor autor, String texto) {
        this.id = id;
        this.livro = livro;
        this.autor = autor;
        this.texto = texto;
    }

    public Citacao(Livro livro, Autor autor, String texto) {
        this.livro = livro;
        this.autor = autor;
        this.texto = texto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 89 * hash + Objects.hashCode(this.livro);
        hash = 89 * hash + Objects.hashCode(this.autor);
        hash = 89 * hash + Objects.hashCode(this.texto);
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
        final Citacao other = (Citacao) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.texto, other.texto)) {
            return false;
        }
        if (!Objects.equals(this.livro, other.livro)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n"
                + "Livro: " + livro + "\n"
                + "Autor: " + autor + "\n"
                + "Texto: " + texto;
    }

}
