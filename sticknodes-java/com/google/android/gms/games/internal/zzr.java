package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzr extends com.google.android.gms.games.internal.zzay {
    final /* synthetic */ com.google.android.gms.games.internal.zzbq zza;

    zzr(com.google.android.gms.games.internal.zzbq r1) {
            r0 = this;
            r0.zza = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.games.internal.zzbq r0 = r1.zza
            r0.zza(r2)
            return
    }
}
