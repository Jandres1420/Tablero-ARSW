//Este código asume que las librerías de P5.js ya están cargadas.
//Esta función se ejecuta una sola vez al inicio del script.

let c = 'orchid';
function setup() {   
    createCanvas(640, 480);   
}
  // Esta función se ejecuta repetidas veces indefinidamente.
  function draw() {
    if (mouseIsPressed === true) {
      colorMode(RGB, 255);
      c = color(cambiarColor);
      fill(c);
      ellipse(mouseX, mouseY, 10, 10);
    }
    if (mouseIsPressed === false) {
      fill(255,255,255);
    }
    
  }
  function lecturaR(){
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
        document.getElementById("getrespmsg").innerHTML = this.responseText;
    }
    xhttp.open("GET", "/index/color/r");
    xhttp.send()
}
function erase() {
  clear();
  background(128);
  describe(
    'canvas is cleared, small white ellipse is drawn at mouse X and mouse Y'
  );
}

function erase() {
  clear();
  background(128);
  describe(
    'canvas is cleared, small white ellipse is drawn at mouse X and mouse Y'
  );
}

function cambiarColor(){
  alert(lecturaR());
}