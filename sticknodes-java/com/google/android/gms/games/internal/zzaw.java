package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
class zzaw extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.common.api.internal.ListenerHolder zza;

    zzaw(com.google.android.gms.common.api.internal.ListenerHolder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Callback must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.internal.ListenerHolder r2 = (com.google.android.gms.common.api.internal.ListenerHolder) r2
            r1.zza = r2
            return
    }

    final void zzw(com.google.android.gms.games.internal.zzbq r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.ListenerHolder r0 = r2.zza
            int r1 = com.google.android.gms.games.internal.zzbz.zze
            com.google.android.gms.games.internal.zzr r1 = new com.google.android.gms.games.internal.zzr
            r1.<init>(r3)
            r0.notifyListener(r1)
            return
    }
}
