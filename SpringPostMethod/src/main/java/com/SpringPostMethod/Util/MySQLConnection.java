<<<<<<< HEAD
package com.SpringPostMethod.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {

	private static Connection con = null;

	public static Connection GetConnection() {
		try {

			if (con == null) {
				String driver = "com.mysql.jdbc.Driver";
				String URL = "jdbc:mysql://localhost:3306/test";
				String user = "root";
				String password = "sa";

				Class.forName(driver);
				con = DriverManager.getConnection(URL, user, password);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;
	}

}
=======
package com.SpringPostMethod.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {

	private static Connection con = null;

	public static Connection GetConnection() {
		try {

			if (con == null) {
				String driver = "com.mysql.jdbc.Driver";
				String URL = "jdbc:mysql://localhost:3306/test";
				String user = "root";
				String password = "sa";

				Class.forName(driver);
				con = DriverManager.getConnection(URL, user, password);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;
	}

}
<<<<<<< HEAD
>>>>>>> f893c83a20d2de002da0ef187bd8e25badb041cc
=======
>>>>>>> bd4d9c5047a925f002ab8acf4685c1840b5f096f
>>>>>>> e610427c64be5b726a8e986c9f0c7ea80e496d47
