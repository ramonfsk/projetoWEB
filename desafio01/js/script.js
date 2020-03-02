function chooseOperator(operator) {
    if(validContentInput('firstNumber') || validContentInput('secondNumber')){
        let result = 0;
        if(operator === '+') {
            result = getNumberByElement('firstNumber') + getNumberByElement('secondNumber');
            alert(`O resultado é: ${result}`);
        }
        if(operator === '-') {
            result = getNumberByElement('firstNumber') - getNumberByElement('secondNumber');
            alert(`O resultado é: ${result}`);
        }
        if(operator === '/') {
            if(getNumberByElement('secondNumber') == 0) {
                alert(`Nunca dividirás por 0!`);
            } else {
                result = getNumberByElement('firstNumber') + getNumberByElement('secondNumber');
                alert(`O resultado é: ${result}`);
            }
        }
        if(operator === 'x') {
            result = getNumberByElement('firstNumber') * getNumberByElement('secondNumber');
            alert(`O resultado é: ${result}`);
        }
    }
}

function validContentInput(id) {
    let input = document.getElementById(id);
    if(input.value.trim() === '') {
        alert(`Campo vazio decetado, por favor preencha todos os valores...`);
        return false;
    } else if(!(input.value.match(/^[0-9]+$/))){
        alert(`Por favor, insira apenas números...`);
        return false;
    }
    return true;
}

function getNumberByElement(id) {
    let number = document.getElementById(id);
    return Number(number.value);
}