package gob.mx.imss.mspad.oauth.model.bean;

import java.util.ArrayList;
import lombok.Data;

/**
 * @Author Itzi B. Enriquez R. LT
 * @Date   27 abr. 2022
 * @IMSS
 */
@Data
public class Modulo {

	private Integer cveModulo;
	private String nomModulo;

	private ArrayList<Funcionalidad> funcionalidades;	
}
