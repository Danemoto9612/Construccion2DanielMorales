//Caso de uso soporte
package app.application.usescases;

import app.domain.services.CreateDiagnosticTest;
import app.domain.services.CreateDrug;
import app.domain.services.CreateProcedure;

public class SupportUseCase {
    
    private CreateProcedure createProcedure;
    private CreateDrug createDrug;
    private CreateDiagnosticTest createDiagnosticTest;
    
}
//Aún lo dejo así ya que todavía no estamos conectados a una base de datos para manejar inventarios(crear, 
//actulizar y eliminar)