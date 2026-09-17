package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbj extends com.google.android.gms.games.internal.zza {
    final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzbj(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzu(int r1, boolean r2) {
            r0 = this;
            if (r1 != 0) goto Lc
            com.google.android.gms.tasks.TaskCompletionSource r1 = r0.zza
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setResult(r2)
            return
        Lc:
            com.google.android.gms.tasks.TaskCompletionSource r2 = r0.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r2, r1)
            return
    }
}
