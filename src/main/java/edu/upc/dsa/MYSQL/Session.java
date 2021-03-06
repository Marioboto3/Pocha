package edu.upc.dsa.MYSQL;


import edu.upc.dsa.models.Usuario;

import java.util.List;

public interface Session {
    void save(Object entity) throws Exception;
    Object get(Class theClass, int id) throws Exception;
    Usuario getByUsername(String username) throws Exception;
    List<Object> findAll(Class theClass) throws Exception;
    List<Object> find(Class theClass, int id, String username) throws Exception;
    void update(Object object, int id) throws Exception;
    void delete(Class theClass, int id) throws Exception;
    List<Usuario> usuariosPartida (int idPartida);
    void close() throws Exception;
}
