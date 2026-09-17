package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbp extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzbp(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzm(com.google.android.gms.common.data.DataHolder r6) {
            r5 = this;
            int r0 = r6.getStatusCode()
            r1 = 3
            if (r0 == 0) goto L13
            if (r0 != r1) goto La
            goto L13
        La:
            com.google.android.gms.tasks.TaskCompletionSource r1 = r5.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r1, r0)
            r6.close()
            return
        L13:
            com.google.android.gms.games.PlayerBuffer r2 = new com.google.android.gms.games.PlayerBuffer
            r2.<init>(r6)
            int r6 = r2.getCount()     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            if (r6 <= 0) goto L29
            com.google.android.gms.games.Player r6 = r2.get(r3)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.games.PlayerEntity r4 = new com.google.android.gms.games.PlayerEntity     // Catch: java.lang.Throwable -> L3b
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3b
            goto L2a
        L29:
            r4 = 0
        L2a:
            r2.release()
            if (r0 != r1) goto L30
            r3 = 1
        L30:
            com.google.android.gms.tasks.TaskCompletionSource r6 = r5.zza
            com.google.android.gms.games.AnnotatedData r0 = new com.google.android.gms.games.AnnotatedData
            r0.<init>(r4, r3)
            r6.setResult(r0)
            return
        L3b:
            r6 = move-exception
            r2.release()
            throw r6
    }
}
