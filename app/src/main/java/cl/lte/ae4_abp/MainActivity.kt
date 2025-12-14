package cl.lte.ae4_abp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtenemos las referencias a las vistas desde el layout
        val grossSalaryEditText = findViewById<EditText>(R.id.grossSalaryEditText)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val netSalaryTextView = findViewById<TextView>(R.id.netSalaryTextView)

        // Configuramos el listener para el evento de clic en el botón
        calculateButton.setOnClickListener {
            // Obtenemos el texto del EditText y lo convertimos a Double
            val grossSalary = grossSalaryEditText.text.toString().toDoubleOrNull()

            // Verificamos que el salario no sea nulo o cero
            if (grossSalary != null && grossSalary > 0) {
                // 1. Creamos una instancia de la implementación de la deducción
                val deductionCalculator = FixedDeductionCalculator()
                // 2. Creamos la calculadora de salario, pasándole la dependencia
                val salaryCalculator = SalaryCalculator(deductionCalculator)

                // 3. Calculamos el salario neto
                val netSalary = salaryCalculator.calculateNetSalary(grossSalary)

                // 4. Mostramos el resultado en el TextView
                netSalaryTextView.text = "Salario Neto: $%.2f".format(netSalary)
            } else {
                // Mostramos un mensaje de error si la entrada no es válida
                netSalaryTextView.text = "Por favor, ingrese un salario bruto válido."
            }
        }
    }
}
