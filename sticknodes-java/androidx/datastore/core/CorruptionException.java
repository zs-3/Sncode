package androidx.datastore.core;

/* compiled from: Serializer.kt */
/* loaded from: classes.dex */
public final class CorruptionException extends java.io.IOException {
    public CorruptionException(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2, r3)
            return
    }

    public /* synthetic */ CorruptionException(java.lang.String r1, java.lang.Throwable r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }
}
