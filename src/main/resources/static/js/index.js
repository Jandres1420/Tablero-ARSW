//Este código asume que las librerías de P5.js ya están cargadas.
//Esta función se ejecuta una sola vez al inicio del script.
function setup() {
    createCanvas(640, 480);
  }
  // Esta función se ejecuta repetidas veces indefinidamente.
  function draw() {
    if (mouseIsPressed === true) {
      let c = color(255, 204, 0);
      fill(c);
      ellipse(mouseX, mouseY, 10, 10);
    }
    if (mouseIsPressed === false) {
      fill(255,255,255);
    }
    
  }