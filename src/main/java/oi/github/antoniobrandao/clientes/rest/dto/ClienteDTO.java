package oi.github.antoniobrandao.clientes.rest.dto;

import lombok.Data;

@Data
public class ClienteDTO {
    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
}