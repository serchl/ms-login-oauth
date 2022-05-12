package gob.mx.imss.mspad.oauth.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author Itzi B. Enriquez R. LT
 * @Date 26 abr. 2022
 * @IMSS
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "adtsc_roles")
public class RolEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cve_rol", length = 20)
	private Long cveRol;

	@Column(name = "des_rol", length = 45)
	private String name;

	@Column(name = "fec_alta")
	private Date fechaAlta;

	@Column(name = "fec_baja")
	private Date fechBaja;

	@Column(name = "fec_actualizacion")
	private Date fechActualizacion;
	
//	@OneToOne(mappedBy = "role")
//	private User user  ;
//	
//
////	@Enumerated(EnumType.STRING)
//	@Column(name = "des_rol",length = 45, insertable = false, updatable = false)
//	private Role name;

}