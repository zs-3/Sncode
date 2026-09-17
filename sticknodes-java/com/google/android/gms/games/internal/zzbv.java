package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzbv extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzbv(com.google.android.gms.tasks.TaskCompletionSource r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzq(com.google.android.gms.common.data.DataHolder r5, java.lang.String r6, com.google.android.gms.drive.Contents r7, com.google.android.gms.drive.Contents r8, com.google.android.gms.drive.Contents r9) {
            r4 = this;
            com.google.android.gms.games.snapshot.SnapshotMetadataBuffer r0 = new com.google.android.gms.games.snapshot.SnapshotMetadataBuffer
            r0.<init>(r5)
            int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L5b
            r1 = 2
            r2 = 0
            if (r5 < r1) goto L52
            if (r6 == 0) goto L52
            if (r9 != 0) goto L12
            goto L52
        L12:
            com.google.android.gms.games.snapshot.SnapshotEntity r5 = new com.google.android.gms.games.snapshot.SnapshotEntity     // Catch: java.lang.Throwable -> L5b
            r1 = 0
            com.google.android.gms.games.snapshot.SnapshotMetadata r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r3 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.games.snapshot.SnapshotContentsEntity r1 = new com.google.android.gms.games.snapshot.SnapshotContentsEntity     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L5b
            r5.<init>(r3, r1)     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.games.snapshot.SnapshotEntity r7 = new com.google.android.gms.games.snapshot.SnapshotEntity     // Catch: java.lang.Throwable -> L5b
            r1 = 1
            com.google.android.gms.games.snapshot.SnapshotMetadata r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r3 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.games.snapshot.SnapshotContentsEntity r1 = new com.google.android.gms.games.snapshot.SnapshotContentsEntity     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r3, r1)     // Catch: java.lang.Throwable -> L5b
            r0.close()
            com.google.android.gms.tasks.TaskCompletionSource r8 = r4.zza
            com.google.android.gms.games.SnapshotsClient$DataOrConflict r0 = new com.google.android.gms.games.SnapshotsClient$DataOrConflict
            com.google.android.gms.games.SnapshotsClient$SnapshotConflict r1 = new com.google.android.gms.games.SnapshotsClient$SnapshotConflict
            com.google.android.gms.games.snapshot.SnapshotContentsEntity r3 = new com.google.android.gms.games.snapshot.SnapshotContentsEntity
            r3.<init>(r9)
            r1.<init>(r5, r6, r7, r3)
            r0.<init>(r2, r1)
            r8.setResult(r0)
            return
        L52:
            com.google.android.gms.tasks.TaskCompletionSource r5 = r4.zza     // Catch: java.lang.Throwable -> L5b
            r5.setResult(r2)     // Catch: java.lang.Throwable -> L5b
            r0.close()
            return
        L5b:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L60
            goto L64
        L60:
            r6 = move-exception
            com.google.android.gms.games.internal.zzbu.zza(r5, r6)
        L64:
            throw r5
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzcb
    public final void zzs(com.google.android.gms.common.data.DataHolder r6, com.google.android.gms.drive.Contents r7) {
            r5 = this;
            int r0 = r6.getStatusCode()
            com.google.android.gms.games.snapshot.SnapshotMetadataBuffer r1 = new com.google.android.gms.games.snapshot.SnapshotMetadataBuffer
            r1.<init>(r6)
            int r6 = r1.getCount()     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            if (r6 <= 0) goto L25
            com.google.android.gms.games.snapshot.SnapshotEntity r6 = new com.google.android.gms.games.snapshot.SnapshotEntity     // Catch: java.lang.Throwable -> L5e
            r3 = 0
            com.google.android.gms.games.snapshot.SnapshotMetadata r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity r4 = new com.google.android.gms.games.snapshot.SnapshotMetadataEntity     // Catch: java.lang.Throwable -> L5e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.games.snapshot.SnapshotContentsEntity r3 = new com.google.android.gms.games.snapshot.SnapshotContentsEntity     // Catch: java.lang.Throwable -> L5e
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L5e
            r6.<init>(r4, r3)     // Catch: java.lang.Throwable -> L5e
            goto L26
        L25:
            r6 = r2
        L26:
            r1.close()
            if (r0 != 0) goto L36
            com.google.android.gms.tasks.TaskCompletionSource r7 = r5.zza
            com.google.android.gms.games.SnapshotsClient$DataOrConflict r0 = new com.google.android.gms.games.SnapshotsClient$DataOrConflict
            r0.<init>(r6, r2)
            r7.setResult(r0)
            return
        L36:
            r7 = 4002(0xfa2, float:5.608E-42)
            if (r0 != r7) goto L58
            if (r6 == 0) goto L56
            com.google.android.gms.games.snapshot.SnapshotMetadata r0 = r6.getMetadata()
            if (r0 != 0) goto L43
            goto L56
        L43:
            com.google.android.gms.tasks.TaskCompletionSource r0 = r5.zza
            com.google.android.gms.games.SnapshotsClient$SnapshotContentUnavailableApiException r1 = new com.google.android.gms.games.SnapshotsClient$SnapshotContentUnavailableApiException
            com.google.android.gms.common.api.Status r7 = com.google.android.gms.games.GamesStatusCodes.zza(r7)
            com.google.android.gms.games.snapshot.SnapshotMetadata r6 = r6.getMetadata()
            r1.<init>(r7, r6)
            r0.setException(r1)
            return
        L56:
            r0 = 4002(0xfa2, float:5.608E-42)
        L58:
            com.google.android.gms.tasks.TaskCompletionSource r6 = r5.zza
            com.google.android.gms.games.GamesStatusUtils.zza(r6, r0)
            return
        L5e:
            r6 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r7 = move-exception
            com.google.android.gms.games.internal.zzbu.zza(r6, r7)
        L67:
            throw r6
    }
}
