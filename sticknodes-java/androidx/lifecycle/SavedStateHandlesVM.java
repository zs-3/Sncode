package androidx.lifecycle;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class SavedStateHandlesVM extends androidx.lifecycle.ViewModel {
    private final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle> handles;

    public SavedStateHandlesVM() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.handles = r0
            return
    }

    public final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle> getHandles() {
            r1 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle> r0 = r1.handles
            return r0
    }
}
