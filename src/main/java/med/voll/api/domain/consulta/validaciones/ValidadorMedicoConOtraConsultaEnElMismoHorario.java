package med.voll.api.domain.consulta.validaciones;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoConOtraConsultaEnElMismoHorario implements ValidadorDeConsultas {
    @Autowired
    private ConsultaRepository repository;

    public void validar(DatosReservaConsulta datos) {
        if (datos.idMedico() == null) return;
        var medicoTieneOtraConsultaEnElHorario = repository.existsByMedicoIdAndFecha(
                datos.idMedico(),
                datos.fecha()
        );
        if (medicoTieneOtraConsultaEnElHorario) {
            throw new ValidacionException("El médico ya tiene otra consulta en el mismo horario");
        }
    }
}