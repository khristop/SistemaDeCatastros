package com.igf.dao;

import com.igf.model.Catastro;
import com.igf.util.Main;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khris on 11-22-16.
 */
@Component
public class CatastroDAO {

    // Dummy database. Initialize with some dummy values.
    private static List<Catastro> catastros;
    {
        catastros = new ArrayList();
        catastros.add(new Catastro(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
        catastros.add(new Catastro(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
        catastros.add(new Catastro(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
    }



    /**
     * Returns list of catastros from dummy database.
     *
     * @return list of catastros
     */

    public List list() {
        return catastros;
    }

    /**
     * Return customer object for given id from dummy database. If customer is
     * not found for id, returns null.
     *
     * @param id
     *            customer id
     * @return customer object for given id
     */

    public Catastro get(Long id) {

        Session session = Main.getSession();
        for (Catastro c : catastros) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }


    /**
     * Create new catastro in dummy database. Updates the id and insert new
     * catastro in list.
     *
     * @param catastro
     *            Catastro object
     * @return catastro object with updated id
     */
    public Catastro create(Catastro catastro) {
        catastro.setId(System.currentTimeMillis());
        catastros.add(catastro);
        return catastro;
    }

    /**
     * Delete the customer object from dummy database. If customer not found for
     * given id, returns null.
     *
     * @param id
     *            the customer id
     * @return id of deleted customer object
     */
    public Long delete(Long id) {

        for (Catastro c : catastros) {
            if (c.getId().equals(id)) {
                catastros.remove(c);
                return id;
            }
        }

        return null;
    }

    /**
     * Update the catastro object for given id in dummy database. If catastro
     * not exists, returns null
     *
     * @param id
     * @param catastro
     * @return catastro object with id
     */
    public Catastro update(Long id, Catastro catastro) {

        for (Catastro c : catastros) {
            if (c.getId().equals(id)) {
                catastro.setId(c.getId());
                catastros.remove(c);
                catastros.add(catastro);
                return catastro;
            }
        }

        return null;
    }

}
