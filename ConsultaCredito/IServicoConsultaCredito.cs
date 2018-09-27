using System;
using System.Collections.Generic;
using System.Text;

namespace ConsultaCredito
{
    public interface IServicoConsultaCredito
    {
        IList<Pendencia> ConsultarPendenciaPorCPF(string cpf);
    }
}
