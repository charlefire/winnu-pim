package winnu.dao;


import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;
import org.apache.torque.TorqueException;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.util.Criteria;
import org.apache.torque.util.Transaction;

  
  
/**
 * This class was autogenerated by Torque on:
 *
 * [Sat Mar 20 22:20:18 CST 2010]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to Sale
 */
public abstract class BaseSale extends BaseObject
{
    /** The Peer class */
    private static final SalePeer peer =
        new SalePeer();

        
    /** The value for the saleId field */
    private int saleId;
      
    /** The value for the customerName field */
    private String customerName;
      
    /** The value for the saleDate field */
    private String saleDate;
      
    /** The value for the totalCost field */
    private double totalCost;
      
    /** The value for the userId field */
    private int userId;
  
    
    /**
     * Get the SaleId
     *
     * @return int
     */
    public int getSaleId()
    {
        return saleId;
    }

                                              
    /**
     * Set the value of SaleId
     *
     * @param v new value
     */
    public void setSaleId(int v) throws TorqueException
    {
    
                  if (this.saleId != v)
              {
            this.saleId = v;
            setModified(true);
        }
    
          
                                  
        // update associated WithdrawnItem
        if (collWithdrawnItems != null)
        {
            for (int i = 0; i < collWithdrawnItems.size(); i++)
            {
                ((WithdrawnItem) collWithdrawnItems.get(i))
                    .setSaleId(v);
            }
        }
                      }
  
    /**
     * Get the CustomerName
     *
     * @return String
     */
    public String getCustomerName()
    {
        return customerName;
    }

                        
    /**
     * Set the value of CustomerName
     *
     * @param v new value
     */
    public void setCustomerName(String v) 
    {
    
                  if (!ObjectUtils.equals(this.customerName, v))
              {
            this.customerName = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the SaleDate
     *
     * @return String
     */
    public String getSaleDate()
    {
        return saleDate;
    }

                        
    /**
     * Set the value of SaleDate
     *
     * @param v new value
     */
    public void setSaleDate(String v) 
    {
    
                  if (!ObjectUtils.equals(this.saleDate, v))
              {
            this.saleDate = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the TotalCost
     *
     * @return double
     */
    public double getTotalCost()
    {
        return totalCost;
    }

                        
    /**
     * Set the value of TotalCost
     *
     * @param v new value
     */
    public void setTotalCost(double v) 
    {
    
                  if (this.totalCost != v)
              {
            this.totalCost = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the UserId
     *
     * @return int
     */
    public int getUserId()
    {
        return userId;
    }

                              
    /**
     * Set the value of UserId
     *
     * @param v new value
     */
    public void setUserId(int v) throws TorqueException
    {
    
                  if (this.userId != v)
              {
            this.userId = v;
            setModified(true);
        }
    
                          
                if (aUser != null && !(aUser.getUserId() == v))
                {
            aUser = null;
        }
      
              }
  
      
    
                  
    
        private User aUser;

    /**
     * Declares an association between this object and a User object
     *
     * @param v User
     * @throws TorqueException
     */
    public void setUser(User v) throws TorqueException
    {
            if (v == null)
        {
                    setUserId(0);
                  }
        else
        {
            setUserId(v.getUserId());
        }
                aUser = v;
    }

                                            
    /**
     * Get the associated User object
     *
     * @return the associated User object
     * @throws TorqueException
     */
    public User getUser() throws TorqueException
    {
        if (aUser == null && (this.userId > 0))
        {
                          aUser = UserPeer.retrieveByPK(SimpleKey.keyFor(this.userId));
              
            /* The following can be used instead of the line above to
               guarantee the related object contains a reference
               to this object, but this level of coupling
               may be undesirable in many circumstances.
               As it can lead to a db query with many results that may
               never be used.
               User obj = UserPeer.retrieveByPK(this.userId);
               obj.addSales(this);
            */
        }
        return aUser;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey.  e.g.
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
           */
    public void setUserKey(ObjectKey key) throws TorqueException
    {
      
                        setUserId(((NumberKey) key).intValue());
                  }
       
                                
            
    /**
     * Collection to store aggregation of collWithdrawnItems
     */
    protected List collWithdrawnItems;

    /**
     * Temporary storage of collWithdrawnItems to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initWithdrawnItems()
    {
        if (collWithdrawnItems == null)
        {
            collWithdrawnItems = new ArrayList();
        }
    }

    /**
     * Method called to associate a WithdrawnItem object to this object
     * through the WithdrawnItem foreign key attribute
     *
     * @param l WithdrawnItem
     * @throws TorqueException
     */
    public void addWithdrawnItem(WithdrawnItem l) throws TorqueException
    {
        getWithdrawnItems().add(l);
        l.setSale((Sale) this);
    }

    /**
     * The criteria used to select the current contents of collWithdrawnItems
     */
    private Criteria lastWithdrawnItemsCriteria = null;

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getWithdrawnItems(new Criteria())
     *
     * @throws TorqueException
     */
    public List getWithdrawnItems() throws TorqueException
    {
        if (collWithdrawnItems == null)
        {
            collWithdrawnItems = getWithdrawnItems(new Criteria(10));
        }
        return collWithdrawnItems;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Sale has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     * If this Sale is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getWithdrawnItems(Criteria criteria) throws TorqueException
    {
        if (collWithdrawnItems == null)
        {
            if (isNew())
            {
               collWithdrawnItems = new ArrayList();
            }
            else
            {
                      criteria.add(WithdrawnItemPeer.SALEID, getSaleId() );
                      collWithdrawnItems = WithdrawnItemPeer.doSelect(criteria);
            }
        }
        else
        {
            // criteria has no effect for a new object
            if (!isNew())
            {
                // the following code is to determine if a new query is
                // called for.  If the criteria is the same as the last
                // one, just return the collection.
                      criteria.add(WithdrawnItemPeer.SALEID, getSaleId());
                      if (!lastWithdrawnItemsCriteria.equals(criteria))
                {
                    collWithdrawnItems = WithdrawnItemPeer.doSelect(criteria);
                }
            }
        }
        lastWithdrawnItemsCriteria = criteria;

        return collWithdrawnItems;
    }

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getWithdrawnItems(new Criteria(),Connection)
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getWithdrawnItems(Connection con) throws TorqueException
    {
        if (collWithdrawnItems == null)
        {
            collWithdrawnItems = getWithdrawnItems(new Criteria(10), con);
        }
        return collWithdrawnItems;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Sale has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     * If this Sale is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getWithdrawnItems(Criteria criteria, Connection con)
            throws TorqueException
    {
        if (collWithdrawnItems == null)
        {
            if (isNew())
            {
               collWithdrawnItems = new ArrayList();
            }
            else
            {
                       criteria.add(WithdrawnItemPeer.SALEID, getSaleId());
                       collWithdrawnItems = WithdrawnItemPeer.doSelect(criteria, con);
             }
         }
         else
         {
             // criteria has no effect for a new object
             if (!isNew())
             {
                 // the following code is to determine if a new query is
                 // called for.  If the criteria is the same as the last
                 // one, just return the collection.
                       criteria.add(WithdrawnItemPeer.SALEID, getSaleId());
                       if (!lastWithdrawnItemsCriteria.equals(criteria))
                 {
                     collWithdrawnItems = WithdrawnItemPeer.doSelect(criteria, con);
                 }
             }
         }
         lastWithdrawnItemsCriteria = criteria;

         return collWithdrawnItems;
     }

                                    
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Sale is new, it will return
     * an empty collection; or if this Sale has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Sale.
     */
    protected List getWithdrawnItemsJoinDoctor(Criteria criteria)
        throws TorqueException
    {
        if (collWithdrawnItems == null)
        {
            if (isNew())
            {
               collWithdrawnItems = new ArrayList();
            }
            else
            {
                            criteria.add(WithdrawnItemPeer.SALEID, getSaleId());
                            collWithdrawnItems = WithdrawnItemPeer.doSelectJoinDoctor(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                        criteria.add(WithdrawnItemPeer.SALEID, getSaleId());
                        if (!lastWithdrawnItemsCriteria.equals(criteria))
            {
                collWithdrawnItems = WithdrawnItemPeer.doSelectJoinDoctor(criteria);
            }
        }
        lastWithdrawnItemsCriteria = criteria;

        return collWithdrawnItems;
    }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Sale is new, it will return
     * an empty collection; or if this Sale has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Sale.
     */
    protected List getWithdrawnItemsJoinSale(Criteria criteria)
        throws TorqueException
    {
        if (collWithdrawnItems == null)
        {
            if (isNew())
            {
               collWithdrawnItems = new ArrayList();
            }
            else
            {
                            criteria.add(WithdrawnItemPeer.SALEID, getSaleId());
                            collWithdrawnItems = WithdrawnItemPeer.doSelectJoinSale(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                        criteria.add(WithdrawnItemPeer.SALEID, getSaleId());
                        if (!lastWithdrawnItemsCriteria.equals(criteria))
            {
                collWithdrawnItems = WithdrawnItemPeer.doSelectJoinSale(criteria);
            }
        }
        lastWithdrawnItemsCriteria = criteria;

        return collWithdrawnItems;
    }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Sale is new, it will return
     * an empty collection; or if this Sale has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Sale.
     */
    protected List getWithdrawnItemsJoinItemBatch(Criteria criteria)
        throws TorqueException
    {
        if (collWithdrawnItems == null)
        {
            if (isNew())
            {
               collWithdrawnItems = new ArrayList();
            }
            else
            {
                            criteria.add(WithdrawnItemPeer.SALEID, getSaleId());
                            collWithdrawnItems = WithdrawnItemPeer.doSelectJoinItemBatch(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                        criteria.add(WithdrawnItemPeer.SALEID, getSaleId());
                        if (!lastWithdrawnItemsCriteria.equals(criteria))
            {
                collWithdrawnItems = WithdrawnItemPeer.doSelectJoinItemBatch(criteria);
            }
        }
        lastWithdrawnItemsCriteria = criteria;

        return collWithdrawnItems;
    }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Sale is new, it will return
     * an empty collection; or if this Sale has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Sale.
     */
    protected List getWithdrawnItemsJoinUser(Criteria criteria)
        throws TorqueException
    {
        if (collWithdrawnItems == null)
        {
            if (isNew())
            {
               collWithdrawnItems = new ArrayList();
            }
            else
            {
                            criteria.add(WithdrawnItemPeer.SALEID, getSaleId());
                            collWithdrawnItems = WithdrawnItemPeer.doSelectJoinUser(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                        criteria.add(WithdrawnItemPeer.SALEID, getSaleId());
                        if (!lastWithdrawnItemsCriteria.equals(criteria))
            {
                collWithdrawnItems = WithdrawnItemPeer.doSelectJoinUser(criteria);
            }
        }
        lastWithdrawnItemsCriteria = criteria;

        return collWithdrawnItems;
    }
                            


          
    private static List fieldNames = null;

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static synchronized List getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList();
              fieldNames.add("SaleId");
              fieldNames.add("CustomerName");
              fieldNames.add("SaleDate");
              fieldNames.add("TotalCost");
              fieldNames.add("UserId");
              fieldNames = Collections.unmodifiableList(fieldNames);
        }
        return fieldNames;
    }

    /**
     * Retrieves a field from the object by name passed in as a String.
     *
     * @param name field name
     * @return value
     */
    public Object getByName(String name)
    {
          if (name.equals("SaleId"))
        {
                return new Integer(getSaleId());
            }
          if (name.equals("CustomerName"))
        {
                return getCustomerName();
            }
          if (name.equals("SaleDate"))
        {
                return getSaleDate();
            }
          if (name.equals("TotalCost"))
        {
                return new Double(getTotalCost());
            }
          if (name.equals("UserId"))
        {
                return new Integer(getUserId());
            }
          return null;
    }
    
    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     *
     * @param name peer name
     * @return value
     */
    public Object getByPeerName(String name)
    {
          if (name.equals(SalePeer.SALEID))
        {
                return new Integer(getSaleId());
            }
          if (name.equals(SalePeer.CUSTOMERNAME))
        {
                return getCustomerName();
            }
          if (name.equals(SalePeer.SALEDATE))
        {
                return getSaleDate();
            }
          if (name.equals(SalePeer.TOTALCOST))
        {
                return new Double(getTotalCost());
            }
          if (name.equals(SalePeer.USERID))
        {
                return new Integer(getUserId());
            }
          return null;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     *
     * @param pos position in xml schema
     * @return value
     */
    public Object getByPosition(int pos)
    {
            if (pos == 0)
        {
                return new Integer(getSaleId());
            }
              if (pos == 1)
        {
                return getCustomerName();
            }
              if (pos == 2)
        {
                return getSaleDate();
            }
              if (pos == 3)
        {
                return new Double(getTotalCost());
            }
              if (pos == 4)
        {
                return new Integer(getUserId());
            }
              return null;
    }
     
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     *
     * @throws Exception
     */
    public void save() throws Exception
    {
          save(SalePeer.getMapBuilder()
                .getDatabaseMap().getName());
      }

    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
       * Note: this code is here because the method body is
     * auto-generated conditionally and therefore needs to be
     * in this file instead of in the super class, BaseObject.
       *
     * @param dbName
     * @throws TorqueException
     */
    public void save(String dbName) throws TorqueException
    {
        Connection con = null;
          try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
      }

      /** flag to prevent endless save loop, if this object is referenced
        by another object which falls in this transaction. */
    private boolean alreadyInSave = false;
      /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally
     *
     * @param con
     * @throws TorqueException
     */
    public void save(Connection con) throws TorqueException
    {
          if (!alreadyInSave)
        {
            alreadyInSave = true;


  
            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    SalePeer.doInsert((Sale) this, con);
                    setNew(false);
                }
                else
                {
                    SalePeer.doUpdate((Sale) this, con);
                }
            }

                                      
                
            if (collWithdrawnItems != null)
            {
                for (int i = 0; i < collWithdrawnItems.size(); i++)
                {
                    ((WithdrawnItem) collWithdrawnItems.get(i)).save(con);
                }
            }
                          alreadyInSave = false;
        }
      }


                          
      /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param  saleId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setSaleId(((NumberKey) key).intValue());
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setSaleId(Integer.parseInt(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getSaleId());
      }

 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections and sets the
     * related objects to isNew=true.
       */
      public Sale copy() throws TorqueException
    {
        return copyInto(new Sale());
    }
  
    protected Sale copyInto(Sale copyObj) throws TorqueException
    {
          copyObj.setSaleId(saleId);
          copyObj.setCustomerName(customerName);
          copyObj.setSaleDate(saleDate);
          copyObj.setTotalCost(totalCost);
          copyObj.setUserId(userId);
  
                    copyObj.setSaleId(0);
                                    
                                      
                
        List v = getWithdrawnItems();
        for (int i = 0; i < v.size(); i++)
        {
            WithdrawnItem obj = (WithdrawnItem) v.get(i);
            copyObj.addWithdrawnItem(obj.copy());
        }
                    
        return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public SalePeer getPeer()
    {
        return peer;
    }

    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Sale:\n");
        str.append("SaleId = ")
           .append(getSaleId())
           .append("\n");
        str.append("CustomerName = ")
           .append(getCustomerName())
           .append("\n");
        str.append("SaleDate = ")
           .append(getSaleDate())
           .append("\n");
        str.append("TotalCost = ")
           .append(getTotalCost())
           .append("\n");
        str.append("UserId = ")
           .append(getUserId())
           .append("\n");
        return(str.toString());
    }
}
