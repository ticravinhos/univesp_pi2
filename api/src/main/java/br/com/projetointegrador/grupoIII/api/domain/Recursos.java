package br.com.projetointegrador.grupoIII.api.domain;

//import br.com.projetointegrador.grupoIII.api.security.domain.Usuarios;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id") @ToString(of = "id")
@Entity
public class Recursos {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private String descricao;
    private String categoria;
    private Double valor;

    @Enumerated(STRING)
    private Tipo tipo;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuarios;
}
