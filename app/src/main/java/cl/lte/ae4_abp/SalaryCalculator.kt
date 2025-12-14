package cl.lte.ae4_abp

/**
 * Esta clase se encarga de calcular el salario neto.
 * Cumple con el Principio de Responsabilidad Única (SRP) de SOLID,
 * ya que su única responsabilidad es el cálculo del salario.
 */
class SalaryCalculator {

    /**
     * Calcula el salario neto aplicando una deducción del 20% al salario bruto.
     *
     * @param grossSalary El salario bruto del trabajador.
     * @return El salario neto después de las deducciones.
     */
    fun calculateNetSalary(grossSalary: Double): Double {
        // Aquí aplicamos una lógica de negocio simple: una deducción del 20%.
        // En una aplicación real, esta lógica podría ser mucho más compleja.
        return grossSalary * 0.8
    }
}
