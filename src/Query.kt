import Constants.CANDIDATES_RESULT
import Constants.CREATE_TABLE_QUERY
import Constants.GET_CANDIDATES
import Constants.INSERT_QUERY
import java.sql.Statement

class Query(private val statement: Statement) {

    fun createTable() = statement.executeUpdate(CREATE_TABLE_QUERY)

    fun insertCandidates() {
        Candidates.getCandidates().forEach {
            val sql = String.format(INSERT_QUERY, it.name, it.surname, it.age)
            statement.executeUpdate(sql)
        }
    }

    fun getCandidatesCursor() {
        val cursor = statement.executeQuery(GET_CANDIDATES)
        while (cursor.next()){
            val id = cursor.getString("id")
            val name = cursor.getString("name")
            val surname = cursor.getString("surname")
            println(String.format(CANDIDATES_RESULT, id, name, surname))
        }
        cursor.close()
    }
}