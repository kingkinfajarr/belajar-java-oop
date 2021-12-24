package kingkinfajarr.application;

import kingkinfajarr.error.DatabaseError;

public class DatabaseApp {

    public static void main(String[] args) {
        connectDatabase("kingkin", "kingkin");
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username,  String pasword) {
        if (username == null || pasword == null) {
            throw new DatabaseError("Tidak bisa konek database");
        }
    }

}
