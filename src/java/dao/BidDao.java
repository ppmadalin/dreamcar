/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Bid;

/**
 *
 * @author pmadalin
 */
@Named(value = "bidDao")
@RequestScoped
public class BidDao {

    @PersistenceContext
    private EntityManager em;

    public Bid addBid(Bid b) {
        this.em.persist(b);
        return b;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

}