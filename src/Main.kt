import Constants.ERROR_MESSAGE

fun main() {

    try {
        Connection().getConnection()?.let { connection ->
            Query(connection.createStatement()).let { query ->
                query.createTable()
                query.insertCandidates()
                query.getCandidatesCursor()
            }
        }
    } catch (ex: Exception) {
        println(ERROR_MESSAGE.plus(ex.message))
    }
}