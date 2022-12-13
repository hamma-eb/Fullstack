<%@ page import = "java.sql.*" %>

<% 
    String nombre = request.getParameter("nombre");
    String seleccion = request.getParameter("seleccion");
    String bandera = request.getParameter("bandera");
    String ganados = request.getParameter("ganados");
    String jugados = request.getParameter("jugados");
    String perdidos = request.getParameter("perdidos");
    String empatados = request.getParameter("empatados");
    
    

   
    Connection con = null;
    Statement st = null;

  
    try {
            Class.forName("com.mysql.jdbc.Driver");
            %><h1>driver cargado</h1><%
        } catch (Exception e) {
            %><h1>driver no cargado</h1><%
        }
   
    try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/mundial_catar", "root", "");
            %><h1>msql conectado</h1><%
        } catch (SQLException sqe) {
            %><h1>msql no ha conectado</h1><%
        }
   
    String sql="insert into mundial_catar values(nombre,seleccion,pganados,pjugados,pperdidos,pempatados,bandera,) values ('"+nombre+"','"+seleccion+"','"+Integer.parseInt(jugados)+"','"+Integer.parseInt(ganados)+"','"+Integer.parseInt(perdidos)+"','"+Integer.parseInt(empatados)+"','"+bandera+"')";
    try {
        st = con.createStatement();
        %><h1><%= sql <%</h1><%
        int n = st.executeUpdate(sql2);
        
        if(n == 1) {
            %><h1>1</h1><%
        }else if (n == -1) {
            %><h1>-1</h1><%
        }else {
            %><h1>0</h1><%
        }
    } catch (SQLException sqe) {
        %><h1>no se ha guardado</h1><%
    }
%>