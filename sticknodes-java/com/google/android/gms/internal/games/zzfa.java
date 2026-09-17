package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzfa extends com.google.android.gms.internal.games.zzfd {
    final /* synthetic */ int zza;

    zzfa(com.google.android.gms.internal.games.zzfk r1, com.google.android.gms.common.api.GoogleApiClient r2, int r3) {
            r0 = this;
            r0.zza = r3
            r1 = 0
            r0.<init>(r2, r1)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.games.internal.zzbz r2 = (com.google.android.gms.games.internal.zzbz) r2
            int r0 = r1.zza
            r2.zzac(r1, r0)
            return
    }
}
