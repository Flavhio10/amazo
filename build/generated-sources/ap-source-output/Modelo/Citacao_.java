package Modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Citacao.class)
public abstract class Citacao_ {

	public static volatile SingularAttribute<Citacao, String> texto;
	public static volatile SingularAttribute<Citacao, Livro> livro;
	public static volatile SingularAttribute<Citacao, Long> id;
	public static volatile SingularAttribute<Citacao, Autor> autor;

}

