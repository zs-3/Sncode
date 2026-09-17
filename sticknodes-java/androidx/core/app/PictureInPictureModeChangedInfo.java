package androidx.core.app;

/* loaded from: classes.dex */
public final class PictureInPictureModeChangedInfo {
    private final boolean mIsInPictureInPictureMode;
    private final android.content.res.Configuration mNewConfig;

    public PictureInPictureModeChangedInfo(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.mIsInPictureInPictureMode = r1
            r1 = 0
            r0.mNewConfig = r1
            return
    }

    public PictureInPictureModeChangedInfo(boolean r1, android.content.res.Configuration r2) {
            r0 = this;
            r0.<init>()
            r0.mIsInPictureInPictureMode = r1
            r0.mNewConfig = r2
            return
    }

    public boolean isInPictureInPictureMode() {
            r1 = this;
            boolean r0 = r1.mIsInPictureInPictureMode
            return r0
    }
}
