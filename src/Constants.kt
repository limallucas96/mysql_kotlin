object Constants {

    const val URL = "jdbc:mysql://localhost:3306/kotlin_database"
    const val USER = "root"
    const val PASSWORD = ""

    const val ERROR_MESSAGE = ". Error message: "

    const val CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS candidates (id INTEGER NOT NULL AUTO_INCREMENT, name VARCHAR (255), surname VARCHAR (255), age INTEGER, PRIMARY KEY (id));"
    const val INSERT_QUERY = "INSERT INTO candidates VALUES (NULL, '%s', '%s', '%d')"

    const val GET_CANDIDATES = "SELECT * FROM candidates"
    const val CANDIDATES_RESULT = "\tID: %s,\t NAME: %s,\t SURNAME: %s"
}
