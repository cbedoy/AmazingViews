package cbedoy.amazingviews.gui.view.adapter;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cbedoy.amazingviews.R;
import cbedoy.amazingviews.domain.CategoryItem;

/**
 * Custom implementation of an ArrayAdapter used in a CategoryView to show the
 * "shop items" (CategoryItem) and their info such as title, price and image in a
 * custom layout.
 * @author Par Amsen, www.trixigt.com
 *
 */
public class CategoryGridAdapter extends ArrayAdapter<CategoryItem>{
	private Context context;
	private int layoutResourceId = R.layout.main_category_item;
	private List<CategoryItem> data = new ArrayList<CategoryItem>();
 
	public CategoryGridAdapter(Context context, List<CategoryItem> data) {
		super(context, R.layout.main_category_item, data);
		
		this.context = context;
		this.data = data;
	}
 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		ViewHolder holder = null;
 
		if (row == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			row = inflater.inflate(layoutResourceId, parent, false);
			holder = new ViewHolder();
			holder.title = (TextView) row.findViewById(R.id.txt_main_category_item_title);
			holder.price = (TextView) row.findViewById(R.id.txt_main_category_item_price);
			holder.image = (ImageView) row.findViewById(R.id.img_main_category_item);
			row.setTag(holder);
		} else {
			holder = (ViewHolder) row.getTag();
		}
 
		CategoryItem item = data.get(position);
		holder.title.setText(item.getTitle());
		holder.price.setText(item.getPrice());
		holder.image.setImageDrawable(item.getIcon());
		
		return row;
	}
 
	static class ViewHolder {
		TextView title;
		TextView price;
		ImageView image;
	}
}
