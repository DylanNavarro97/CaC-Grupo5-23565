// Obtener elementos del DOM
  const categoriaSelect = document.getElementById("categoriaSelect");
  const montoTotal = document.getElementById("montoTotal");
  const tarjetas = document.querySelectorAll('.card-categ');
  const botonBorrar = document.getElementById("boton-borrar");
  const botonResumen = document.getElementById("boton-resumen");


  // Valor inicial del ticket
  let precioTicket = 200.0;
  let categoriaSeleccionada = "";

  botonBorrar.addEventListener("click", function () {
    // Deseleccionar la categoría y restablecer el valor total
    categoriaSelect.value = "";
    montoTotal.textContent = "$200";
    categoriaSeleccionada = "";
    // Restablecer los estilos de las tarjetas
    tarjetas.forEach(tarjeta => tarjeta.style.border = '2px solid rgb(118, 175, 223)');
});
botonResumen.addEventListener("click", function () {
  if(categoriaSeleccionada)
  actualizarTotal();
  else{
    alert("Seleccione una categoría");
  }
});
  // Función para actualizar el "total a pagar"
  function actualizarTotal() {
    const categoriaSeleccionada = categoriaSelect.value;
    let descuento = 0;

    if (categoriaSeleccionada === "estudiante") {
      descuento = 0.8; // 80% de descuento para estudiantes
      tarjetas[0].style.border = '2px solid rgb(255, 184, 52)';
      tarjetas[1].style.border = '2px solid rgb(118, 175, 223)';
      tarjetas[2].style.border = '2px solid rgb(118, 175, 223)';
    } else if (categoriaSeleccionada === "Trainee") {
      descuento = 0.5; // 50% de descuento para trainees
      tarjetas[1].style.border = '2px solid rgb(255, 184, 52)';
      tarjetas[0].style.border = '2px solid rgb(118, 175, 223)';
      tarjetas[2].style.border = '2px solid rgb(118, 175, 223)';
    } else if (categoriaSeleccionada === "Junior") {
      descuento = 0.15; // 15% de descuento para junior
      tarjetas[2].style.border = '2px solid rgb(255, 184, 52)';
      tarjetas[1].style.border = '2px solid rgb(118, 175, 223)';
      tarjetas[0].style.border = '2px solid rgb(118, 175, 223)';
    }

    const total = precioTicket * (1 - descuento);
    montoTotal.textContent = `$${total.toFixed(2)}`;
  }
  categoriaSelect.addEventListener("change", function () {
    categoriaSeleccionada = categoriaSelect.value;
});
  actualizarTotal();