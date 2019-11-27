data class Candidates(val name: String, val surname: String, val age: Int) {

    companion object {
        fun getCandidates() = mutableListOf<Candidates>().apply {
            add(Candidates("Aaron", "José Souza Marinheiro", 28))
            add(Candidates("Adalton", "Ricardo Valeriano da Silva", 19))
            add(Candidates("Adelino", "José do Espírito Santo", 72))
            add(Candidates("Adila", "Maria de Alencar", 98))
            add(Candidates("Adolvando", "Correia Neto", 18))
            add(Candidates("Sergio", "Furgeri", 50))
            add(Candidates("Marina", "Estetostopolis", 26))
            add(Candidates("Lucas", "Lima da Silva", 23))
            add(Candidates("Wagner", "Moura", 27))
            add(Candidates("Henrique", "Weak", 21))
        }
    }
}