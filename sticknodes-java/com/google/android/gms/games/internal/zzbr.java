package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
class zzbr extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zza;

    zzbr(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Holder must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r2 = (com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) r2
            r1.zza = r2
            return
    }

    final void zzw(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r0 = r1.zza
            r0.setResult(r2)
            return
    }
}
