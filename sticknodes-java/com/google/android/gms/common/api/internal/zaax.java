package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public final class zaax implements com.google.android.gms.common.api.internal.zabf {
    private final com.google.android.gms.common.api.internal.zabi zaa;

    public zaax(com.google.android.gms.common.api.internal.zabi r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaa(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r1.zaa
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag
            java.util.Queue r0 = r0.zaa
            r0.add(r2)
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zab(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "GoogleApiClient is not connected yet."
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
            r2 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r2.zaa
            java.util.Map r0 = r0.zaa
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.Api$Client r1 = (com.google.android.gms.common.api.Api.Client) r1
            r1.disconnect()
            goto Lc
        L1c:
            com.google.android.gms.common.api.internal.zabi r0 = r2.zaa
            com.google.android.gms.common.api.internal.zabe r0 = r0.zag
            java.util.Set r1 = java.util.Collections.emptySet()
            r0.zad = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
            r1 = this;
            com.google.android.gms.common.api.internal.zabi r0 = r1.zaa
            r0.zaj()
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(android.os.Bundle r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(com.google.android.gms.common.ConnectionResult r1, com.google.android.gms.common.api.Api r2, boolean r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
            r1 = this;
            r0 = 1
            return r0
    }
}
