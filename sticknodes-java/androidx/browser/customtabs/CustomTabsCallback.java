package androidx.browser.customtabs;

/* loaded from: classes.dex */
public class CustomTabsCallback {
    public static final int NAVIGATION_ABORTED = 4;
    public static final int NAVIGATION_FAILED = 3;
    public static final int NAVIGATION_FINISHED = 2;
    public static final int NAVIGATION_STARTED = 1;
    public static final java.lang.String ONLINE_EXTRAS_KEY = "online";
    public static final int TAB_HIDDEN = 6;
    public static final int TAB_SHOWN = 5;

    public CustomTabsCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    public void extraCallback(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    public android.os.Bundle extraCallbackWithResult(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void onMessageChannelReady(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public void onNavigationEvent(int r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    public void onPostMessage(java.lang.String r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    public void onRelationshipValidationResult(int r1, android.net.Uri r2, boolean r3, android.os.Bundle r4) {
            r0 = this;
            return
    }
}
