package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class zab {
    public final java.util.Set zaa;

    public zab(java.util.Set r1) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            r0.zaa = r1
            return
    }
}
