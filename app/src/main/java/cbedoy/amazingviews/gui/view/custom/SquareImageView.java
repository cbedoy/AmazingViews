package cbedoy.amazingviews.gui.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * An SquateImageView is an ImageView that sets the height to be the same as the width of the view
 * @author Par Amsen, www.trixigt.com
 *
 */
public class SquareImageView extends ImageView {

	public SquareImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public SquareImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SquareImageView(Context context) {
		super(context);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
	}
	
}
