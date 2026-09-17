package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
final class zzx implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks zza;

    zzx(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status r1) {
            r0 = this;
            com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks r1 = r0.zza
            r1.onSignOutComplete()
            return
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks r1 = r0.zza
            r1.onSignOutComplete()
            return
    }
}
