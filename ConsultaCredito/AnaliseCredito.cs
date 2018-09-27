using System;
using System.Collections.Generic;
using System.Text;

namespace ConsultaCredito
{
    public class AnaliseCredito
    {
        private IServicoConsultaCredito _servConsultaCredito;

        public AnaliseCredito(IServicoConsultaCredito servConsultaCredito)
        {
            _servConsultaCredito = servConsultaCredito;
        }

        public StatusConsultaCredito ConsultarSituacaoCPF(string cpf)
        {
            try
            {
                var pendencias = _servConsultaCredito.ConsultarPendenciaPorCPF(cpf);

                if (pendencias == null)
                    return StatusConsultaCredito.ParametroEnvioInvalido;
                else if (pendencias.Count == 0)
                    return StatusConsultaCredito.SemPendencia;
                else
                    return StatusConsultaCredito.Inadimplente;

            }
            catch (Exception)
            {

                return StatusConsultaCredito.ErroComunicacao;
            }
            
        }

    }
}
