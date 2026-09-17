package androidx.core.app;

/* loaded from: classes.dex */
public final class MultiWindowModeChangedInfo {
    private final boolean mIsInMultiWindowMode;
    private final android.content.res.Configuration mNewConfig;

    public MultiWindowModeChangedInfo(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.mIsInMultiWindowMode = r1
            r1 = 0
            r0.mNewConfig = r1
            return
    }

    public MultiWindowModeChangedInfo(boolean r1, android.content.res.Configuration r2) {
            r0 = this;
            r0.<init>()
            r0.mIsInMultiWindowMode = r1
            r0.mNewConfig = r2
            return
    }

    public boolean isInMultiWindowMode() {
            r1 = this;
            boolean r0 = r1.mIsInMultiWindowMode
            return r0
    }
}
