package cl.lte.ae4_abp

/**
 * Define el contrato para cualquier clase que calcule deducciones sobre un salario.
 * Esto nos permite aplicar el Principio de Abierto/Cerrado (OCP).
 * La clase SalaryCalculator estará "abierta" a nuevas formas de calcular deducciones
 * sin necesidad de modificar su propio código.
 */
interface DeductionCalculator {
    /**
     * Calcula la deducción total para un salario bruto determinado.
     *
     * @param grossSalary El salario bruto.
     * @return El monto a deducir.
     */
    fun calculateDeduction(grossSalary: Double): Double
}
