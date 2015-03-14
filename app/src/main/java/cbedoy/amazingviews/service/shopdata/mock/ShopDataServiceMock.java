package cbedoy.amazingviews.service.shopdata.mock;


import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

import cbedoy.amazingviews.R;
import cbedoy.amazingviews.domain.Category;
import cbedoy.amazingviews.domain.CategoryItem;
import cbedoy.amazingviews.service.shopdata.ShopDataService;
import cbedoy.amazingviews.utils.ImageScaler;

/**
 * Mock service/repo implementation for shop data
 * @author Par Amsen, www.trixigt.com
 *
 */
public class ShopDataServiceMock implements ShopDataService {
    @Override
    public List<Category> getShopData(Context context) {
		
	Resources resources = context.getResources();
	List<Category> categories = new ArrayList<Category>();
	
	List<CategoryItem> tempHats = new ArrayList<CategoryItem>();
	List<CategoryItem> tempShoes = new ArrayList<CategoryItem>();
	List<CategoryItem> tempGlasses = new ArrayList<CategoryItem>();
	List<CategoryItem> tempShirts = new ArrayList<CategoryItem>();
	List<CategoryItem> tempBags = new ArrayList<CategoryItem>();

	//init mock shop items
	CategoryItem tempHat1 = new CategoryItem("Plommonstop", "999.99$", ImageScaler.getSquareScaledDrawable(context, R.drawable.content_hat1, 200));
	CategoryItem tempHat2 = new CategoryItem("Croc'", "3.99$",  ImageScaler.getSquareScaledDrawable(context, R.drawable.content_hat2, 300));
	CategoryItem tempShoe1 = new CategoryItem("Brown Dhoe", "99$",  ImageScaler.getSquareScaledDrawable(context, R.drawable.content_shoe1, 100));
	CategoryItem tempShoe2 = new CategoryItem("Fedora Shoe", "9$",  ImageScaler.getSquareScaledDrawable(context, R.drawable.content_shoe2, 200));
	CategoryItem tempGlasses1 = new CategoryItem("Shotty", "99$",  ImageScaler.getSquareScaledDrawable(context, R.drawable.content_glasses1, 100));
	CategoryItem tempGlasses2 = new CategoryItem("Hipster", "76$",  ImageScaler.getSquareScaledDrawable(context, R.drawable.content_glasses2, 100));
	CategoryItem tempShirt1 = new CategoryItem("Less Classy", "666$",  ImageScaler.getSquareScaledDrawable(context, R.drawable.content_shirt1, 200));
	CategoryItem tempShirt2 = new CategoryItem("Classy", "34$",  ImageScaler.getSquareScaledDrawable(context, R.drawable.content_shirt2, 200));
	CategoryItem tempBags1 = new CategoryItem("Military Bag", "99$",  ImageScaler.getSquareScaledDrawable(context, R.drawable.content_bags1, 100));
	CategoryItem tempBags2 = new CategoryItem("Sport Bag", "2$",  ImageScaler.getSquareScaledDrawable(context, R.drawable.content_bags2, 200));

	tempHats.add(tempHat1);
	tempHats.add(tempHat2);
	tempHats.add(tempHat2);
	tempHats.add(tempHat1);
	tempHats.add(tempHat1);
	tempHats.add(tempHat2); 

	tempShoes.add(tempShoe1);
	tempShoes.add(tempShoe2);
	tempShoes.add(tempShoe2);
	tempShoes.add(tempShoe1);
	tempShoes.add(tempShoe1);
	tempShoes.add(tempShoe2);

	tempGlasses.add(tempGlasses1);
	tempGlasses.add(tempGlasses2);
	tempGlasses.add(tempGlasses2);
	tempGlasses.add(tempGlasses1);
	tempGlasses.add(tempGlasses1);
	tempGlasses.add(tempGlasses2);

	tempShirts.add(tempShirt1);
	tempShirts.add(tempShirt2);
	tempShirts.add(tempShirt2);
	tempShirts.add(tempShirt1);
	tempShirts.add(tempShirt1);
	tempShirts.add(tempShirt2);

	tempBags.add(tempBags1);
	tempBags.add(tempBags2);
	tempBags.add(tempBags2);
	tempBags.add(tempBags1);
	tempBags.add(tempBags1);
	tempBags.add(tempBags2);
	
	// Create the categories and assign icons/image, titles and background colors to be used throughout the app, the icon/image
	// is shown in the main menu.
	Category categoryHats = new Category("HATS", tempHats, resources.getColor(R.color.category_hats), resources.getDrawable(R.drawable.ico_hats), 0);
	Category categoryShoes = new Category("SHOES", tempShoes, resources.getColor(R.color.category_shoes), resources.getDrawable(R.drawable.ico_shoes), 1);
	Category categoryGlasses = new Category("GLASSES", tempGlasses, resources.getColor(R.color.category_glasses), resources.getDrawable(R.drawable.ico_glasses), 2);
	Category categoryShirts = new Category("SHIRTS", tempShirts, resources.getColor(R.color.category_shirts), resources.getDrawable(R.drawable.ico_shirt), 3);
	Category categoryBags = new Category("BAGS", tempBags, resources.getColor(R.color.category_bags), resources.getDrawable(R.drawable.ico_bags), 4);

	categories.add(categoryHats);
	categories.add(categoryShoes);
	categories.add(categoryGlasses);
	categories.add(categoryShirts);
	categories.add(categoryBags);
	
	return categories;
}
}
