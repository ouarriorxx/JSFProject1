/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDao;

import java.util.List;

/**
 *
 * @author kawta
 */
public interface IDao<T> {

    boolean create(T o);

    boolean update(T o);

    boolean delete(T o);

    T getById(int id);

    List<T> getAll();

}