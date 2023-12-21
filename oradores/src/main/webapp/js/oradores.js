const url = 'http://localhost:8080/oradores/endpoint'
const tableBody = document.querySelector('.tableBody')
let oradores = []

const datosDeFetch = {
    method: 'GET',
    Headers: {
        'Content-Type': 'application/json'
    }
}

fetch(url, datosDeFetch)
.then(response => {
    if (!response.ok){
        throw new Error(`Error de red: ${response.status}`)
    }
    return response.json()
}).then(datos => {
    datos.map((orador, i) => crearFila(i + 1, orador))
}).catch((error) => {
    console.log('Error en la solicitud GET:', error)
})

const crearFila = (orden, objeto) => {
    tableBody.innerHTML += `
    <tr>
        <th scope="row">${orden}</th>
        <td>${objeto.nombre}</td>
        <td>${objeto.apellido}</td>
        <td>${objeto.tema}</td>
    </tr> `
}

