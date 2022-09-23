package Week_9th;
import java.sql.*;

interface IConnetionProvider {
    public Connection connection();
}

class H2ConnectionProvider implements IConnetionProvider{

    public Connection connection() {
        // TODO  : provide connection for H2 database and return the connection object
         return null;
    }
}

class MySQLConnectionProvider implements IConnetionProvider{

    public Connection connection() {
        // TODO : provide connection for MySQL database
        return null;
    }
}

class OracleConnectionProvider implements IConnetionProvider{

    public Connection connection() {
        // TODO : provide connection for Oracle database and return the connection object
        return null;
    }
}

public class Ex_3 { }
