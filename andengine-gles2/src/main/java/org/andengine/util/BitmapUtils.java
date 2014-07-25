package org.andengine.util;

import android.graphics.Bitmap;

/**
 * (c) 2013 Nicolas Gramlich
 *
 * @author Nicolas Gramlich
 * @since 18:52:32 - 18.02.2013
 */
public final class BitmapUtils {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	private BitmapUtils() {

	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * @param pBitmap
	 *
	 * @return a {@link android.graphics.Bitmap} that is {@link android.graphics.Bitmap#isMutable()}. If <code>pBitmap</code> is {@link android.graphics.Bitmap#isMutable()} then <code>pBitmap</code> is returned, otherwise a new {@link android.graphics.Bitmap} instance is returned that is {@link android.graphics.Bitmap#isMutable()} and <code>pBitmap</code> is {@link android.graphics.Bitmap#recycle()}d.
	 */
	public static Bitmap ensureBitmapIsMutable(final Bitmap pBitmap) {
		if (pBitmap.isMutable()) {
			return pBitmap;
		} else {
			final Bitmap mutableBitmap = pBitmap.copy(pBitmap.getConfig(), true);
			pBitmap.recycle();
			return mutableBitmap;
		}
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
