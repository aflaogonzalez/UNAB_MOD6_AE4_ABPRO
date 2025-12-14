package cl.lte.ae4_abp

/**
 * Esta clase se encarga de calcular el salario neto.
 * Cumple con el Principio de Responsabilidad Única (SRP) de SOLID,
 * ya que su única responsabilidad es el cálculo del salario.
 *
 * También cumple con el Principio de Inversión de Dependencias (DIP),
 * ya que depende de una abstracción ([DeductionCalculator]) en lugar de una concreción.
 *
 * @param deductionCalculator El calculador de deducciones a utilizar.
 */
class SalaryCalculator(private val deductionCalculator: DeductionCalculator) {

    /**
     * Calcula el salario neto restando la deducción calculada del salario bruto.
     *
     * @param grossSalary El salario bruto del trabajador.
     * @return El salario neto después de las deducciones.
     */
    fun calculateNetSalary(grossSalary: Double): Double {
        val deduction = deductionCalculator.calculateDeduction(grossSalary)
        return grossSalary - deduction
    }
}
