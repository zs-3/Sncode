package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzbn implements com.google.android.gms.common.api.internal.RemoteCall {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ boolean zze;

    public /* synthetic */ zzbn(java.lang.String r1, int r2, int r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            java.lang.String r2 = r7.zza
            int r3 = r7.zzb
            int r4 = r7.zzc
            int r5 = r7.zzd
            boolean r6 = r7.zze
            r0 = r8
            com.google.android.gms.games.internal.zzbz r0 = (com.google.android.gms.games.internal.zzbz) r0
            r1 = r9
            com.google.android.gms.tasks.TaskCompletionSource r1 = (com.google.android.gms.tasks.TaskCompletionSource) r1
            r0.zzay(r1, r2, r3, r4, r5, r6)
            return
    }
}
