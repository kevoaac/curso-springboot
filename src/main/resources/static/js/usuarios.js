// Call the dataTables jQuery plugin
$(document).ready(function () { //Cuando la página cargue llama a esta función

  cargarUsuarios(); //llamo a mi función creada
  $('#usuarios').DataTable();
});

async function cargarUsuarios() {//Agregamos async por awaitde abajo
  //dentro agregaremos toda nuestra lógica
  const request = await fetch('usuarios', {
    method: 'GET', //await: lo que hace es esperar el resultado del llamado
    headers: {//Indica que usará json y que el contenido es json
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const usuarios = await request.json();







  let listadoHtml = '';//lista a guardar string de html de los usuarios
  //for each
  for (let usuario of usuarios) {
    let usuarioHtml = ' <tr><td>'
      + usuario.id + '</td><td>'
      + usuario.nombre + ' ' + usuario.apellido + '</td><td>'
      + usuario.email + '</td><td>'
      + usuario.telefono + '</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';

    listadoHtml = listadoHtml + usuarioHtml; //concatenamos html de cada usuario
  }

  document.querySelector('#usuarios tbody').outerHTML = listadoHtml;
}
