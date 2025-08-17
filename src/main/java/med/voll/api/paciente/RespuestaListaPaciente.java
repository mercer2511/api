package med.voll.api.paciente;

import java.util.List;

public record RespuestaListaPaciente(
        List<DatosListaPaciente> pacientes,
        int pagina,
        int size,
        int totalPaginas,
        long totalElementos
) {
}
