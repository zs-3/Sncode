package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzt extends com.google.android.gms.internal.games.zzab {
    final /* synthetic */ java.lang.String zza;

    zzt(com.google.android.gms.internal.games.zzac r1, java.lang.String r2, com.google.android.gms.common.api.GoogleApiClient r3, java.lang.String r4) {
            r0 = this;
            r0.zza = r4
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.games.internal.zzbz r2 = (com.google.android.gms.games.internal.zzbz) r2
            java.lang.String r0 = r1.zza
            r2.zzaZ(r1, r0)
            return
    }
}
