package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zai implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.OnConnectionFailedListener zaa;

    zai(com.google.android.gms.common.api.internal.OnConnectionFailedListener r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.OnConnectionFailedListener r0 = r1.zaa
            r0.onConnectionFailed(r2)
            return
    }
}
