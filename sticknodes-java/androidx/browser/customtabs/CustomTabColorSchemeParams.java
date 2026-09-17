package androidx.browser.customtabs;

/* loaded from: classes.dex */
public final class CustomTabColorSchemeParams {
    public final java.lang.Integer navigationBarColor;
    public final java.lang.Integer navigationBarDividerColor;
    public final java.lang.Integer secondaryToolbarColor;
    public final java.lang.Integer toolbarColor;

    public static final class Builder {
        private java.lang.Integer mNavigationBarColor;
        private java.lang.Integer mNavigationBarDividerColor;
        private java.lang.Integer mSecondaryToolbarColor;
        private java.lang.Integer mToolbarColor;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public androidx.browser.customtabs.CustomTabColorSchemeParams build() {
                r5 = this;
                androidx.browser.customtabs.CustomTabColorSchemeParams r0 = new androidx.browser.customtabs.CustomTabColorSchemeParams
                java.lang.Integer r1 = r5.mToolbarColor
                java.lang.Integer r2 = r5.mSecondaryToolbarColor
                java.lang.Integer r3 = r5.mNavigationBarColor
                java.lang.Integer r4 = r5.mNavigationBarDividerColor
                r0.<init>(r1, r2, r3, r4)
                return r0
        }
    }

    CustomTabColorSchemeParams(java.lang.Integer r1, java.lang.Integer r2, java.lang.Integer r3, java.lang.Integer r4) {
            r0 = this;
            r0.<init>()
            r0.toolbarColor = r1
            r0.secondaryToolbarColor = r2
            r0.navigationBarColor = r3
            r0.navigationBarDividerColor = r4
            return
    }

    android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Integer r1 = r3.toolbarColor
            if (r1 == 0) goto L12
            int r1 = r1.intValue()
            java.lang.String r2 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            r0.putInt(r2, r1)
        L12:
            java.lang.Integer r1 = r3.secondaryToolbarColor
            if (r1 == 0) goto L1f
            int r1 = r1.intValue()
            java.lang.String r2 = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"
            r0.putInt(r2, r1)
        L1f:
            java.lang.Integer r1 = r3.navigationBarColor
            if (r1 == 0) goto L2c
            int r1 = r1.intValue()
            java.lang.String r2 = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR"
            r0.putInt(r2, r1)
        L2c:
            java.lang.Integer r1 = r3.navigationBarDividerColor
            if (r1 == 0) goto L39
            int r1 = r1.intValue()
            java.lang.String r2 = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR"
            r0.putInt(r2, r1)
        L39:
            return r0
    }
}
