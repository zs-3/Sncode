package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzcu implements com.google.android.gms.common.api.internal.RemoteCall {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzcu(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            java.lang.String r0 = r2.zza
            boolean r1 = r2.zzb
            com.google.android.gms.games.internal.zzbz r3 = (com.google.android.gms.games.internal.zzbz) r3
            com.google.android.gms.tasks.TaskCompletionSource r4 = (com.google.android.gms.tasks.TaskCompletionSource) r4
            r3.zzaw(r4, r0, r1)
            return
    }
}
