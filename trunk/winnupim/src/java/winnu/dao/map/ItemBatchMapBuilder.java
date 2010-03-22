package winnu.dao.map;

import java.util.Date;
import java.math.BigDecimal;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;

/**
  *  This class was autogenerated by Torque on:
  *
  * [Mon Mar 22 12:48:49 SGT 2010]
  *
  */
public class ItemBatchMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "winnu.dao.map.ItemBatchMapBuilder";


    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    public void doBuild() throws TorqueException
    {
        dbMap = Torque.getDatabaseMap("winnudb");

        dbMap.addTable("ItemBatch");
        TableMap tMap = dbMap.getTable("ItemBatch");

        tMap.setPrimaryKeyMethod(TableMap.NATIVE);


              tMap.addPrimaryKey("ItemBatch.ITEMBATCHID", new Integer(0));
                    tMap.addColumn("ItemBatch.BATCHNO", new Integer(0));
                    tMap.addColumn("ItemBatch.EXPIRATIONDATE", new String());
                    tMap.addColumn("ItemBatch.PURCHASEDDATE", new String());
                    tMap.addForeignKey(
                "ItemBatch.SUPPLIERID", new Integer(0) , "Supplier" ,
                "supplierId");
                    tMap.addForeignKey(
                "ItemBatch.ITEMID", new Integer(0) , "Item" ,
                "itemId");
                    tMap.addColumn("ItemBatch.ACQUISITIONCOST", new Double(0));
          }
}
