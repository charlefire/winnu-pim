package winnu.control;

import winnu.dao.Item;
import winnu.dao.User;

public class WinnuControl {
    private User currentUser = null;
    private User currentSelectedUser = null;
    private Item currentSelectedItem = null;
    
    public AddAccountController addAccountController;
    public AddItemController addItemController;
    public AddItemToSaleController addItemToSaleController;
    public DeleteAccountController deleteAccountController;
    public LoginController loginController;
    public UserSearchController userSearchController;
    public ItemSearchController itemSearchController;
    public EditAccountController editAccountController;
    public AddSupplyController addSuppyController;
    public SaleController saleController;
    public SpecialWithdrawalController specialWithdrawalController;
    public ReplaceItemController replaceItemController;
    public ReportController reportController;
	public OverrideSaleController overrideSaleController;
    
    public WinnuControl(){
        addAccountController = new AddAccountController();
        addItemController = new AddItemController(this);
        deleteAccountController = new DeleteAccountController();
        loginController = new LoginController(this);
        userSearchController = new UserSearchController();
        itemSearchController = new ItemSearchController();
        editAccountController = new EditAccountController();
        addSuppyController = new AddSupplyController();
        addItemToSaleController = new AddItemToSaleController(this);
        saleController = new SaleController(this);
        specialWithdrawalController = new SpecialWithdrawalController(this);
        replaceItemController = new ReplaceItemController(this);
        reportController = new ReportController();
    }

    
    public User getCurrentUser(){
        return currentUser;
    }

    public void setCurrentUser(User user) {
        currentUser = user;
    }

    
    public Item getCurrentSelectedItem(){
        return currentSelectedItem;
    }

    public void setCurrentSelectedItem(Item item) {
        currentSelectedItem = item;
    }  
    public User getCurrentSelectedUser(){
        return currentSelectedUser;
    }

    public void setCurrentSelectedUser(User user) {
        currentSelectedUser = user;
    }
}
