// Contenido del archivo javascript.js

// Mostrar el nodo elemento de <form> haciendo uso precisamente del nombre de etiqueta.
var formElement = document.getElementsByTagName('form')[0];
console.log(formElement);

// Mostrar el <button> haciendo uso de método de acceso por clases.
var buttonElement = document.getElementsByClassName('btn')[0];
console.log(buttonElement);

// Mostrar el atributo placeholder del <input> de Address.
var addressInput = document.getElementById('inputAddress');
var addressPlaceholder = addressInput.getAttribute('placeholder');
console.log(addressPlaceholder);

// Mostrar el contenido del elemento de id inputState.
var inputStateContent = document.getElementById('inputState').innerHTML;
console.log(inputStateContent);

// Mostrar el contenido de todos los id de todos los label (uso obligatorio de un bucle).
var labelElements = document.getElementsByTagName('label');
for (var i = 0; i < labelElements.length; i++) {
  console.log(labelElements[i].innerHTML);
}

// Acceso al nodo elemento padre del elemento de id inputZip.
var inputZipParent = document.getElementById('inputZip').parentNode;
console.log(inputZipParent);

// Mostrar la colección que devuelve todos los formularios de la página.
var formsCollection = document.forms;
console.log(formsCollection);

// Mostrar la fecha en la que el archivo fue modificado por última vez.
var lastModifiedDate = document.lastModified;
console.log(lastModifiedDate);
