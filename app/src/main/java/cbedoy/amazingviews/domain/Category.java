package cbedoy.amazingviews.domain;

import java.util.List;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * A Category holds its name, background color, icon and items (i.e. "shop items"). For example
 * the main menu buttons are initialized with the background color, icon (icon alpha) and title for each Category.
 * The background color is also used when viewing a Category as background.
 * @author Par Amsen, www.trixigt.com
 *
 */
public class Category {

	public final static float ICON_ALPHA = .3f;
	
	private String categoryName;
	
	/**
	 * This List holds all the "shop items" presented in a Category.
	 */
	private List<CategoryItem> items;
	private int categoryBackgroundColor;
	private Drawable categoryIcon;
	
	/**
	 * Assign a unique ID to the Category in order to be able to identify it in the view hierarchy later.
	 * For example the ID is assigned to each View so that a Category can be identified in an
	 * OnClickListener OnClick-event.
	 */
	private int id;
	
	public Category(String categoryName, List<CategoryItem> items, int categoryBackgroundColor, Drawable categoryIcon, int id) {
		this.categoryName = categoryName;
		this.items = items;
		this.categoryBackgroundColor = categoryBackgroundColor;
		this.categoryIcon = categoryIcon;
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<CategoryItem> getItems() {
		return items;
	}

	public void setItems(List<CategoryItem> items) {
		this.items = items;
	}

	public int getCategoryBackgroundColor() {
		return categoryBackgroundColor;
	}

	public void setCategoryBackgroundColor(int categoryBackgroundColor) {
		this.categoryBackgroundColor = categoryBackgroundColor;
	}

	public Drawable getCategoryIcon() {
		return categoryIcon;
	}

	public void setCategoryIcon(Drawable categoryIcon) {
		this.categoryIcon = categoryIcon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
