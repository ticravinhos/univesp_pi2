package br.com.projetointegrador.grupoIII.api.domain;

//import br.com.projetointegrador.grupoIII.api.security.domain.Usuarios;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.EnumType.*;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id") @ToString(of = "id")
@Entity
public class Financiamento {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    private String descricao;
    private Integer parcelas;
    private Double valor;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuarios;
}
