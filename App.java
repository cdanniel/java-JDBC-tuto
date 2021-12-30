import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdjoyeria", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM usuario");
            while(rs.next()){
                String DNI = rs.getString("DNI");
                String Nombre = rs.getString("Nombre");
                String Email = rs.getString("Email");
                String Password = rs.getString("Password");
                String TipoUsuario = rs.getString("TipoUsuario");
                System.out.println("Hay un usuario con nombre " + Nombre + " y con DNI " + DNI + " y con email " + Email + "y es de tipo " + TipoUsuario);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
}
