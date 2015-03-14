package cbedoy.amazingviews.service.shopdata;


import android.content.Context;

import java.util.List;

import cbedoy.amazingviews.domain.Category;

public interface ShopDataService {
	public List<Category> getShopData(Context context);
}
