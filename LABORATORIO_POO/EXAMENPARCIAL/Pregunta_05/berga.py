import matplotlib.pyplot as plt

# Datos de ejemplo
epochs = list(range(1, 21))  # 20 épocas
precision_base = [0.70, 0.72, 0.74, 0.76, 0.78, 0.80, 0.82, 0.84, 0.86, 0.87,
                  0.88, 0.89, 0.90, 0.91, 0.92, 0.93, 0.94, 0.95, 0.96, 0.97]
precision_experimental = [0.68, 0.71, 0.73, 0.75, 0.77, 0.79, 0.81, 0.83, 0.85, 0.86,
                          0.87, 0.88, 0.89, 0.90, 0.91, 0.92, 0.93, 0.94, 0.95, 0.96]

# Crear la gráfica
plt.figure(figsize=(10, 6))
plt.plot(epochs, precision_base, marker='o', linestyle='-', color='blue', label='Modelo Base')
plt.plot(epochs, precision_experimental, marker='o', linestyle='--', color='red', label='Modelo Experimental')

# Etiquetas y título
plt.xlabel('Épocas')
plt.ylabel('Precisión')
plt.title('Precisión de los Modelos a lo Largo de las Épocas')
plt.legend()
plt.grid(True)

# Mostrar la gráfica
plt.show()
