const form = document.querySelector(".orador-form");
const url = "http://localhost:8080/oradores/endpoint";


function enviarDatos(){
	let nombre = document.querySelector("#nombreInput").value;
  	let apellido = document.querySelector("#apellidoInput").value;
  	let tema = document.querySelector("#temaInput").value;
  	
  	fetch(`endpoint?nombreInput=${nombre}&apellidoInput=${apellido}&temaInput=${tema}`,{
		  method: 'POST'
	  })
	  
	  .then(response => response.json())
	  .then(data => alertaPostExitoso())
	  .catch(error => console.log('Error:', error))
	  
	  
}

const alertaPostExitoso = () => {
	alert('Orador generado y guardado exitosamente')
	form.reset()
}

form.addEventListener('submit', (e) => {
	e.preventDefault()
	enviarDatos()
})

