
package Crud;
import gestordeclientesgimnasio.Cliente;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClienteCrud {
    public HashMap<String, Cliente> bdClientes;
    
    public ClienteCrud( ){
        bdClientes = new HashMap<>();
    }
    public int agregarCliente(Cliente cliente) throws Exception {
        if(bdClientes.containsKey(cliente.cedula)){
            String mensaje = "El cliente con la cedula "+ cliente.cedula 
                              + " Ya existe";
            throw new Exception(mensaje);
        }
        bdClientes.put(cliente.cedula, cliente);
        return bdClientes.size();
    }
    
    public Cliente buscarCliente(String codigo) throws Exception{
         if(!bdClientes.containsKey(codigo)){
            String mensaje = "El cliente con la cedula "+ codigo 
                              + " NO existe";
            throw new Exception(mensaje);
        }
         return bdClientes.get(codigo);
    }
    
    public void editarCliente(Cliente cliente) throws Exception{
        if(!bdClientes.containsKey(cliente.cedula)){
            String mensaje = "El cliente con la cedula "+ cliente.cedula 
                              + " NO existe";
            throw new Exception(mensaje);
        }
        bdClientes.put(cliente.cedula, cliente);
    }
    
    public int eliminarNegociante(String cedula) throws Exception{
        if(!bdClientes.containsKey(cedula)){
            String mensaje = "El cliente con la cedula "+ cedula 
                              + " NO existe";
            throw new Exception(mensaje);
        }
        bdClientes.remove(cedula);
        return bdClientes.size();
    }
    
    public List<Cliente> obtenerTodos() throws Exception{
        if(bdClientes.isEmpty()){
            String mensaje = "La base de datos está vacía";
            throw new Exception(mensaje);
        }
        var negociantes = bdClientes.values();
        List<Cliente> litaDeNegociantes = new ArrayList<>(negociantes);
        return litaDeNegociantes;
    }
}
