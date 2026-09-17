package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zaaz implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zab;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zac;

    zaaz(com.google.android.gms.common.api.internal.zabe r1, java.util.concurrent.atomic.AtomicReference r2, com.google.android.gms.common.api.internal.StatusPendingResult r3) {
            r0 = this;
            r0.zac = r1
            r0.zaa = r2
            r0.zab = r3
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r4 = r3.zaa
            java.lang.Object r4 = r4.get()
            com.google.android.gms.common.api.GoogleApiClient r4 = (com.google.android.gms.common.api.GoogleApiClient) r4
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.api.GoogleApiClient r4 = (com.google.android.gms.common.api.GoogleApiClient) r4
            com.google.android.gms.common.api.internal.StatusPendingResult r0 = r3.zab
            com.google.android.gms.common.api.internal.zabe r1 = r3.zac
            r2 = 1
            com.google.android.gms.common.api.internal.zabe.zah(r1, r4, r0, r2)
            return
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int r1) {
            r0 = this;
            return
    }
}
