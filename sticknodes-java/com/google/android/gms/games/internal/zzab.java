package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzab extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzab(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzb(int r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto Lc
            r2 = 3003(0xbbb, float:4.208E-42)
            if (r1 == r2) goto Lc
            com.google.android.gms.tasks.TaskCompletionSource r2 = r0.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r2, r1)
            return
        Lc:
            com.google.android.gms.tasks.TaskCompletionSource r1 = r0.zza
            r2 = 0
            r1.setResult(r2)
            return
    }
}
