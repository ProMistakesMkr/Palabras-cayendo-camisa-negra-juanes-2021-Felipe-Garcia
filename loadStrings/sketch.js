let texts;
let words = [];
let posi = [];
function preload(){
  texts = loadStrings('./assets/strings.txt');
}

function setup() {
  createCanvas(400, 400);
  for (let index = 0; index < texts.length; index++) {
    let arrayWords = texts[index].split(' '); 
    for (let index = 0; index < arrayWords.length; index++) {
      words.push(arrayWords[index]);
      let newPosi = {x: random(10,350), y: random(0,50)};
      posi.push(newPosi);
    
    }
  }

}

function draw() {
    background(0);
  console.log(texts);
   fill(255);
for (let index = 0;index < words.length; index++){
  text(words[index],posi[index].x, posi[index].y);
  posi[index].y++;
}

  console.log(words);
}