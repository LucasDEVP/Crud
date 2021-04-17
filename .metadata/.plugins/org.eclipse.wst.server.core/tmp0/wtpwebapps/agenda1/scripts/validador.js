/**
 *  Validação de formulário
	@author Lucas Cayres
 */

function validar() {
	let nome = frmContato.nome.value
	let telefone = frmContato.telefone.value
	if (nome === "") {
		alert('Prencha o campo nome')
		frmContato.nome.focus()
		return false
	} else if (telefone === "") {
		alert('Prencha o campo nome')
		frmContato.nome.focus()
		return false
	} else {
		document.form["frmContato"].submit()
	}
}