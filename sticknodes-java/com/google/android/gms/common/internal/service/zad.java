package com.google.android.gms.common.internal.service;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zad extends com.google.android.gms.common.internal.service.zaa {
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder zaa;

    public zad(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    public final void zab(int r2) throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2)
            com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder r2 = r1.zaa
            r2.setResult(r0)
            return
    }
}
