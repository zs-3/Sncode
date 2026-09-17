package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbo extends com.google.android.gms.games.internal.zza {
    final /* synthetic */ com.google.android.gms.games.internal.zzbz zza;
    private final com.google.android.gms.tasks.TaskCompletionSource zzb;

    zzbo(com.google.android.gms.games.internal.zzbz r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzg(com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.zzm(r1)
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzm(com.google.android.gms.common.data.DataHolder r5) {
            r4 = this;
            int r0 = r5.getStatusCode()
            r1 = 10003(0x2713, float:1.4017E-41)
            if (r0 != r1) goto L13
            com.google.android.gms.games.internal.zzbz r0 = r4.zza
            com.google.android.gms.tasks.TaskCompletionSource r1 = r4.zzb
            com.google.android.gms.games.internal.zzbz.zzL(r0, r1)
            r5.close()
            return
        L13:
            r1 = 3
            if (r0 != r1) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            if (r0 == 0) goto L26
            if (r1 != 0) goto L26
            com.google.android.gms.tasks.TaskCompletionSource r1 = r4.zzb
            com.google.android.gms.games.GamesStatusUtils.zza(r1, r0)
            r5.close()
            return
        L26:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r4.zzb
            com.google.android.gms.games.AnnotatedData r2 = new com.google.android.gms.games.AnnotatedData
            com.google.android.gms.games.PlayerBuffer r3 = new com.google.android.gms.games.PlayerBuffer
            r3.<init>(r5)
            r2.<init>(r3, r1)
            r0.setResult(r2)
            return
    }
}
