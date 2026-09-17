package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzaa extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzaa(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzb(int r2, java.lang.String r3) {
            r1 = this;
            r3 = 3003(0xbbb, float:4.208E-42)
            if (r2 == 0) goto Ld
            if (r2 != r3) goto L7
            goto Ld
        L7:
            com.google.android.gms.tasks.TaskCompletionSource r3 = r1.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r3, r2)
            return
        Ld:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zza
            if (r2 != r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setResult(r2)
            return
    }
}
