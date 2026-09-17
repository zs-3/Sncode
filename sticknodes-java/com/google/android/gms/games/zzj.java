package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public abstract class zzj extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl {
    public zzj(com.google.android.gms.common.api.GoogleApiClient r2) {
            r1 = this;
            com.google.android.gms.common.api.Api$ClientKey r0 = com.google.android.gms.games.Games.zza
            r1.<init>(r0, r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @com.google.android.gms.common.annotation.KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.common.api.Result r1 = (com.google.android.gms.common.api.Result) r1
            super.setResult(r1)
            return
    }
}
