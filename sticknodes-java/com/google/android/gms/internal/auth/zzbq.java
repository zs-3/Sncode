package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzbq extends com.google.android.gms.internal.auth.zzbi {
    final /* synthetic */ com.google.android.gms.auth.api.proxy.ProxyRequest zza;

    zzbq(com.google.android.gms.internal.auth.zzbt r1, com.google.android.gms.common.api.GoogleApiClient r2, com.google.android.gms.auth.api.proxy.ProxyRequest r3) {
            r0 = this;
            r0.zza = r3
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzbi
    protected final void zza(android.content.Context r2, com.google.android.gms.internal.auth.zzbh r3) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.auth.zzbp r2 = new com.google.android.gms.internal.auth.zzbp
            r2.<init>(r1)
            com.google.android.gms.auth.api.proxy.ProxyRequest r0 = r1.zza
            r3.zze(r2, r0)
            return
    }
}
