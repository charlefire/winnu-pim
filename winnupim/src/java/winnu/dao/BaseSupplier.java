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
 * [Thu Mar 25 06:20:49 CST 2010]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to Supplier
 */
@SuppressWarnings({ "unused", "serial" })
public abstract class BaseSupplier extends BaseObject
{
    /** The Peer class */
    private static final SupplierPeer peer =
        new SupplierPeer();

        
    /** The value for the supplierId field */
    private int supplierId;
      
    /** The value for the supplierName field */
    private String supplierName;
      
    /** The value for the address field */
    private String address;
      
    /** The value for the contactNo field */
    private String contactNo;
  
    
    /**
     * Get the SupplierId
     *
     * @return int
     */
    public int getSupplierId()
    {
        return supplierId;
    }

                                              
    /**
     * Set the value of SupplierId
     *
     * @param v new value
     */
    public void setSupplierId(int v) throws TorqueException
    {
    
                  if (this.supplierId != v)
              {
            this.supplierId = v;
            setModified(true);
        }
    
          
                                  
        // update associated ItemBatch
        if (collItemBatchs != null)
        {
            for (int i = 0; i < collItemBatchs.size(); i++)
            {
                ((ItemBatch) collItemBatchs.get(i))
                    .setSupplierId(v);
            }
        }
                      }
  
    /**
     * Get the SupplierName
     *
     * @return String
     */
    public String getSupplierName()
    {
        return supplierName;
    }

                        
    /**
     * Set the value of SupplierName
     *
     * @param v new value
     */
    public void setSupplierName(String v) 
    {
    
                  if (!ObjectUtils.equals(this.supplierName, v))
              {
            this.supplierName = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Address
     *
     * @return String
     */
    public String getAddress()
    {
        return address;
    }

                        
    /**
     * Set the value of Address
     *
     * @param v new value
     */
    public void setAddress(String v) 
    {
    
                  if (!ObjectUtils.equals(this.address, v))
              {
            this.address = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the ContactNo
     *
     * @return String
     */
    public String getContactNo()
    {
        return contactNo;
    }

                        
    /**
     * Set the value of ContactNo
     *
     * @param v new value
     */
    public void setContactNo(String v) 
    {
    
                  if (!ObjectUtils.equals(this.contactNo, v))
              {
            this.contactNo = v;
            setModified(true);
        }
    
          
              }
  
         
                                
            
    /**
     * Collection to store aggregation of collItemBatchs
     */
    @SuppressWarnings("unchecked")
	protected List collItemBatchs;

    /**
     * Temporary storage of collItemBatchs to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    @SuppressWarnings("unchecked")
	protected void initItemBatchs()
    {
        if (collItemBatchs == null)
        {
            collItemBatchs = new ArrayList();
        }
    }

    /**
     * Method called to associate a ItemBatch object to this object
     * through the ItemBatch foreign key attribute
     *
     * @param l ItemBatch
     * @throws TorqueException
     */
    @SuppressWarnings("unchecked")
	public void addItemBatch(ItemBatch l) throws TorqueException
    {
        getItemBatchs().add(l);
        l.setSupplier((Supplier) this);
    }

    /**
     * The criteria used to select the current contents of collItemBatchs
     */
    private Criteria lastItemBatchsCriteria = null;

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getItemBatchs(new Criteria())
     *
     * @throws TorqueException
     */
    @SuppressWarnings("unchecked")
	public List getItemBatchs() throws TorqueException
    {
        if (collItemBatchs == null)
        {
            collItemBatchs = getItemBatchs(new Criteria(10));
        }
        return collItemBatchs;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Supplier has previously
     * been saved, it will retrieve related ItemBatchs from storage.
     * If this Supplier is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    @SuppressWarnings("unchecked")
	public List getItemBatchs(Criteria criteria) throws TorqueException
    {
        if (collItemBatchs == null)
        {
            if (isNew())
            {
               collItemBatchs = new ArrayList();
            }
            else
            {
                      criteria.add(ItemBatchPeer.SUPPLIERID, getSupplierId() );
                      collItemBatchs = ItemBatchPeer.doSelect(criteria);
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
                      criteria.add(ItemBatchPeer.SUPPLIERID, getSupplierId());
                      if (!lastItemBatchsCriteria.equals(criteria))
                {
                    collItemBatchs = ItemBatchPeer.doSelect(criteria);
                }
            }
        }
        lastItemBatchsCriteria = criteria;

        return collItemBatchs;
    }

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getItemBatchs(new Criteria(),Connection)
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    @SuppressWarnings("unchecked")
	public List getItemBatchs(Connection con) throws TorqueException
    {
        if (collItemBatchs == null)
        {
            collItemBatchs = getItemBatchs(new Criteria(10), con);
        }
        return collItemBatchs;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Supplier has previously
     * been saved, it will retrieve related ItemBatchs from storage.
     * If this Supplier is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    @SuppressWarnings("unchecked")
	public List getItemBatchs(Criteria criteria, Connection con)
            throws TorqueException
    {
        if (collItemBatchs == null)
        {
            if (isNew())
            {
               collItemBatchs = new ArrayList();
            }
            else
            {
                       criteria.add(ItemBatchPeer.SUPPLIERID, getSupplierId());
                       collItemBatchs = ItemBatchPeer.doSelect(criteria, con);
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
                       criteria.add(ItemBatchPeer.SUPPLIERID, getSupplierId());
                       if (!lastItemBatchsCriteria.equals(criteria))
                 {
                     collItemBatchs = ItemBatchPeer.doSelect(criteria, con);
                 }
             }
         }
         lastItemBatchsCriteria = criteria;

         return collItemBatchs;
     }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Supplier is new, it will return
     * an empty collection; or if this Supplier has previously
     * been saved, it will retrieve related ItemBatchs from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Supplier.
     */
    @SuppressWarnings("unchecked")
	protected List getItemBatchsJoinSupplier(Criteria criteria)
        throws TorqueException
    {
        if (collItemBatchs == null)
        {
            if (isNew())
            {
               collItemBatchs = new ArrayList();
            }
            else
            {
                            criteria.add(ItemBatchPeer.SUPPLIERID, getSupplierId());
                            collItemBatchs = ItemBatchPeer.doSelectJoinSupplier(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                        criteria.add(ItemBatchPeer.SUPPLIERID, getSupplierId());
                        if (!lastItemBatchsCriteria.equals(criteria))
            {
                collItemBatchs = ItemBatchPeer.doSelectJoinSupplier(criteria);
            }
        }
        lastItemBatchsCriteria = criteria;

        return collItemBatchs;
    }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Supplier is new, it will return
     * an empty collection; or if this Supplier has previously
     * been saved, it will retrieve related ItemBatchs from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Supplier.
     */
    @SuppressWarnings("unchecked")
	protected List getItemBatchsJoinItem(Criteria criteria)
        throws TorqueException
    {
        if (collItemBatchs == null)
        {
            if (isNew())
            {
               collItemBatchs = new ArrayList();
            }
            else
            {
                            criteria.add(ItemBatchPeer.SUPPLIERID, getSupplierId());
                            collItemBatchs = ItemBatchPeer.doSelectJoinItem(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                        criteria.add(ItemBatchPeer.SUPPLIERID, getSupplierId());
                        if (!lastItemBatchsCriteria.equals(criteria))
            {
                collItemBatchs = ItemBatchPeer.doSelectJoinItem(criteria);
            }
        }
        lastItemBatchsCriteria = criteria;

        return collItemBatchs;
    }
                            


          
    @SuppressWarnings("unchecked")
	private static List fieldNames = null;

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    @SuppressWarnings("unchecked")
	public static synchronized List getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList();
              fieldNames.add("SupplierId");
              fieldNames.add("SupplierName");
              fieldNames.add("Address");
              fieldNames.add("ContactNo");
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
          if (name.equals("SupplierId"))
        {
                return new Integer(getSupplierId());
            }
          if (name.equals("SupplierName"))
        {
                return getSupplierName();
            }
          if (name.equals("Address"))
        {
                return getAddress();
            }
          if (name.equals("ContactNo"))
        {
                return getContactNo();
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
          if (name.equals(SupplierPeer.SUPPLIERID))
        {
                return new Integer(getSupplierId());
            }
          if (name.equals(SupplierPeer.SUPPLIERNAME))
        {
                return getSupplierName();
            }
          if (name.equals(SupplierPeer.ADDRESS))
        {
                return getAddress();
            }
          if (name.equals(SupplierPeer.CONTACTNO))
        {
                return getContactNo();
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
                return new Integer(getSupplierId());
            }
              if (pos == 1)
        {
                return getSupplierName();
            }
              if (pos == 2)
        {
                return getAddress();
            }
              if (pos == 3)
        {
                return getContactNo();
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
          save(SupplierPeer.getMapBuilder()
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
                    SupplierPeer.doInsert((Supplier) this, con);
                    setNew(false);
                }
                else
                {
                    SupplierPeer.doUpdate((Supplier) this, con);
                }
            }

                                      
                
            if (collItemBatchs != null)
            {
                for (int i = 0; i < collItemBatchs.size(); i++)
                {
                    ((ItemBatch) collItemBatchs.get(i)).save(con);
                }
            }
                          alreadyInSave = false;
        }
      }


                          
      /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param  supplierId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setSupplierId(((NumberKey) key).intValue());
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setSupplierId(Integer.parseInt(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getSupplierId());
      }

 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections and sets the
     * related objects to isNew=true.
       */
      public Supplier copy() throws TorqueException
    {
        return copyInto(new Supplier());
    }
  
    @SuppressWarnings("unchecked")
	protected Supplier copyInto(Supplier copyObj) throws TorqueException
    {
          copyObj.setSupplierId(supplierId);
          copyObj.setSupplierName(supplierName);
          copyObj.setAddress(address);
          copyObj.setContactNo(contactNo);
  
                    copyObj.setSupplierId(0);
                              
                                      
                
        List v = getItemBatchs();
        for (int i = 0; i < v.size(); i++)
        {
            ItemBatch obj = (ItemBatch) v.get(i);
            copyObj.addItemBatch(obj.copy());
        }
                    
        return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public SupplierPeer getPeer()
    {
        return peer;
    }

    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Supplier:\n");
        str.append("SupplierId = ")
           .append(getSupplierId())
           .append("\n");
        str.append("SupplierName = ")
           .append(getSupplierName())
           .append("\n");
        str.append("Address = ")
           .append(getAddress())
           .append("\n");
        str.append("ContactNo = ")
           .append(getContactNo())
           .append("\n");
        return(str.toString());
    }
}
