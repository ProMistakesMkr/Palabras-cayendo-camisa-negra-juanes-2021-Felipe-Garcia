let texts;
let words = [];
function preload(){
  texts = loadStrings('./assets/strings.txt');
}

function setup() {
  createCanvas(400, 400);
    background(220);
  console.log(texts);
  for (let index = 0; index < texts.length; index++) {
    let arrayWords = texts[index].split(' '); 
    for (let index = 0; index < arrayWords.length; index++) {
      words.push(arrayWords[index]);
      text(words[index], random(50,350), random(50,350));
    }
  }

  console.log(words);
}

function draw() {

}