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
 * extended all references should be to ItemBatch
 */
public abstract class BaseItemBatch extends BaseObject
{
    /** The Peer class */
    private static final ItemBatchPeer peer =
        new ItemBatchPeer();

        
    /** The value for the itemBatchId field */
    private int itemBatchId;
      
    /** The value for the batchNo field */
    private int batchNo;
      
    /** The value for the expirationDate field */
    private String expirationDate;
      
    /** The value for the supplierId field */
    private int supplierId;
      
    /** The value for the itemId field */
    private int itemId;
      
    /** The value for the acquisitionCost field */
    private double acquisitionCost;
  
    
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
    
          
                                  
        // update associated StockedItem
        if (collStockedItems != null)
        {
            for (int i = 0; i < collStockedItems.size(); i++)
            {
                ((StockedItem) collStockedItems.get(i))
                    .setItemBatchId(v);
            }
        }
                                          
        // update associated WithdrawnItem
        if (collWithdrawnItems != null)
        {
            for (int i = 0; i < collWithdrawnItems.size(); i++)
            {
                ((WithdrawnItem) collWithdrawnItems.get(i))
                    .setItemBatchId(v);
            }
        }
                      }
  
    /**
     * Get the BatchNo
     *
     * @return int
     */
    public int getBatchNo()
    {
        return batchNo;
    }

                        
    /**
     * Set the value of BatchNo
     *
     * @param v new value
     */
    public void setBatchNo(int v) 
    {
    
                  if (this.batchNo != v)
              {
            this.batchNo = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the ExpirationDate
     *
     * @return String
     */
    public String getExpirationDate()
    {
        return expirationDate;
    }

                        
    /**
     * Set the value of ExpirationDate
     *
     * @param v new value
     */
    public void setExpirationDate(String v) 
    {
    
                  if (!ObjectUtils.equals(this.expirationDate, v))
              {
            this.expirationDate = v;
            setModified(true);
        }
    
          
              }
  
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
    
                          
                if (aSupplier != null && !(aSupplier.getSupplierId() == v))
                {
            aSupplier = null;
        }
      
              }
  
    /**
     * Get the ItemId
     *
     * @return int
     */
    public int getItemId()
    {
        return itemId;
    }

                              
    /**
     * Set the value of ItemId
     *
     * @param v new value
     */
    public void setItemId(int v) throws TorqueException
    {
    
                  if (this.itemId != v)
              {
            this.itemId = v;
            setModified(true);
        }
    
                          
                if (aItem != null && !(aItem.getItemId() == v))
                {
            aItem = null;
        }
      
              }
  
    /**
     * Get the AcquisitionCost
     *
     * @return double
     */
    public double getAcquisitionCost()
    {
        return acquisitionCost;
    }

                        
    /**
     * Set the value of AcquisitionCost
     *
     * @param v new value
     */
    public void setAcquisitionCost(double v) 
    {
    
                  if (this.acquisitionCost != v)
              {
            this.acquisitionCost = v;
            setModified(true);
        }
    
          
              }
  
      
    
                  
    
        private Supplier aSupplier;

    /**
     * Declares an association between this object and a Supplier object
     *
     * @param v Supplier
     * @throws TorqueException
     */
    public void setSupplier(Supplier v) throws TorqueException
    {
            if (v == null)
        {
                    setSupplierId(0);
                  }
        else
        {
            setSupplierId(v.getSupplierId());
        }
                aSupplier = v;
    }

                                            
    /**
     * Get the associated Supplier object
     *
     * @return the associated Supplier object
     * @throws TorqueException
     */
    public Supplier getSupplier() throws TorqueException
    {
        if (aSupplier == null && (this.supplierId > 0))
        {
                          aSupplier = SupplierPeer.retrieveByPK(SimpleKey.keyFor(this.supplierId));
              
            /* The following can be used instead of the line above to
               guarantee the related object contains a reference
               to this object, but this level of coupling
               may be undesirable in many circumstances.
               As it can lead to a db query with many results that may
               never be used.
               Supplier obj = SupplierPeer.retrieveByPK(this.supplierId);
               obj.addItemBatchs(this);
            */
        }
        return aSupplier;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey.  e.g.
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
           */
    public void setSupplierKey(ObjectKey key) throws TorqueException
    {
      
                        setSupplierId(((NumberKey) key).intValue());
                  }
    
    
                  
    
        private Item aItem;

    /**
     * Declares an association between this object and a Item object
     *
     * @param v Item
     * @throws TorqueException
     */
    public void setItem(Item v) throws TorqueException
    {
            if (v == null)
        {
                    setItemId(0);
                  }
        else
        {
            setItemId(v.getItemId());
        }
                aItem = v;
    }

                                            
    /**
     * Get the associated Item object
     *
     * @return the associated Item object
     * @throws TorqueException
     */
    public Item getItem() throws TorqueException
    {
        if (aItem == null && (this.itemId > 0))
        {
                          aItem = ItemPeer.retrieveByPK(SimpleKey.keyFor(this.itemId));
              
            /* The following can be used instead of the line above to
               guarantee the related object contains a reference
               to this object, but this level of coupling
               may be undesirable in many circumstances.
               As it can lead to a db query with many results that may
               never be used.
               Item obj = ItemPeer.retrieveByPK(this.itemId);
               obj.addItemBatchs(this);
            */
        }
        return aItem;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey.  e.g.
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
           */
    public void setItemKey(ObjectKey key) throws TorqueException
    {
      
                        setItemId(((NumberKey) key).intValue());
                  }
       
                                
            
    /**
     * Collection to store aggregation of collStockedItems
     */
    protected List collStockedItems;

    /**
     * Temporary storage of collStockedItems to save a possible db hit in
     * the event objects are add to the collection, but the
     * complete collection is never requested.
     */
    protected void initStockedItems()
    {
        if (collStockedItems == null)
        {
            collStockedItems = new ArrayList();
        }
    }

    /**
     * Method called to associate a StockedItem object to this object
     * through the StockedItem foreign key attribute
     *
     * @param l StockedItem
     * @throws TorqueException
     */
    public void addStockedItem(StockedItem l) throws TorqueException
    {
        getStockedItems().add(l);
        l.setItemBatch((ItemBatch) this);
    }

    /**
     * The criteria used to select the current contents of collStockedItems
     */
    private Criteria lastStockedItemsCriteria = null;

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getStockedItems(new Criteria())
     *
     * @throws TorqueException
     */
    public List getStockedItems() throws TorqueException
    {
        if (collStockedItems == null)
        {
            collStockedItems = getStockedItems(new Criteria(10));
        }
        return collStockedItems;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ItemBatch has previously
     * been saved, it will retrieve related StockedItems from storage.
     * If this ItemBatch is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getStockedItems(Criteria criteria) throws TorqueException
    {
        if (collStockedItems == null)
        {
            if (isNew())
            {
               collStockedItems = new ArrayList();
            }
            else
            {
                      criteria.add(StockedItemPeer.ITEMBATCHID, getItemBatchId() );
                      collStockedItems = StockedItemPeer.doSelect(criteria);
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
                      criteria.add(StockedItemPeer.ITEMBATCHID, getItemBatchId());
                      if (!lastStockedItemsCriteria.equals(criteria))
                {
                    collStockedItems = StockedItemPeer.doSelect(criteria);
                }
            }
        }
        lastStockedItemsCriteria = criteria;

        return collStockedItems;
    }

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getStockedItems(new Criteria(),Connection)
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getStockedItems(Connection con) throws TorqueException
    {
        if (collStockedItems == null)
        {
            collStockedItems = getStockedItems(new Criteria(10), con);
        }
        return collStockedItems;
    }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ItemBatch has previously
     * been saved, it will retrieve related StockedItems from storage.
     * If this ItemBatch is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getStockedItems(Criteria criteria, Connection con)
            throws TorqueException
    {
        if (collStockedItems == null)
        {
            if (isNew())
            {
               collStockedItems = new ArrayList();
            }
            else
            {
                       criteria.add(StockedItemPeer.ITEMBATCHID, getItemBatchId());
                       collStockedItems = StockedItemPeer.doSelect(criteria, con);
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
                       criteria.add(StockedItemPeer.ITEMBATCHID, getItemBatchId());
                       if (!lastStockedItemsCriteria.equals(criteria))
                 {
                     collStockedItems = StockedItemPeer.doSelect(criteria, con);
                 }
             }
         }
         lastStockedItemsCriteria = criteria;

         return collStockedItems;
     }

                  
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this ItemBatch is new, it will return
     * an empty collection; or if this ItemBatch has previously
     * been saved, it will retrieve related StockedItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ItemBatch.
     */
    protected List getStockedItemsJoinItemBatch(Criteria criteria)
        throws TorqueException
    {
        if (collStockedItems == null)
        {
            if (isNew())
            {
               collStockedItems = new ArrayList();
            }
            else
            {
                            criteria.add(StockedItemPeer.ITEMBATCHID, getItemBatchId());
                            collStockedItems = StockedItemPeer.doSelectJoinItemBatch(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                        criteria.add(StockedItemPeer.ITEMBATCHID, getItemBatchId());
                        if (!lastStockedItemsCriteria.equals(criteria))
            {
                collStockedItems = StockedItemPeer.doSelectJoinItemBatch(criteria);
            }
        }
        lastStockedItemsCriteria = criteria;

        return collStockedItems;
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
        l.setItemBatch((ItemBatch) this);
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
     * Otherwise if this ItemBatch has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     * If this ItemBatch is new, it will return
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
                      criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId() );
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
                      criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId());
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
     * Otherwise if this ItemBatch has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     * If this ItemBatch is new, it will return
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
                       criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId());
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
                       criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId());
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
     * Otherwise if this ItemBatch is new, it will return
     * an empty collection; or if this ItemBatch has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ItemBatch.
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
                            criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId());
                            collWithdrawnItems = WithdrawnItemPeer.doSelectJoinDoctor(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                        criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId());
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
     * Otherwise if this ItemBatch is new, it will return
     * an empty collection; or if this ItemBatch has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ItemBatch.
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
                            criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId());
                            collWithdrawnItems = WithdrawnItemPeer.doSelectJoinSale(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                        criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId());
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
     * Otherwise if this ItemBatch is new, it will return
     * an empty collection; or if this ItemBatch has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ItemBatch.
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
                            criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId());
                            collWithdrawnItems = WithdrawnItemPeer.doSelectJoinItemBatch(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                        criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId());
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
     * Otherwise if this ItemBatch is new, it will return
     * an empty collection; or if this ItemBatch has previously
     * been saved, it will retrieve related WithdrawnItems from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in ItemBatch.
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
                            criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId());
                            collWithdrawnItems = WithdrawnItemPeer.doSelectJoinUser(criteria);
            }
        }
        else
        {
            // the following code is to determine if a new query is
            // called for.  If the criteria is the same as the last
            // one, just return the collection.
            boolean newCriteria = true;
                        criteria.add(WithdrawnItemPeer.ITEMBATCHID, getItemBatchId());
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
              fieldNames.add("ItemBatchId");
              fieldNames.add("BatchNo");
              fieldNames.add("ExpirationDate");
              fieldNames.add("SupplierId");
              fieldNames.add("ItemId");
              fieldNames.add("AcquisitionCost");
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
          if (name.equals("ItemBatchId"))
        {
                return new Integer(getItemBatchId());
            }
          if (name.equals("BatchNo"))
        {
                return new Integer(getBatchNo());
            }
          if (name.equals("ExpirationDate"))
        {
                return getExpirationDate();
            }
          if (name.equals("SupplierId"))
        {
                return new Integer(getSupplierId());
            }
          if (name.equals("ItemId"))
        {
                return new Integer(getItemId());
            }
          if (name.equals("AcquisitionCost"))
        {
                return new Double(getAcquisitionCost());
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
          if (name.equals(ItemBatchPeer.ITEMBATCHID))
        {
                return new Integer(getItemBatchId());
            }
          if (name.equals(ItemBatchPeer.BATCHNO))
        {
                return new Integer(getBatchNo());
            }
          if (name.equals(ItemBatchPeer.EXPIRATIONDATE))
        {
                return getExpirationDate();
            }
          if (name.equals(ItemBatchPeer.SUPPLIERID))
        {
                return new Integer(getSupplierId());
            }
          if (name.equals(ItemBatchPeer.ITEMID))
        {
                return new Integer(getItemId());
            }
          if (name.equals(ItemBatchPeer.ACQUISITIONCOST))
        {
                return new Double(getAcquisitionCost());
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
                return new Integer(getItemBatchId());
            }
              if (pos == 1)
        {
                return new Integer(getBatchNo());
            }
              if (pos == 2)
        {
                return getExpirationDate();
            }
              if (pos == 3)
        {
                return new Integer(getSupplierId());
            }
              if (pos == 4)
        {
                return new Integer(getItemId());
            }
              if (pos == 5)
        {
                return new Double(getAcquisitionCost());
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
          save(ItemBatchPeer.getMapBuilder()
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
                    ItemBatchPeer.doInsert((ItemBatch) this, con);
                    setNew(false);
                }
                else
                {
                    ItemBatchPeer.doUpdate((ItemBatch) this, con);
                }
            }

                                      
                
            if (collStockedItems != null)
            {
                for (int i = 0; i < collStockedItems.size(); i++)
                {
                    ((StockedItem) collStockedItems.get(i)).save(con);
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
     * @param  itemBatchId ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setItemBatchId(((NumberKey) key).intValue());
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setItemBatchId(Integer.parseInt(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getItemBatchId());
      }

 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections and sets the
     * related objects to isNew=true.
       */
      public ItemBatch copy() throws TorqueException
    {
        return copyInto(new ItemBatch());
    }
  
    protected ItemBatch copyInto(ItemBatch copyObj) throws TorqueException
    {
          copyObj.setItemBatchId(itemBatchId);
          copyObj.setBatchNo(batchNo);
          copyObj.setExpirationDate(expirationDate);
          copyObj.setSupplierId(supplierId);
          copyObj.setItemId(itemId);
          copyObj.setAcquisitionCost(acquisitionCost);
  
                    copyObj.setItemBatchId(0);
                                          
                                      
                
        List v = getStockedItems();
        for (int i = 0; i < v.size(); i++)
        {
            StockedItem obj = (StockedItem) v.get(i);
            copyObj.addStockedItem(obj.copy());
        }
                                                  
                
        v = getWithdrawnItems();
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
    public ItemBatchPeer getPeer()
    {
        return peer;
    }

    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("ItemBatch:\n");
        str.append("ItemBatchId = ")
           .append(getItemBatchId())
           .append("\n");
        str.append("BatchNo = ")
           .append(getBatchNo())
           .append("\n");
        str.append("ExpirationDate = ")
           .append(getExpirationDate())
           .append("\n");
        str.append("SupplierId = ")
           .append(getSupplierId())
           .append("\n");
        str.append("ItemId = ")
           .append(getItemId())
           .append("\n");
        str.append("AcquisitionCost = ")
           .append(getAcquisitionCost())
           .append("\n");
        return(str.toString());
    }
}
