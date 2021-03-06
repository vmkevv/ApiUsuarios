/**
 * 
 */
package com.informatica.openInfo.apirest.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
public class ParticipanteEquipo implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Participante participante;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Equipo equipo;
	
	private boolean representante;
	
	private Date createAt;
	
	@PrePersist
	public void prePersist() {
		createAt=new Date();
	}
		
	private static final long serialVersionUID = 1L;
}
