package androidx.browser.customtabs;

/* loaded from: classes.dex */
public final class CustomTabsIntent {
    public final android.content.Intent intent;
    public final android.os.Bundle startAnimationBundle;

    public static final class Builder {
        private java.util.ArrayList<android.os.Bundle> mActionButtons;
        private android.util.SparseArray<android.os.Bundle> mColorSchemeParamBundles;
        private final androidx.browser.customtabs.CustomTabColorSchemeParams.Builder mDefaultColorSchemeBuilder;
        private android.os.Bundle mDefaultColorSchemeBundle;
        private boolean mInstantAppsEnabled;
        private final android.content.Intent mIntent;
        private java.util.ArrayList<android.os.Bundle> mMenuItems;
        private int mShareState;
        private android.os.Bundle mStartAnimationBundle;

        public Builder() {
                r2 = this;
                r2.<init>()
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)
                r2.mIntent = r0
                androidx.browser.customtabs.CustomTabColorSchemeParams$Builder r0 = new androidx.browser.customtabs.CustomTabColorSchemeParams$Builder
                r0.<init>()
                r2.mDefaultColorSchemeBuilder = r0
                r0 = 0
                r2.mShareState = r0
                r0 = 1
                r2.mInstantAppsEnabled = r0
                return
        }

        public Builder(androidx.browser.customtabs.CustomTabsSession r3) {
                r2 = this;
                r2.<init>()
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "android.intent.action.VIEW"
                r0.<init>(r1)
                r2.mIntent = r0
                androidx.browser.customtabs.CustomTabColorSchemeParams$Builder r0 = new androidx.browser.customtabs.CustomTabColorSchemeParams$Builder
                r0.<init>()
                r2.mDefaultColorSchemeBuilder = r0
                r0 = 0
                r2.mShareState = r0
                r0 = 1
                r2.mInstantAppsEnabled = r0
                if (r3 == 0) goto L1e
                r2.setSession(r3)
            L1e:
                return
        }

        private void setSessionParameters(android.os.IBinder r3, android.app.PendingIntent r4) {
                r2 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.customtabs.extra.SESSION"
                androidx.core.app.BundleCompat.putBinder(r0, r1, r3)
                if (r4 == 0) goto L11
                java.lang.String r3 = "android.support.customtabs.extra.SESSION_ID"
                r0.putParcelable(r3, r4)
            L11:
                android.content.Intent r3 = r2.mIntent
                r3.putExtras(r0)
                return
        }

        public androidx.browser.customtabs.CustomTabsIntent build() {
                r3 = this;
                android.content.Intent r0 = r3.mIntent
                java.lang.String r1 = "android.support.customtabs.extra.SESSION"
                boolean r0 = r0.hasExtra(r1)
                if (r0 != 0) goto Le
                r0 = 0
                r3.setSessionParameters(r0, r0)
            Le:
                java.util.ArrayList<android.os.Bundle> r0 = r3.mMenuItems
                if (r0 == 0) goto L19
                android.content.Intent r1 = r3.mIntent
                java.lang.String r2 = "android.support.customtabs.extra.MENU_ITEMS"
                r1.putParcelableArrayListExtra(r2, r0)
            L19:
                java.util.ArrayList<android.os.Bundle> r0 = r3.mActionButtons
                if (r0 == 0) goto L24
                android.content.Intent r1 = r3.mIntent
                java.lang.String r2 = "android.support.customtabs.extra.TOOLBAR_ITEMS"
                r1.putParcelableArrayListExtra(r2, r0)
            L24:
                android.content.Intent r0 = r3.mIntent
                boolean r1 = r3.mInstantAppsEnabled
                java.lang.String r2 = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS"
                r0.putExtra(r2, r1)
                android.content.Intent r0 = r3.mIntent
                androidx.browser.customtabs.CustomTabColorSchemeParams$Builder r1 = r3.mDefaultColorSchemeBuilder
                androidx.browser.customtabs.CustomTabColorSchemeParams r1 = r1.build()
                android.os.Bundle r1 = r1.toBundle()
                r0.putExtras(r1)
                android.os.Bundle r0 = r3.mDefaultColorSchemeBundle
                if (r0 == 0) goto L45
                android.content.Intent r1 = r3.mIntent
                r1.putExtras(r0)
            L45:
                android.util.SparseArray<android.os.Bundle> r0 = r3.mColorSchemeParamBundles
                if (r0 == 0) goto L5a
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                android.util.SparseArray<android.os.Bundle> r1 = r3.mColorSchemeParamBundles
                java.lang.String r2 = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS"
                r0.putSparseParcelableArray(r2, r1)
                android.content.Intent r1 = r3.mIntent
                r1.putExtras(r0)
            L5a:
                android.content.Intent r0 = r3.mIntent
                int r1 = r3.mShareState
                java.lang.String r2 = "androidx.browser.customtabs.extra.SHARE_STATE"
                r0.putExtra(r2, r1)
                androidx.browser.customtabs.CustomTabsIntent r0 = new androidx.browser.customtabs.CustomTabsIntent
                android.content.Intent r1 = r3.mIntent
                android.os.Bundle r2 = r3.mStartAnimationBundle
                r0.<init>(r1, r2)
                return r0
        }

        public androidx.browser.customtabs.CustomTabsIntent.Builder setSession(androidx.browser.customtabs.CustomTabsSession r3) {
                r2 = this;
                android.content.Intent r0 = r2.mIntent
                android.content.ComponentName r1 = r3.getComponentName()
                java.lang.String r1 = r1.getPackageName()
                r0.setPackage(r1)
                android.os.IBinder r0 = r3.getBinder()
                android.app.PendingIntent r3 = r3.getId()
                r2.setSessionParameters(r0, r3)
                return r2
        }
    }

    CustomTabsIntent(android.content.Intent r1, android.os.Bundle r2) {
            r0 = this;
            r0.<init>()
            r0.intent = r1
            r0.startAnimationBundle = r2
            return
    }

    public void launchUrl(android.content.Context r2, android.net.Uri r3) {
            r1 = this;
            android.content.Intent r0 = r1.intent
            r0.setData(r3)
            android.content.Intent r3 = r1.intent
            android.os.Bundle r0 = r1.startAnimationBundle
            androidx.core.content.ContextCompat.startActivity(r2, r3, r0)
            return
    }
}
