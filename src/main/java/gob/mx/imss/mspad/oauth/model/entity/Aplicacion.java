package gob.mx.imss.mspad.oauth.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @Author Itzi B. Enriquez R. LT
 * @Date   27 abr. 2022
 * @IMSS
 */
@Data
@Entity
@Table(name="adts_aplicaciones")
public class Aplicacion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_APLICACION")
	private Long cveId;
	
	@NotNull
	@NotEmpty
	@Column(name = "NOMBRE_APLICACION")
	private String nombreAplicacion; 
	
	
	@NotNull
	@NotEmpty
	@Column(name = "CVE_APLICACION")
	private String cveAplicacion; 
	
	@NotNull
	@NotEmpty
	@Column(name = "ID_USUARIO")
	private String cveUsuario;
	

	@NotNull
	@NotEmpty
	@Column(name = "ID_PASSWORD")
	private String cvePassword;
	

	@NotNull
	@NotEmpty
	@Column(name = "ID_LLAVE_PUB")
	private String cveLLavePub;
	
	@NotNull
	@NotEmpty
	@Column(name = "ID_LLAVE_PRIV")
	private String cveLLavePriv;
	
	
	private static final long serialVersionUID = -8337640745343203538L;
}
