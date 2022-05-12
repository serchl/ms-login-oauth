package gob.mx.imss.mspad.oauth.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author Itzi B. Enriquez R. LT
 * @Date   26 abr. 2022
 * @IMSS
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "adts_usuarios", uniqueConstraints = { @UniqueConstraint(columnNames = "id_usuario"),
		@UniqueConstraint(columnNames = "des_email") })
public class UsuarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Size(max = 20)
	@Column(name = "id_usuario")
	private Long cvePersonalId;

	@Size(max = 50)
	@Column(name = "nom_primer_apellido")
	private String primerApellido;

//	@NotBlank
	@Size(max = 50)
	@Column(name = "nom_segundo_apellido")
	private String segundoApellido;

//	@NotBlank
	@Size(max = 50)
	@Column(name = "nom_nombre")
	private String nombre;

//	@NotBlank
	@Size(max = 45)
	@Column(name = "des_matricula")
	private String username;

//	@NotBlank
	@Size(max = 45)
	@Column(name = "nom_nombre_completo")
	private String nombreCompleto;

//	@NotBlank
	@Size(max = 50)
	@Email
	@Column(name = "des_email")
	private String email;

//	@NotBlank
	@Size(max = 120)
	@Column(name = "des_password")
	private String password;

//  @NotBlank
//  @Size(max = 120)
//  @Column(name = "des_unidad_medica")
//  private String password;
//  
//  @NotBlank
//  @Size(max = 120)
//  @Column(name = "ind_estatus")
//  private String password;
//  
//  @NotBlank
//  @Size(max = 120)
//  @Column(name = "des_puesto")
//  private String password;
//  
//  
//  @NotBlank
//  @Size(max = 120)
//  @Column(name = "des_escuela_procedencia")
//  private String password;
//  
//  @NotBlank
//  @Size(max = 120)
//  @Column(name = "cve_rol")
//  private String password;

//  @ManyToMany(fetch = FetchType.LAZY)
//  @JoinTable(  name = "user_roles", 
//        joinColumns = @JoinColumn(name = "user_id"), 
//        inverseJoinColumns = @JoinColumn(name = "role_id"))
//  private Set<Role> roles = new HashSet<>();

	@OneToOne
	@JoinColumn(name = "ID_ROL")
	private RolEntity role;
	
	
	@Column(name = "ind_num_intentos")
	private Integer numIntentos;
	
	@Column(name = "ind_activo")
	private Integer activo;

}
