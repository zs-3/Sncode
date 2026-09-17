package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzcv implements com.google.android.gms.common.api.internal.RemoteCall {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ java.lang.String zzb;
    public final /* synthetic */ java.lang.String zzc;

    public /* synthetic */ zzcv(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            java.lang.String r0 = r3.zza
            java.lang.String r1 = r3.zzb
            java.lang.String r2 = r3.zzc
            com.google.android.gms.games.internal.zzbz r4 = (com.google.android.gms.games.internal.zzbz) r4
            com.google.android.gms.tasks.TaskCompletionSource r5 = (com.google.android.gms.tasks.TaskCompletionSource) r5
            android.os.IInterface r4 = r4.getService()
            com.google.android.gms.games.internal.zzce r4 = (com.google.android.gms.games.internal.zzce) r4
            android.content.Intent r4 = r4.zzj(r0, r1, r2)
            r5.setResult(r4)
            return
    }
}
