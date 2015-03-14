package cbedoy.amazingviews.domain;

import android.graphics.drawable.Drawable;

/**
 * A CategoryItem is equal to a shop item, i.e. it holds a price, an image of the product and the products name
 * @author Par Amsen, www.trixigt.com
 *
 */
public class CategoryItem {
	String title;
	String price;
	Drawable icon;

	public CategoryItem(String name, String price, Drawable icon) {
		super();
		this.title = name;
		this.price = price;
		this.icon = icon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String name) {
		this.title = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Drawable getIcon() {
		return icon;
	}

	public void setIcon(Drawable icon) {
		this.icon = icon;
	}

}
