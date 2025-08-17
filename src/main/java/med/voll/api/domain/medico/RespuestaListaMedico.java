package med.voll.api.domain.medico;

import java.util.List;

public record RespuestaListaMedico(
        List<DatosListaMedico> medicos,
        int pagina,
        int size,
        int totalPaginas,
        long totalElementos
) {
}
