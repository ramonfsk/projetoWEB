function meuNome() {
    let nome = document.getElementById('txtNome');
    //console.log(`nome: ${JSON.stringify(nome)}`);
    alert(`Meu nome é ${nome.value}.`);
}

function calculo() {
    let num1 = document.getElementById('num1');
    let num2 = document.getElementById('num2');
    let resultado = parseInt(num1.value) + parseInt(num2.value);
    alert(`${resultado}`);
    console.log(`teste: ${num1.value.convertStringInt()}`);
}

String.prototype.convertStringInt = function() {
    return parseInt(this);
}