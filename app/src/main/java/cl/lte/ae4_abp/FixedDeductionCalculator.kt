package cl.lte.ae4_abp

/**
 * Una implementación concreta de [DeductionCalculator] que aplica una tasa de deducción fija.
 */
class FixedDeductionCalculator : DeductionCalculator {

    /**
     * Calcula la deducción aplicando una tasa fija del 20%.
     *
     * @param grossSalary El salario bruto.
     * @return El monto total a deducir.
     */
    override fun calculateDeduction(grossSalary: Double): Double {
        return grossSalary * 0.20
    }
}
