package med.voll.api.domain.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.direccion.DatosDireccion;

public record DatosRegistroPaciente(
   @NotBlank String nombre,
   @NotBlank @Email String email,
   @NotBlank @Pattern(regexp = "\\d{8}") String documento_identidad,
   @NotBlank String telefono,
   @NotNull DatosDireccion direccion
) {
}
