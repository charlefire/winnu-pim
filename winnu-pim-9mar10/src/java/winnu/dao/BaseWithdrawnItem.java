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
 * [Wed Mar 10 00:59:38 CST 2010]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to WithdrawnItem
 */
public abstract class BaseWithdrawnItem extends BaseObject
{
    /** The Peer class */
    private static final WithdrawnItemPeer peer =
        new WithdrawnItemPeer();

        
    /** The value for the withdrawnItemId field */
    private int withdrawnItemId;
      
    /** The value for the sellingPrice field */
    private double sellingPrice;
      
    /** The value for the dateWithdrawn field */
    private String dateWithdrawn;
      
    /** The value for the reason field */
    private String reason;
      
    /** The value for the quantity field */
    private int quantity;
      
    /** The value for the doctorId field */
    private int doctorId;
      
    /** The value for the saleId field */
    private int saleId;
      
    /** The value for the itemBatchId field */
    private int itemBatchId;
      
    /** The value for the userId field */
    private int userId;
  
    
    /**
     * Get the WithdrawnItemId
     *
     * @return int
     */
    public int getWithdrawnItemId()
    {
        return withdrawnItemId;
    }

                        
    /**
     * Set the value of WithdrawnItemId
     *
     * @param v new value
     */
    public void setWithdrawnItemId(int v) 
    {
    
                  if (this.withdrawnItemId != v)
              {
            this.withdrawnItemId = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the SellingPrice
     *
     * @return double
     */
    public double getSellingPrice()
    {
        return sellingPrice;
    }

                        
    /**
     * Set the value of SellingPrice
     *
     * @param v new value
     */
    public void setSellingPrice(double v) 
    {
    
                  if (this.sellingPrice != v)
              {
            this.sellingPrice = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the DateWithdrawn
     *
     * @return String
     */
    public String getDateWithdrawn()
    {
        return dateWithdrawn;
    }

                        
    /**
     * Set the value of DateWithdrawn
     *
     * @param v new value
     */
    public void setDateWithdrawn(String v) 
    {
    
                  if (!ObjectUtils.equals(this.dateWithdrawn, v))
              {
            this.dateWithdrawn = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Reason
     *
     * @return String
     */
    public String getReason()
    {
        return reason;
    }

                        
    /**
     * Set the value of Reason
     *
     * @param v new value
     */
    public void setReason(String v) 
    {
    
                  if (!ObjectUtils.equals(this.reason, v))
              {
            this.reason = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Quantity
     *
     * @return int
     */
    public int getQuantity()
    {
        return quantity;
    }

                        
    /**
     * Set the value of Quantity
     *
     * @param v new value
     */
    public void setQuantity(int v) 
    {
    
                  if (this.quantity != v)
              {
            this.quantity = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the DoctorId
     *
     * @return int
     */
    public int getDoctorId()
    {
        return doctorId;
    }

                              
    /**
     * Set the value of DoctorId
     *
     * @param v new value
     */
    public void setDoctorId(int v) throws TorqueException
    {
    
                  if (this.doctorId != v)
              {
            this.doctorId = v;
            setModified(true);
        }
    
                          
                if (aDoctor != null && !(aDoctor.getDoctorId() == v))
                {
            aDoctor = null;
        }
      
              }
  
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
    
                          
                if (aSale != null && !(aSale.getSaleId() == v))
                {
            aSale = null;
        }
      
              }
  
    /**
     * Get the ItemBatchId
     *
     * @return int
     */
    public int getItemBatchId()
    {
        return itemBatchId;
    }

                              
    /**
     * Set the value of ItemBatchId
     *
     * @param v new value
     */
    public void setItemBatchId(int v) throws TorqueException
    {
    
                  if (this.itemBatchId != v)
              {
            this.itemBatchId = v;
            setModified(true);
        }
    
                          
                if (aItemBatch != null && !(aItemBatch.getItemBatchId() == v))
                {
            aItemBatch = null;
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
  
      
    
                  
    
        private Doctor aDoctor;

    /**
     * Declares an association between this object and a Doctor object
     *
     * @param v Doctor
     * @throws TorqueException
     */
    public void setDoctor(Doctor v) throws TorqueException
    {
            if (v == null)
        {
                    setDoctorId(0);
                  }
        else
        {
            setDoctorId(v.getDoctorId());
        }
                aDoctor = v;
    }

                                            
    /**
     * Get the associated Doctor object
     *
     * @return the associated Doctor object
     * @throws TorqueException
     */
    public Doctor getDoctor() throws TorqueException
    {
        if (aDoctor == null && (this.doctorId > 0))
        {
                          aDoctor = DoctorPeer.retrieveByPK(SimpleKey.keyFor(this.doctorId));
              
            /* The following can be used instead of the line above to
               guarantee the related object contains a reference
               to this object, but this level of coupling
               may be undesirable in many circumstances.
               As it can lead to a db query with many results that may
               never be used.
               Doctor obj = DoctorPeer.retrieveByPK(this.doctorId);
               obj.addWithdrawnItems(this);
            */
        }
        return aDoctor;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey.  e.g.
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
           */
    public void setDoctorKey(ObjectKey key) throws TorqueException
    {
      
                        setDoctorId(((NumberKey) key).intValue());
                  }
    
    
                  
    
        private Sale aSale;

    /**
     * Declares an association between this object and a Sale object
     *
     * @param v Sale
     * @throws TorqueException
     */
    public void setSale(Sale v) throws TorqueException
    {
            if (v == null)
        {
                    setSaleId(0);
                  }
        else
        {
            setSaleId(v.getSaleId());
        }
                aSale = v;
    }

                                            
    /**
     * Get the associated Sale object
     *
     * @return the associated Sale object
     * @throws TorqueException
     */
    public Sale getSale() throws TorqueException
    {
        if (aSale == null && (this.saleId > 0))
        {
                          aSale = SalePeer.retrieveByPK(SimpleKey.keyFor(this.saleId));
              
            /* The following can be used instead of the line above to
               guarantee the related object contains a reference
               to this object, but this level of coupling
               may be undesirable in many circumstances.
               As it can lead to a db query with many results that may
               never be used.
               Sale obj = SalePeer.retrieveByPK(this.saleId);
               obj.addWithdrawnItems(this);
            */
        }
        return aSale;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey.  e.g.
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
           */
    public void setSaleKey(ObjectKey key) throws TorqueException
    {
      
                        setSaleId(((NumberKey) key).intValue());
                  }
    
    
                  
    
        private ItemBatch aItemBatch;

    /**
     * Declares an association between this object and a ItemBatch object
     *
     * @param v ItemBatch
     * @throws TorqueException
     */
    public void setItemBatch(ItemBatch v) throws TorqueException
    {
            if (v == null)
        {
                    setItemBatchId(0);
                  }
        else
        {
            setItemBatchId(v.getItemBatchId());
        }
                aItemBatch = v;
    }

                                            
    /**
     * Get the associated ItemBatch object
     *
     * @return the associated ItemBatch object
     * @throws TorqueException
     */
    public ItemBatch getItemBatch() throws TorqueException
    {
        if (aItemBatch == null && (this.itemBatchId > 0))
        {
                          aItemBatch = ItemBatchPeer.retrieveByPK(SimpleKey.keyFor(this.itemBatchId));
              
            /* The following can be used instead of the line above to
               guarantee the related object contains a reference
               to this object, but this level of coupling
               may be undesirable in many circumstances.
               As it can lead to a db query with many results that may
               never be used.
               ItemBatch obj = ItemBatchPeer.retrieveByPK(this.itemBatchId);
               obj.addWithdrawnItems(this);
            */
        }
        return aItemBatch;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey.  e.g.
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
           */
    public void setItemBatchKey(ObjectKey key) throws TorqueException
    {
      
                        setItemBatchId(((NumberKey) key).intValue());
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
               obj.addWithdrawnItems(this);
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
              fieldNames.add("WithdrawnItemId");
              fieldNames.add("SellingPrice");
              fieldNames.add("DateWithdrawn");
              fieldNames.add("Reason");
              fieldNames.add("Quantity");
              fieldNames.add("DoctorId");
              fieldNames.add("SaleId");
              fieldNames.add("ItemBatchId");
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
          if (name.equals("WithdrawnItemId"))
        {
                return new Integer(getWithdrawnItemId());
            }
          if (name.equals("SellingPrice"))
        {
                return new Double(getSellingPrice());
            }
          if (name.equals("DateWithdrawn"))
        {
                return getDateWithdrawn();
            }
          if (name.equals("Reason"))
        {
                return getReason();
            }
          if (name.equals("Quantity"))
        {
                return new Integer(getQuantity());
            }
          if (name.equals("DoctorId"))
        {
                return new Integer(getDoctorId());
            }
          if (name.equals("SaleId"))
        {
                return new Integer(getSaleId());
            }
          if (name.equals("ItemBatchId"))
        {
                return new Integer(getItemBatchId());
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
          if (name.equals(WithdrawnItemPeer.WITHDRAWNITEMID))
        {
                return new Integer(getWithdrawnItemId());
            }
          if (name.equals(WithdrawnItemPeer.SELLINGPRICE))
        {
                return new Double(getSellingPrice());
            }
          if (name.equals(WithdrawnItemPeer.DATEWITHDRAWN))
        {
                return getDateWithdrawn();
            }
          if (name.equals(WithdrawnItemPeer.REASON))
        {
                return getReason();
            }
          if (name.equals(WithdrawnItemPeer.QUANTITY))
        {
                return new Integer(getQuantity());
            }
          if (name.equals(WithdrawnItemPeer.DOCTORID))
        {
                return new Integer(getDoctorId());
            }
          if (name.equals(WithdrawnItemPeer.SALEID))
        {
                return new Integer(getSaleId());
            }
          if (name.equals(WithdrawnItemPeer.ITEMBATCHID))
        {
                return new Integer(getItemBatchId());
            }
          if (name.equals(WithdrawnItemPeer.USERID))
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
                return new Integer(getWithdrawnItemId());
            }
              if (pos == 1)
        {
                return new Double(getSellingPrice());
            }
              if (pos == 2)
        {
                return getDateWithdrawn();
            }
              if (pos == 3)
        {
                return getReason();
            }
              if (pos == 4)
        {
                return new Integer(getQuantity());
            }
              if (pos == 5)
        {
                return new Integer(getDoctorId());
            }
              if (pos == 6)
        {
                return new Integer(getSaleId());
            }
              if (pos == 7)
        {
                return new Integer(getItemBatchId());
            }
              if (pos == 8)
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
          save(WithdrawnItemPeer.getMapBuilder()
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
                    WithdrawnItemPeer.doInsert((WithdrawnItem) this, con);
                    setNew(false);
                }
                else
                {
                    WithdrawnItemPeer.doUpdate((WithdrawnItem) this, con);
                }
            }

                      alreadyInSave = false;
        }
      }


                    
      /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param  withdrawnItemId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
            setWithdrawnItemId(((NumberKey) key).intValue());
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
            setWithdrawnItemId(Integer.parseInt(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getWithdrawnItemId());
      }

 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections and sets the
     * related objects to isNew=true.
       */
      public WithdrawnItem copy() throws TorqueException
    {
        return copyInto(new WithdrawnItem());
    }
  
    protected WithdrawnItem copyInto(WithdrawnItem copyObj) throws TorqueException
    {
          copyObj.setWithdrawnItemId(withdrawnItemId);
          copyObj.setSellingPrice(sellingPrice);
          copyObj.setDateWithdrawn(dateWithdrawn);
          copyObj.setReason(reason);
          copyObj.setQuantity(quantity);
          copyObj.setDoctorId(doctorId);
          copyObj.setSaleId(saleId);
          copyObj.setItemBatchId(itemBatchId);
          copyObj.setUserId(userId);
  
                    copyObj.setWithdrawnItemId(0);
                                                            
        
        return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public WithdrawnItemPeer getPeer()
    {
        return peer;
    }

    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("WithdrawnItem:\n");
        str.append("WithdrawnItemId = ")
           .append(getWithdrawnItemId())
           .append("\n");
        str.append("SellingPrice = ")
           .append(getSellingPrice())
           .append("\n");
        str.append("DateWithdrawn = ")
           .append(getDateWithdrawn())
           .append("\n");
        str.append("Reason = ")
           .append(getReason())
           .append("\n");
        str.append("Quantity = ")
           .append(getQuantity())
           .append("\n");
        str.append("DoctorId = ")
           .append(getDoctorId())
           .append("\n");
        str.append("SaleId = ")
           .append(getSaleId())
           .append("\n");
        str.append("ItemBatchId = ")
           .append(getItemBatchId())
           .append("\n");
        str.append("UserId = ")
           .append(getUserId())
           .append("\n");
        return(str.toString());
    }
}
