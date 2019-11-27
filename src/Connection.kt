import Constants.ERROR_MESSAGE
import Constants.PASSWORD
import Constants.URL
import Constants.USER
import java.sql.Connection
import java.sql.DriverManager

class Connection {

    private val TAG = Connection::class.java.name

    fun getConnection(): Connection? {
        return try {
            DriverManager.getConnection(URL, USER, PASSWORD)
        } catch (ex: Exception) {
            println(TAG.plus(ERROR_MESSAGE).plus(ex.message))
            null
        }
    }
}