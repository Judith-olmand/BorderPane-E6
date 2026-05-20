# Layout Estructural con BorderPane (Ejercicio 6)

Este proyecto explora el uso de `BorderPane`, un contenedor avanzado que divide el espacio de la ventana en cinco regiones específicas, ideal para organizar interfaces con barras de herramientas, menús y áreas de contenido principal.

## 🚀 Funcionalidades
* **Distribución por Regiones:** Implementa la organización de nodos en las zonas `Top`, `Bottom`, `Left`, `Right` y `Center`.
* **Alineación de Componentes:** Utiliza `BorderPane.setAlignment()` para centrar los elementos dentro de sus respectivas áreas, corrigiendo la alineación por defecto.
* **Gestión de Márgenes:** Aplica la clase `Insets` para establecer espacios de separación (50 píxeles) alrededor de los componentes, evitando que toquen los bordes de la ventana o entre sí.
* **Dimensionamiento Proporcional:** Configura una ventana de 500x450 píxeles para observar cómo el área central se expande automáticamente para ocupar el espacio restante.

## 🛠️ Estructura técnica
El código demuestra el control preciso sobre el posicionamiento en JavaFX:
* **`BorderPane`**: Contenedor que gestiona el layout basándose en puntos cardinales. Es el estándar para layouts de tipo "Dashboard".
* **`Pos.CENTER`**: Enumeración de la librería `javafx.geometry` utilizada para posicionar los nodos en el eje central de su celda.
* **`Insets`**: Define el padding exterior de los nodos, permitiendo un diseño más aireado y profesional.
* **Prioridad del Centro**: Demuestra la característica del `BorderPane` donde la región `Center` intenta expandirse tanto como sea posible, mientras que las demás regiones solo ocupan lo necesario para sus componentes.