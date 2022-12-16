// Obtener los botones y el elemento del mensaje
const acceptButton = document.getElementById('accept-button');
const rejectButton = document.getElementById('reject-button');
const cookieMessage = document.getElementById('cookie-message');

// Agrega un manejador de eventos de clic al botón de aceptar
acceptButton.addEventListener('click', () => {
  // Oculta el elemento del mensaje de cookies
  cookieMessage.style.display = 'none';
});

// Agrega un manejador de eventos de clic al botón de rechazar
rejectButton.addEventListener('click', () => {
  // Oculta el elemento del mensaje de cookies
  cookieMessage.style.display = 'none';
});
