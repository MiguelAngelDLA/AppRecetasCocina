# 📱 Recetas Cocina - Jetpack Compose


## 🚀 Instalación y ejecución
1. Clona este repositorio:
   ```bash
   git clone github.com/MiguelAngelDLA/AppRecetasCocina.git
   ```
2. Abre el proyecto en **Android Studio**.
3. Asegúrate de tener configurado un emulador o un dispositivo físico con Android 8.0+.
4. Ejecuta la aplicación:
   ```bash
   Run > Run 'app'
   ```

## 🏗️ Estructura del proyecto
```
📂 RecetasCocina
 ┣ 📂 app
 ┃ ┣ 📂 src
 ┃ ┃ ┣ 📂 main
 ┃ ┃ ┃ ┣ 📂 java/com/example/recetascocina
 ┃ ┃ ┃ ┃ ┣ 📜 MainActivity.kt
 ┃ ┃ ┃ ┃ ┣ 📜 RecipeDetail.kt  # Pantalla de detalle de receta
 ┃ ┃ ┃ ┣ 📂 res
 ┃ ┃ ┃ ┃ ┣ 📂 drawable   # Imágenes y recursos gráficos
 ┃ ┃ ┃ ┃ ┣ 📂 layout     # Diseños XML (si aplica)
 ┃ ┃ ┃ ┃ ┣ 📂 values     # Colores, estilos, strings
```

## 📷 Capturas de pantalla
| 📌 Pantalla Principal | 📜 Detalles de Receta |
|-----------------|-----------------|
|![image](https://github.com/user-attachments/assets/6383acfb-0e2c-4c38-a3b7-58d20eb4ac6b)
 | ![image](https://github.com/user-attachments/assets/cc86aa2a-0440-470f-ba5b-c897d15a91c6) |

## 📜 Código Principal
```kotlin
@Composable
fun RecipeDetail(
