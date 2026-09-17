package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class zaaa extends android.widget.Button {
    public zaaa(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r3 = 0
            r0 = 16842824(0x1010048, float:2.369376E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    private static final int zab(int r0, int r1, int r2, int r3) {
            if (r0 == 0) goto L21
            r1 = 1
            if (r0 == r1) goto L20
            r1 = 2
            if (r0 != r1) goto L9
            return r3
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown color scheme: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L20:
            return r2
        L21:
            return r1
    }

    public final void zaa(android.content.res.Resources r6, int r7, int r8) {
            r5 = this;
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r5.setTypeface(r0)
            r0 = 1096810496(0x41600000, float:14.0)
            r5.setTextSize(r0)
            android.util.DisplayMetrics r0 = r6.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1111490560(0x42400000, float:48.0)
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r5.setMinHeight(r0)
            r5.setMinWidth(r0)
            int r0 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark
            int r1 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light
            int r0 = zab(r8, r0, r1, r1)
            int r1 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark
            int r2 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light
            int r1 = zab(r8, r1, r2, r2)
            java.lang.String r2 = "Unknown button size: "
            r3 = 2
            r4 = 1
            if (r7 == 0) goto L4e
            if (r7 == r4) goto L4e
            if (r7 != r3) goto L39
            goto L4f
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L4e:
            r0 = r1
        L4f:
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            int r1 = com.google.android.gms.base.R.color.common_google_signin_btn_tint
            android.content.res.ColorStateList r1 = r6.getColorStateList(r1)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
            r5.setBackgroundDrawable(r0)
            int r0 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark
            int r1 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light
            int r8 = zab(r8, r0, r1, r1)
            android.content.res.ColorStateList r8 = r6.getColorStateList(r8)
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            android.content.res.ColorStateList r8 = (android.content.res.ColorStateList) r8
            r5.setTextColor(r8)
            r8 = 0
            if (r7 == 0) goto La7
            if (r7 == r4) goto L9d
            if (r7 != r3) goto L88
            r5.setText(r8)
            goto Lb0
        L88:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L9d:
            int r7 = com.google.android.gms.base.R.string.common_signin_button_text_long
            java.lang.String r6 = r6.getString(r7)
            r5.setText(r6)
            goto Lb0
        La7:
            int r7 = com.google.android.gms.base.R.string.common_signin_button_text
            java.lang.String r6 = r6.getString(r7)
            r5.setText(r6)
        Lb0:
            r5.setTransformationMethod(r8)
            android.content.Context r6 = r5.getContext()
            boolean r6 = com.google.android.gms.common.util.DeviceProperties.isWearable(r6)
            if (r6 == 0) goto Lc2
            r6 = 19
            r5.setGravity(r6)
        Lc2:
            return
    }
}
