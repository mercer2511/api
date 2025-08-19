package med.voll.api.domain.consulta;

import med.voll.api.domain.medico.Especialidad;

import java.time.LocalDateTime;

public record DatosDetalleConsulta(
        Long id,
        Long idMedico,
        Long idPaciente,
        LocalDateTime fecha,
        Especialidad especialidad
) {
    public DatosDetalleConsulta(Consulta consulta) {
        this(
                consulta.getId(),
                consulta.getMedico().getId(),
                consulta.getPaciente().getId(),
                consulta.getFecha(),
                consulta.getMedico().getEspecialidad()
        );
    }
}
