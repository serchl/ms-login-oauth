package gob.mx.imss.mspad.oauth.model.bean;

import java.io.Serializable;

import lombok.Data;


@Data
public class AplicacionBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	private Long cveId;

//	private String nombreAplicacion;

//	private String cveAplicacion;

	private String cveUsuario;

	private String cvePassword;

	private String data;


}
