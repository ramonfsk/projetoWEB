function selecionarMaterias() {
    let checkboxs = document.getElementsByName('chkMateria');
    let divConteudo = document.getElementById('divConteudo');

    checkboxs.forEach(checkbox => {
        if(checkbox.checked == true) {
            //alert(`${checkbox.id}`);
            //divConteudo.innerHTML += checkbox.id;
            divConteudo.innerHTML += `<p>${checkbox.id}</p>`;
        }
    });
}