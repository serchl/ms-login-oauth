package gob.mx.imss.mspad.oauth.model.bean;

import java.util.ArrayList;
import lombok.Data;

/**
 * @Author Itzi B. Enriquez R. LT
 * @Date   27 abr. 2022
 * @IMSS
 */
@Data
public class UsuarioBean {
	
	private Integer idUsuario;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String correo;
	private String aliasNombre;
	private String matricula;
	private Rol rol;
	private String puesto;
	private String unidadMedica;
	
}