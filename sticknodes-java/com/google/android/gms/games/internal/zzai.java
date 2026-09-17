package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzai extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzai(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzr(int r1, java.lang.String r2) {
            r0 = this;
            if (r1 != 0) goto L8
            com.google.android.gms.tasks.TaskCompletionSource r1 = r0.zza
            r1.setResult(r2)
            return
        L8:
            com.google.android.gms.tasks.TaskCompletionSource r2 = r0.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r2, r1)
            return
    }
}
