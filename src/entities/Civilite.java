package entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name="CIVILITE")
public class Civilite implements Serializable {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=SEQUENCE, generator = "SEQ_CIVILITE")
	@SequenceGenerator(name="SEQ_CIVILITE", sequenceName = "SEQ_CIVILITE")
	private long id;

	@Column(name="LIBELLE")
	private String libelle;

	private static final long serialVersionUID = 1L;

	public Civilite() {
		super();
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
