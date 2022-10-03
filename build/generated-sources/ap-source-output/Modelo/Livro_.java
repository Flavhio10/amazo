package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Livro.class)
public abstract class Livro_ {

	public static volatile SingularAttribute<Livro, Integer> paginas;
	public static volatile SingularAttribute<Livro, String> subtitulo;
	public static volatile SingularAttribute<Livro, Integer> ano;
	public static volatile SingularAttribute<Livro, Long> isbn;
	public static volatile SingularAttribute<Livro, String> titulo;
	public static volatile SingularAttribute<Livro, Long> id;
	public static volatile SingularAttribute<Livro, String> edicao;
	public static volatile SingularAttribute<Livro, String> editora;
	public static volatile SingularAttribute<Livro, String> local;
	public static volatile ListAttribute<Livro, Citacao> citacaos;

}

