package com.ucc.crudservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NotBlank(message = "El codigo no puede estar vacio")
    private String sku;
    @NotBlank(message = "El nombre no puede estar vacio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String name;
    @NotBlank(message = "La descripcion no puede estar vacia")
    private String descripcion;
    @NotNull(message = "El precio es obligatorio")
    @DecimalMin(message = "El precio debe ser mayor a 0", value = "0.0")
    private Double price;
    private Boolean status;
}
