package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzag extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzag(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzp(com.google.android.gms.common.data.DataHolder r7) {
            r6 = this;
            int r0 = r7.getStatusCode()
            if (r0 == 0) goto Lf
            com.google.android.gms.tasks.TaskCompletionSource r1 = r6.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r1, r0)
            r7.close()
            return
        Lf:
            com.google.android.gms.games.snapshot.SnapshotMetadataBuffer r0 = new com.google.android.gms.games.snapshot.SnapshotMetadataBuffer
            r0.<init>(r7)
            r7 = 0
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L2f
            if (r1 <= 0) goto L25
            com.google.android.gms.games.snapshot.SnapshotMetadata r1 = r0.get(r7)     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r2 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            goto L26
        L25:
            r2 = 0
        L26:
            r0.close()
            com.google.android.gms.tasks.TaskCompletionSource r7 = r6.zza
            r7.setResult(r2)
            return
        L2f:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L34
            goto L4b
        L34:
            r0 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L4b
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r3[r7] = r4     // Catch: java.lang.Exception -> L4b
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch: java.lang.Exception -> L4b
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L4b
            r2[r7] = r0     // Catch: java.lang.Exception -> L4b
            r3.invoke(r1, r2)     // Catch: java.lang.Exception -> L4b
        L4b:
            throw r1
    }
}
