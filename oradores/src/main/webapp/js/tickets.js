const selecCategoria = document.querySelector("#categoria-ticket")
const botonResumen = document.querySelector("#resumen-boton")
const botonBorrar = document.querySelector('#borrar-boton')
const cantidadTickets = document.querySelector('#cantidad-tickets')
const valorTotalText = document.querySelector('#total-pago')
let valorTotal = 0
let cantidad = 0
// function mostrarResumen(event) {
//     event.preventDefault()
// }

cantidadTickets.addEventListener('input', () => {
    cantidad = cantidadTickets.value
    cantidad = cantidad.replace(/\D/g, '')
    cantidadTickets.value = cantidad
})

botonBorrar.addEventListener('click', (event) => {
    event.preventDefault()
    cantidadTickets.value = 0
    cantidad = 0
    valorTotal = 0
    valorTotalText.textContent = `Total a Pagar: $${valorTotal}`
})

botonResumen.addEventListener('click', (event)=> {
    event.preventDefault()
    switch (selecCategoria.value){
        case 'estudiante':
            valorTotal = cantidad * (200 - ((80 / 100) * 200))
            break
        case 'trainee':
            valorTotal = cantidad * (200 - ((50 / 100) * 200))
            break
        case 'junior': 
            valorTotal = cantidad * (200 - ((15 / 100) * 200))
            break
    }
    
    valorTotalText.textContent = `Total a Pagar: $${valorTotal}`
})

