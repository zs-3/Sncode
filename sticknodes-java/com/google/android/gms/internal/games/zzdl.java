package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzdl implements com.google.android.gms.common.api.internal.RemoteCall {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ java.lang.String zzb;
    public final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotMetadataChange zzc;
    public final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotContents zzd;

    public /* synthetic */ zzdl(java.lang.String r1, java.lang.String r2, com.google.android.gms.games.snapshot.SnapshotMetadataChange r3, com.google.android.gms.games.snapshot.SnapshotContents r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            java.lang.String r2 = r6.zza
            java.lang.String r3 = r6.zzb
            com.google.android.gms.games.snapshot.SnapshotMetadataChange r4 = r6.zzc
            com.google.android.gms.games.snapshot.SnapshotContents r5 = r6.zzd
            r0 = r7
            com.google.android.gms.games.internal.zzbz r0 = (com.google.android.gms.games.internal.zzbz) r0
            r1 = r8
            com.google.android.gms.tasks.TaskCompletionSource r1 = (com.google.android.gms.tasks.TaskCompletionSource) r1
            r0.zzaN(r1, r2, r3, r4, r5)
            return
    }
}
