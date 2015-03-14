package cbedoy.amazingviews.gui.view.category;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import cbedoy.amazingviews.R;
import cbedoy.amazingviews.domain.CategoryItem;
import cbedoy.amazingviews.gui.view.custom.SquareImageView;

/**
 * A MainCategoryItem is a FrameLayout and used as View for the expanded "shop items" in each Category,
 * i.e. when a user selects an item in the grid this is used to visually present the "shop item" (CategoryItem).
 * 
 * A MainCategoryItem can also be created through XML with the defined XML-attributes for setting the
 * title, icon and price.
 * 
 * @author Par Amsen, www.trixigt.com
 *
 */
public class MainCategoryItem extends FrameLayout {

	private SquareImageView iconView;
	private TextView priceView;
	private TextView titleView;

	public MainCategoryItem(Context context, CategoryItem item) {
		super(context);

		init(context, null);

		iconView.setImageDrawable(item.getIcon());
		priceView.setText(item.getPrice());
		titleView.setText(item.getTitle());
	}

	public MainCategoryItem(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public MainCategoryItem(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MainCategoryItem(Context context) {
		super(context);
	}

	public void init(Context context, AttributeSet attrs) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.main_category_item, this, true);

		iconView = (SquareImageView) findViewById(R.id.img_main_category_item);
		priceView = (TextView) findViewById(R.id.txt_main_category_item_price);
		titleView = (TextView) findViewById(R.id.txt_main_category_item_title);

		
		if(attrs != null) {
			TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MainMenuItem, 0, 0);

			Drawable itemIcon = a.getDrawable(R.styleable.MainCategoryItem_categoryItemIcon);
			String itemPrice = a.getString(R.styleable.MainCategoryItem_categoryItemPrice);
			String itemTitle = a.getString(R.styleable.MainCategoryItem_categoryItemTitle);

			a.recycle();

			if(itemIcon != null && itemPrice != null && itemTitle != null) {
				iconView.setImageDrawable(itemIcon);
				priceView.setText(itemPrice);
				titleView.setText(itemTitle);
			}
		}
	}
}
