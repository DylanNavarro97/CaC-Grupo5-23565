const url = 'http://localhost:8080/oradores/endpoint'

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
    console.log(datos)
}).catch((error) => {
    console.log('Error en la solicitud GET:', error)
})