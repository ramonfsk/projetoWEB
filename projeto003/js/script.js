function selecionarMaterias() {
    var checkboxs = document.getElementsByName('chkMateria');
    checkboxs.forEach(checkbox => {
        if(checkbox.checked == true)
            alert(`${checkbox.id}`);
    });
}