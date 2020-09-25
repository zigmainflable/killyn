/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.killyn.DAO;

import crud.entitis.Despacho;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author daniel
 */
@Local
public interface IDespachoDAO {

    void create(Despacho despacho);

    void edit(Despacho despacho);

    void remove(Despacho despacho);

    Despacho find(Object id);

    List<Despacho> findAll();

    List<Despacho> findRange(int[] range);

    int count();
    
}
