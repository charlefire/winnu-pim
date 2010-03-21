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
  * [Sun Mar 21 10:32:41 SGT 2010]
  *
  */
public class StockedItemMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "winnu.dao.map.StockedItemMapBuilder";


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

        dbMap.addTable("StockedItem");
        TableMap tMap = dbMap.getTable("StockedItem");

        tMap.setPrimaryKeyMethod(TableMap.NATIVE);


              tMap.addPrimaryKey("StockedItem.STOCKEDITEMID", new Integer(0));
                    tMap.addColumn("StockedItem.CURRENTPRICE", new Double(0));
                    tMap.addColumn("StockedItem.QUANTITY", new Integer(0));
                    tMap.addForeignKey(
                "StockedItem.ITEMBATCHID", new Integer(0) , "ItemBatch" ,
                "itemBatchId");
          }
}
