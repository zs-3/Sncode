package androidx.privacysandbox.ads.adservices.internal;

/* compiled from: BackCompatManager.kt */
/* loaded from: classes.dex */
public final class BackCompatManager {
    public static final androidx.privacysandbox.ads.adservices.internal.BackCompatManager INSTANCE = null;

    static {
            androidx.privacysandbox.ads.adservices.internal.BackCompatManager r0 = new androidx.privacysandbox.ads.adservices.internal.BackCompatManager
            r0.<init>()
            androidx.privacysandbox.ads.adservices.internal.BackCompatManager.INSTANCE = r0
            return
    }

    private BackCompatManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public final <T> T getManager(android.content.Context r2, java.lang.String r3, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> r4) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "tag"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "manager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r2 = r4.invoke(r2)     // Catch: java.lang.NoClassDefFoundError -> L14
            return r2
        L14:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unable to find adservices code, check manifest for uses-library tag, versionS="
            r2.append(r4)
            androidx.privacysandbox.ads.adservices.internal.AdServicesInfo r4 = androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE
            int r4 = r4.extServicesVersionS()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
            r2 = 0
            return r2
    }
}
