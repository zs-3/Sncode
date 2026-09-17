package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zaba implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zaa;

    zaba(com.google.android.gms.common.api.internal.zabe r1, com.google.android.gms.common.api.internal.StatusPendingResult r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r0 = 8
            r2.<init>(r0)
            com.google.android.gms.common.api.internal.StatusPendingResult r0 = r1.zaa
            r0.setResult(r2)
            return
    }
}
